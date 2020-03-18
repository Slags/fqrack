package com.fqcoder.fqrack.model;

import lombok.Data;

import java.util.List;

/**
 * @Created by FqCoder
 * @Date 2020/2/14 下午9:43
 * @Description 权限表
 */
@Data
public class SysPermission  {
    private Integer id;

    private Integer parentId;//父id 默认为0 一级

    private String name;//名字

    private String icon;//图标

    private String url;//链接

    private Integer type;//类型

    private String permission;//权限

    private Integer sort;//排序

}
