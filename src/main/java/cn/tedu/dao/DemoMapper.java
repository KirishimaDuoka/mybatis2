package cn.tedu.dao;

import org.apache.ibatis.annotations.Select;

/**
 * 关于数据访问接口, 行业中有很多习惯
 * 有些企业使用 xxxMapper
 * 有些企业使用 xxxDao
 */
public interface DemoMapper {
    @Select("select 'Hello World!'")
    String demo();
}
