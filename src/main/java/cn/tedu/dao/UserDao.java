package cn.tedu.dao;

import org.apache.ibatis.annotations.Select;
public interface UserDao {
    /**
     * @Select 定义了hello方法时候执行对应查询的语句:
     * MyBatis会自动利用JDBC执行SQL语句 select 'Hello MyBatis!'
     * 自动的将返回值作为hello()方法的返回值,
     * 如果执行 hello() 方法返回了 'Hello MyBatis!' 就说明
     * MyBatis能够将接口方法和SQL自动绑定, 自动利用JDBC执行SQL语句
     * 自动将SQL结果作为方法的返回值
     * @return SQL语句的执行结果
     */
    @Select("select 'Hello MyBatis!'")
    String hello();
}
