package com.study.mapper;

import com.study.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

/**
 * @program: SpringStudy
 * @description:
 * @author: JJGGu
 * @create: 2020-05-26 22:19
 **/
public class UserMapperImpl implements UserMapper{

    private SqlSessionTemplate sqlSession;

    public UserMapperImpl(SqlSessionTemplate sqlSession) {
        this.sqlSession = sqlSession;
    }

    public List<User> getUsers() {
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        return mapper.getUsers();
    }
}
