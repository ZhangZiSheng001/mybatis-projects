package cn.zzs.mybatis.entity;

import java.util.Collection;
import java.util.Date;

import lombok.Data;

@Data
public class Employee {

    private String id;

    private String name;

    private Integer gender;

    private String no;

    private String password;

    private String phone;

    private String address;

    private Integer status;

    private Integer deleted;

    private String departmentId;

    private Date gmtCreate;
    
    private Date gmtModified;
    
    private Department department;
    
    private Collection<Role> roles;

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Employee [id=");
        builder.append(id);
        builder.append(", name=");
        builder.append(name);
        builder.append(", gender=");
        builder.append(gender);
        builder.append(", no=");
        builder.append(no);
        builder.append(", password=");
        builder.append(password);
        builder.append(", phone=");
        builder.append(phone);
        builder.append(", address=");
        builder.append(address);
        builder.append(", status=");
        builder.append(status);
        builder.append(", deleted=");
        builder.append(deleted);
        builder.append(", departmentId=");
        builder.append(departmentId);
        builder.append(", gmtCreate=");
        builder.append(gmtCreate);
        builder.append(", gmtModified=");
        builder.append(gmtModified);
        builder.append("]");
        return builder.toString();
    }
    

}