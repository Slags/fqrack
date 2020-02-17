package com.fqcoder.fqrack.model;

import lombok.Data;

/**
 * @Created by FqCoder
 * @Date 2020/2/14 下午10:00
 * @Description 角色权限关联表
 */
@Data
public class RolePermission {

    private Integer roleId;

    private Integer permissionId;
}
