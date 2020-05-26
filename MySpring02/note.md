## applicationContext 配置
```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xmlns:context="http://www.springframework.org/schema/context"
       xsi:schemaLocation="http://www.springframework.org/schema/beans
        https://www.springframework.org/schema/beans/spring-beans.xsd
        http://www.springframework.org/schema/context
        https://www.springframework.org/schema/context/spring-context.xsd">

    <context:annotation-config/>

</beans>
```
## 注解说明
- @Autowired :自动装配通过类型、名字，如果不能唯一自动装配，则需要使用@Qualifier(value="xxx")
- @Nullable  :字段标记这个注解说明可以为空
- @Resource  :自动装配通过名字、类型。