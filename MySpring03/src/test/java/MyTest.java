import com.study.service.Service;
import com.study.service.ServiceImpl;
import com.sun.org.apache.xpath.internal.CachedXPathAPI;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @program: SpringStudy
 * @description:
 * @author: JJGGu
 * @create: 2020-05-26 17:28
 **/
public class MyTest {

    @Test
    public void myTest(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Service service = (Service) context.getBean("service");
        service.add();

    }

}
