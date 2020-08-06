package cn.tedu.dao;

import cn.tedu.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface UserMapper {
    /**
     * #{username} 是 user 类属性, 也就是与User属性同名
     */
//    @Insert("insert into user " +
//            "(username, password, age, phone, email) " +
//            "values (#{username}, #{password}, #{age}, " +
//            "#{phone}, #{email})")
    @Insert({"insert into user",
            "(username, password, age, phone, email) ",
            "values ",
            "(#{username},#{password},#{age},#{phone},#{email})"})
    int insertUser(User user);

    @Update({"UPDATE user",
            "SET",
            "username=#{username},",
            "password=#{password},",
            "age=#{age},",
            "phone=#{phone},",
            "email=#{email}",
            "WHERE id=#{id}"})
    int updateUser(User user);

    /**
     * 根据ID更新密码
     */
    @Update("UPDATE user " +
            "SET password=#{password} WHERE id=#{id}")
    public int updatePassword(
            @Param("id") Integer id,
            @Param("password") String password);

    @Delete("DELETE FROM user WHERE id=#{id}")
    int deleteUser(Integer id);

    @Select("SELECT * FROM user")
    List<User> getAllUsers();

    @Select("SELECT * FROM user WHERE age<#{age}")
    List<User> getUsersByAge(Integer age);

    @Select("SELECT * FROM user WHERE username=#{username}")
    User getUserByUsername(String username);

}


