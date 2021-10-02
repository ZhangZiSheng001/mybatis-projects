package cn.zzs.mybatis.entity;

import java.util.Date;

import lombok.Data;

@Data
public class Role {

    private String id;

    private String name;

    private Integer general;

    private Integer deleted;

    private Date gmtCreate;

    private Date gmtModified;
}