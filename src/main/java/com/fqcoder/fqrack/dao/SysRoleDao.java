package com.fqcoder.fqrack.dao;

import com.fqcoder.fqrack.model.SysRole;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Created by FqCoder
 * @Date 2020/2/18 上午11:36
 * @Description 角色接口类
 */
public interface SysRoleDao {

    @Insert("insert into sys_role(roleName,description,createTime,updateTime) values(#{roleName},#{description},now(),now())")
    int addRole(SysRole role);

    @Select("select * from sys_role")
    List<SysRole> queryAll();

    @Delete("delete sys_role where id=#{id}")
    int deleteRoleById(Integer id);
}
