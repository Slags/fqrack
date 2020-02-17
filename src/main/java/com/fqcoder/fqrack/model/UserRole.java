package com.fqcoder.fqrack.model;

import lombok.Data;

/**
 * @Created by FqCoder
 * @Date 2020/2/14 下午9:42
 * @Description 用户和角色关联
 */
@Data
public class UserRole{

    private Integer userId;

    private Integer roleId;

}
