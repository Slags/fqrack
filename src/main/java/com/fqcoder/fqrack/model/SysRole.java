package com.fqcoder.fqrack.model;

import com.fqcoder.fqopen.model.base.BaseEntity;
import lombok.Data;

/**
 * @Created by FqCoder
 * @Date 2020/2/14 下午9:40
 * @Description 角色表
 */
@Data
public class SysRole extends BaseEntity {

    private String roleName;//角色名称

    private String description;//角色描述
}
