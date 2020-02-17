package com.fqcoder.fqrack.model;

import com.fqcoder.fqopen.model.base.BaseEntity;
import lombok.Data;

import java.util.List;

/**
 * @Created by FqCoder
 * @Date 2020/2/14 下午9:43
 * @Description 权限表
 */
@Data
public class SysPermission extends BaseEntity {

    private Integer parentId;//父id 默认为0 一级

    private String name;

    private String href;

    private Integer type;

    private String permission;

    private Integer sort;//排序

    private List<SysPermission> child;


}
