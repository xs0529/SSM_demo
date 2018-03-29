import com.alibaba.fastjson.JSON;
import com.xie.dao.ArticleEntityMapper;
import com.xie.dao.ClassEntityMapper;
import com.xie.entity.ArticleEntity;
import com.xie.entity.ClassEntity;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockHttpSession;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.apache.log4j.Logger;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import java.util.Date;
import java.util.Stack;
import java.util.UUID;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * @author 谢霜
 * @Description
 * @date 2018/3/27 10:49
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml","classpath:spring-mvc.xml"})
public class ArticleTest {
    private static Logger  logger = Logger.getLogger(ArticleTest.class);//使用log4j打印日志
    @Autowired
    private WebApplicationContext wac;
    private MockMvc mockMvc;
    private MockHttpSession session;
    @Autowired
    private ArticleEntityMapper articleEntityMapper;
    @Autowired
    private ClassEntityMapper classEntityMapper;
    @Before
    public void setup() {
        // init applicationContext
        mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();
    }
    @Test
    public void articleMvcTest(){
        MockHttpServletRequestBuilder mockHttpServletRequestBuilder = get( "/blog/article" );
        mockHttpServletRequestBuilder.param( "pageNumber", "2" ).param( "count", "15" );
        try {
            MvcResult mvcResult = this.mockMvc.perform(get("/blog/article")
                    .param("pageNumber","2")
                    .param("count","15").param("classification","2")
                    ).andExpect(status().isOk())
                    .andDo(print())
                    .andReturn();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    /*
     * @author 谢霜
     * @Description 新增博文测试
     * @params  * @param
     * @return void
     * @date 2018/3/27 16:58
     */
    @Test
    public void addArticleTest(){
        ArticleEntity articleEntity = new ArticleEntity();
        articleEntity.setArticleBody("dididididiiddi");
        articleEntity.setArticleCtime(new Date());
        articleEntity.setArticleImage("我是地址");
        articleEntity.setArticleMtime(new Date());
        articleEntity.setArticleReading(100l);
        articleEntity.setArticleState("测试");
        articleEntity.setArticleTag("666");
        articleEntity.setArticleTitle("测试");
        articleEntity.setClassificationId(100);
        ClassEntity classEntity = new ClassEntity();
        classEntity.setClassificationCtime(new Date());
        classEntity.setClassificationMtime(new Date());
        classEntity.setClassificationName("JAVA");
        classEntityMapper.insertSelective(classEntity);
        for (int i=0;i<20;i++){
            UUID uuid = UUID.randomUUID();
            articleEntity.setArticleTitle("JAVA"+uuid);
            articleEntity.setArticleTag("java");
            articleEntity.setClassificationId(1);
            articleEntityMapper.insertSelective(articleEntity);
        }
        System.out.println("JAVA class success");
        classEntity.setClassificationName("WEB");
        classEntityMapper.insertSelective(classEntity);
        for (int i=0;i<20;i++){
            UUID uuid = UUID.randomUUID();
            articleEntity.setArticleTitle("WEB"+uuid);
            articleEntity.setArticleTag("web");
            articleEntity.setClassificationId(2);
            articleEntityMapper.insertSelective(articleEntity);
        }
        System.out.println("WEB class success");
        classEntity.setClassificationName("MYSQL");
        classEntityMapper.insertSelective(classEntity);
        for (int i=0;i<20;i++){
            UUID uuid = UUID.randomUUID();
            articleEntity.setArticleTitle("MYSQL"+uuid);
            articleEntity.setArticleTag("mysql");
            articleEntity.setClassificationId(3);
            articleEntityMapper.insertSelective(articleEntity);
        }
        System.out.println("MYSQL class success");
        classEntity.setClassificationName("SPRING");
        classEntityMapper.insertSelective(classEntity);
        for (int i=0;i<20;i++){
            UUID uuid = UUID.randomUUID();
            articleEntity.setArticleTitle("SPRING"+uuid);
            articleEntity.setArticleTag("spring");
            articleEntity.setClassificationId(4);
            articleEntityMapper.insertSelective(articleEntity);
        }
        System.out.println("SPRING class success");
        classEntity.setClassificationName("NGINX");
        classEntityMapper.insertSelective(classEntity);
        for (int i=0;i<20;i++){
            UUID uuid = UUID.randomUUID();
            articleEntity.setArticleTitle("NGINX"+uuid);
            articleEntity.setArticleTag("nginx");
            articleEntity.setClassificationId(5);
            articleEntityMapper.insertSelective(articleEntity);
        }
        System.out.println("NGINX class success");
    }
    /*
     * @author 谢霜
     * @Description 查询博文测试
     * @params  * @param
     * @return void
     * @date 2018/3/27 16:59
     */
    @Test
    public void selectArticleById(){
        System.out.println(JSON.toJSON(articleEntityMapper.selectByPrimaryKey(1l)));
    }
    /*
     * @author 谢霜
     * @Description 修改博文
     * @params  * @param
     * @return void
     * @date 2018/3/27 17:02
     */
    @Test
    public void putArticle(){
        ArticleEntity articleEntity = articleEntityMapper.selectByPrimaryKey(1l);
        articleEntity.setArticleTitle("修改后的标题");
        articleEntityMapper.updateByPrimaryKey(articleEntity);
        System.out.println(JSON.toJSON(articleEntityMapper.selectByPrimaryKey(1l)));
    }
}
