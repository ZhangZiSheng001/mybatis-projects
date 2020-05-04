package cn.zzs.mybatis.entity;

import java.util.Date;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

@TableName("demo_employee")
public class Employee {
    
    private String id;
    
    @TableField("`name`")
    private String name;

    private Boolean gender;
    
    @TableField("`no`")
    private String no;
    
    @TableField("`password`")
    private String password;

    private String phone;

    private String address;

    @TableField("`status`")
    private Byte status;

    private Boolean deleted;
    
    @TableField("department_id")
    private String departmentId;
    
    private Date gmtCreate;
    
    private Date gmtModified;
    
    public Employee(String id, String name, Boolean gender, String no, String password, String phone, String address, Byte status, Boolean deleted, String departmentId, Date gmtCreate, Date gmtModified) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.no = no;
        this.password = password;
        this.phone = phone;
        this.address = address;
        this.status = status;
        this.deleted = deleted;
        this.departmentId = departmentId;
        this.gmtCreate = gmtCreate;
        this.gmtModified = gmtModified;
    }

    public Employee() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Boolean getGender() {
        return gender;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no == null ? null : no.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId == null ? null : departmentId.trim();
    }

    
    public Date getGmtCreate() {
        return gmtCreate;
    }

    
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    
    public Date getGmtModified() {
        return gmtModified;
    }

    
    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }


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

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((address == null) ? 0 : address.hashCode());
        result = prime * result + ((deleted == null) ? 0 : deleted.hashCode());
        result = prime * result + ((departmentId == null) ? 0 : departmentId.hashCode());
        result = prime * result + ((gender == null) ? 0 : gender.hashCode());
        result = prime * result + ((gmtCreate == null) ? 0 : gmtCreate.hashCode());
        result = prime * result + ((gmtModified == null) ? 0 : gmtModified.hashCode());
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((no == null) ? 0 : no.hashCode());
        result = prime * result + ((password == null) ? 0 : password.hashCode());
        result = prime * result + ((phone == null) ? 0 : phone.hashCode());
        result = prime * result + ((status == null) ? 0 : status.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj)
            return true;
        if(obj == null)
            return false;
        if(getClass() != obj.getClass())
            return false;
        Employee other = (Employee)obj;
        if(address == null) {
            if(other.address != null)
                return false;
        } else if(!address.equals(other.address))
            return false;
        if(deleted == null) {
            if(other.deleted != null)
                return false;
        } else if(!deleted.equals(other.deleted))
            return false;
        if(departmentId == null) {
            if(other.departmentId != null)
                return false;
        } else if(!departmentId.equals(other.departmentId))
            return false;
        if(gender == null) {
            if(other.gender != null)
                return false;
        } else if(!gender.equals(other.gender))
            return false;
        if(gmtCreate == null) {
            if(other.gmtCreate != null)
                return false;
        } else if(!gmtCreate.equals(other.gmtCreate))
            return false;
        if(gmtModified == null) {
            if(other.gmtModified != null)
                return false;
        } else if(!gmtModified.equals(other.gmtModified))
            return false;
        if(id == null) {
            if(other.id != null)
                return false;
        } else if(!id.equals(other.id))
            return false;
        if(name == null) {
            if(other.name != null)
                return false;
        } else if(!name.equals(other.name))
            return false;
        if(no == null) {
            if(other.no != null)
                return false;
        } else if(!no.equals(other.no))
            return false;
        if(password == null) {
            if(other.password != null)
                return false;
        } else if(!password.equals(other.password))
            return false;
        if(phone == null) {
            if(other.phone != null)
                return false;
        } else if(!phone.equals(other.phone))
            return false;
        if(status == null) {
            if(other.status != null)
                return false;
        } else if(!status.equals(other.status))
            return false;
        return true;
    }
    
    
}