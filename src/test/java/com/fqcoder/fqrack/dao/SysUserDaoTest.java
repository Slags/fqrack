package com.fqcoder.fqrack.dao;

import com.fqcoder.fqrack.Base;
import com.fqcoder.fqrack.model.SysUser;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.List;

/**
 * @Created by FqCoder
 * @Date 2020/2/18 上午11:22
 * @Description TODO
 */
public class SysUserDaoTest extends Base {

    @Autowired
    SysUserDao userDao;

    @Test
    public void testQuery(){
        List<SysUser> list=userDao.queryAll();
        for (SysUser user: list){
            System.out.println(user);
        }
    }

    @Test
    public void testAdd(){
        SysUser user=new SysUser();
        user.setUsername("fqcoder");
        user.setPassword("123123");
        user.setStatus(1);
        user.setCreateTime(new Date());
        user.setUpdateTime(new Date());
        System.out.println(userDao.save(user));
    }
}
