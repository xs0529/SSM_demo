import com.alibaba.fastjson.JSON;
import com.xie.dao.ArticleEntityMapper;
import com.xie.entity.ArticleEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.apache.log4j.Logger;

import java.util.Date;

/**
 * @author 谢霜
 * @Description
 * @date 2018/3/27 10:49
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})
public class ArticleTest {
    private static Logger  logger = Logger.getLogger(ArticleTest.class);//使用log4j打印日志
    @Autowired
    private ArticleEntityMapper articleEntityMapper;
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
        System.out.println(articleEntityMapper.insertSelective(articleEntity));
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
