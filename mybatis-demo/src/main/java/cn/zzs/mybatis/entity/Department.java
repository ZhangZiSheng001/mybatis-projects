package cn.zzs.mybatis.entity;

import java.util.Date;

import lombok.Data;

@Data
public class Department {

    private String id;

    private String no;

    private String parentId;

    private String name;

    private String type;

    private Integer deleted;

    private Date gmtCreate;

    private Date gmtModified;

}