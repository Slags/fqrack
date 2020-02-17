package com.fqcoder.fqrack.model.base;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @Created by FqCoder
 * @Date 2020/2/14 下午8:59
 * @Description 抽取所有pojo的共性
 */
@Data
public abstract class BaseEntity implements Serializable {

    private Integer id;

    @JsonFormat(pattern = "yyyy-MM-dd  HH:mm:ss")
    private Date createDate=new Date();

    @JsonFormat(pattern = "yyyy-MM-dd  HH:mm:ss")
    private Date updateDate=new Date();
}
