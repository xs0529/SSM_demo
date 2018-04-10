import com.xie.util.SendMailUtil;
import org.junit.Test;

import javax.mail.MessagingException;

public class MailSendTest {
    @Test
    public void mailTest() throws MessagingException {
        SendMailUtil.sendMail("1312544013@qq.com","一个测试的邮件啦","asd");
    }
}