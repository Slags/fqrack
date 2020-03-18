package com.fqcoder.fqrack.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

/**
 * @Created by FqCoder
 * @Date 2020/2/14 下午9:40
 * @Description 角色表
 */
@Data
public class SysRole{
    private Integer id;

    @JsonFormat(pattern = "yyyy-MM-dd  HH:mm:ss")
    private Date createTime;

    @JsonFormat(pattern = "yyyy-MM-dd  HH:mm:ss")
    private Date updateTime;

    private String roleName;//角色名称

    private String description;//角色描述
}
