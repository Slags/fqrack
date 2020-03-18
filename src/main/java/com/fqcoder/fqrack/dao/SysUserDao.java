package com.fqcoder.fqrack.dao;

import com.fqcoder.fqrack.model.SysUser;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * @Created by FqCoder
 * @Date 2020/2/17 下午5:23
 * @Description 用户dao接口
 */
public interface SysUserDao {

    @Select("select * from sys_user")
    List<SysUser> queryAll();

    @Select("select * from sys_user where username=#{username}")
    SysUser selectByName(String username);

    @Delete("delete from sys_user where id=#{id}")
    Integer deleteById(Integer id);

    int save(SysUser user);

    int update(SysUser user);

    @Update("update sys_user set password=#{password} where id=#{id}")
    int changePassword(Integer id,String password);




}
