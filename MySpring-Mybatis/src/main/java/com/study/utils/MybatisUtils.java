package com.study.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * @program: SpringStudy
 * @description:
 * @author: JJGGu
 * @create: 2020-05-26 21:02
 **/
public class MybatisUtils {
    static SqlSessionFactory sqlSessionFactory;
    static{
        try{
            String resource = "mybatis-config.xml";
            InputStream inputStream = Resources.getResourceAsStream(resource);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        }catch (Exception e){
            e.printStackTrace();
        }
    }
    static public SqlSession getSqlSession(){
        return sqlSessionFactory.openSession();
    }



}
