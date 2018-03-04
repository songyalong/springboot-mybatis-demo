package com.winter.mapper;

import com.winter.model.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    List<User> selectAllUser();
    User findUserByUserNamePWD(@Param("username")String username, @Param("password") String password);
    User findUserByUserId(@Param("userId") Integer userId);
}