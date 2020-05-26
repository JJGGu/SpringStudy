import com.study.MyConfig;
import com.study.pojo.Cat;
import com.study.pojo.People;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @program: SpringStudy
 * @description:
 * @author: JJGGu
 * @create: 2020-05-26 09:38
 **/
public class MyTest {
    @Test
    public void mytest(){
//        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//        People people = (People)context.getBean("people");
//        people.bark();

        //不使用xml文件配置bean
        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        Cat cat = (Cat)context.getBean("getCat");
        cat.bark();

    }
}
