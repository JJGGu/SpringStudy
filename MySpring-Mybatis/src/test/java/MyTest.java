import com.study.mapper.UserMapper;
import com.study.mapper.UserMapperImpl;
import com.study.pojo.User;
import com.study.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @program: SpringStudy
 * @description:
 * @author: JJGGu
 * @create: 2020-05-26 21:01
 **/
public class MyTest {

    @Test
    public void doTest(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapperImpl userMapperImpl = context.getBean("userImpl", UserMapperImpl.class);
        for (User user : userMapperImpl.getUsers()) {
            System.out.println(user);
        }
    }
}
