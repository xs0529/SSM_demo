import com.xie.dao.ArticleEntityMapper;
import com.xie.dao.ClassEntityMapper;
import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockHttpSession;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * @author 谢霜
 * @Description
 * @date 2018/4/10 13:43
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml","classpath:spring-mvc.xml"})
public class GetIpTest {
    private static Logger logger = Logger.getLogger(ArticleTest.class);//使用log4j打印日志
    @Autowired
    private WebApplicationContext wac;
    private MockMvc mockMvc;
    private MockHttpSession session;

    @Before
    public void setup() {
        // init applicationContext
        mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();
    }
    @Test
    public void getIpTest(){
        try {
            MvcResult mvcResult = this.mockMvc.perform(get("/blog/record")//url
            ).andExpect(status().isOk())//andExpect为结果断言，isOk代表的是返回正常也就是http的200
                    .andDo(print())//andDo为执行后操作，本例的print为打印出结果
                    .andReturn();//return返回结果，可以对结果进一步操作
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
