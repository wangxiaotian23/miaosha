package com.imooc.miaosha.dao;

import com.imooc.miaosha.domain.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @Auther: 李清依
 * @Date: 2019/10/7 12:08
 * @Description:
 */
@Mapper
public interface UserDao {
    @Select("select * from user where id=#{id}")
    public User getById(@Param("id") int id);
    @Insert("insert into user(id,name) values(#{id},#{name})")
    void insert(User user);

}
