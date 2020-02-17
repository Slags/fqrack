package com.fqcoder.fqrack.model;

import com.fqcoder.fqopen.model.base.BaseEntity;
import lombok.Data;

import java.util.Date;

/**
 * @Created by FqCoder
 * @Date 2020/2/14 下午9:23
 * @Description TODO
 */
@Data
public class SysUser extends BaseEntity {

    private String username;

    private String password;

    private String nickname;//昵称

    private String headImgUrl;

    private String telephone;

    private String email;

    private Date birthday;

    private Integer sex;

    private Integer status;

    private String info;
}
