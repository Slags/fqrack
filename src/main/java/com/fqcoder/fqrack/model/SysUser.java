package com.fqcoder.fqrack.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @Created by FqCoder
 * @Date 2020/2/14 下午9:23
 * @Description TODO
 */
@Data
public class SysUser implements Serializable {
    private Integer id;

    @JsonFormat(pattern = "yyyy-MM-dd  HH:mm:ss")
    private Date createTime;

    @JsonFormat(pattern = "yyyy-MM-dd  HH:mm:ss")
    private Date updateTime;

    private String username;

    private String password;

    private String nickname;//昵称

    private String headImgUrl;

    private String telephone;

    private String email;

    private Date birthday;

    private Integer sex;

    private Integer status;

}
