package cn.zzs.mybatis.entity;

import java.util.Date;

/**
 * 
 * @author zzs
 * @date 2021-03-21 14:17:57
 */
public class EmployeeVO {
    /**
     * 员工id
     */
    private String id;

    /**
     * 员工姓名
     */
    private String name;

    /**
     * 员工性别 0表示女，1表示男
     */
    private Boolean gender;

    /**
     * 员工工号
     */
    private String no;

    /**
     * 员工密码
     */
    private String password;

    /**
     * 员工手机电话
     */
    private String phone;

    /**
     * 员工住址
     */
    private String address;

    /**
     * 员工状态 0为禁用,1为启用,2为冻结
     */
    private Byte status;

    /**
     * 记录是否已删除
     */
    private Boolean deleted;

    /**
     * 员工所属部门id
     */
    private String departmentId;

    /**
     * 记录创建时间
     */
    private Date gmtCreate;

    /**
     * 记录更新时间
     */
    private Date gmtModified;
    
    /**
     * 部门名称
     */
    private String departmentName;

    
    public String getId() {
        return id;
    }

    
    public void setId(String id) {
        this.id = id;
    }

    
    public String getName() {
        return name;
    }

    
    public void setName(String name) {
        this.name = name;
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
        this.no = no;
    }

    
    public String getPassword() {
        return password;
    }

    
    public void setPassword(String password) {
        this.password = password;
    }

    
    public String getPhone() {
        return phone;
    }

    
    public void setPhone(String phone) {
        this.phone = phone;
    }

    
    public String getAddress() {
        return address;
    }

    
    public void setAddress(String address) {
        this.address = address;
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
        this.departmentId = departmentId;
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

    
    public String getDepartmentName() {
        return departmentName;
    }

    
    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((address == null) ? 0 : address.hashCode());
        result = prime * result + ((deleted == null) ? 0 : deleted.hashCode());
        result = prime * result + ((departmentId == null) ? 0 : departmentId.hashCode());
        result = prime * result + ((departmentName == null) ? 0 : departmentName.hashCode());
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
        EmployeeVO other = (EmployeeVO)obj;
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
        if(departmentName == null) {
            if(other.departmentName != null)
                return false;
        } else if(!departmentName.equals(other.departmentName))
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


    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("EmployeeVO [id=");
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
        builder.append(", departmentName=");
        builder.append(departmentName);
        builder.append("]");
        return builder.toString();
    }
    

}