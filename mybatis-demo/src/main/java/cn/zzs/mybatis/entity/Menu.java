package cn.zzs.mybatis.entity;

import java.util.Date;

import lombok.Data;

@Data
public class Menu {

    private String id;

    private String parentId;

    private String name;

    private Integer order;

    private String url;

    private Integer parent;

    private Integer deleted;

    private Date gmtCreate;

    private Date gmtModified;

}