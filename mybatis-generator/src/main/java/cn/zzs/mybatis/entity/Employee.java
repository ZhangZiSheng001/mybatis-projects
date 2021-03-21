package cn.zzs.mybatis.entity;

import java.util.Date;

/**
 * 
 * @author zzs
 * @date 2021-03-21 14:17:57
 */
public class Employee {
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
     * @return String
     */
    public String getId() {
        return id;
    }

    /**
     * @param id
     * @return Employee
     */
    public Employee withId(String id) {
        this.setId(id);
        return this;
    }

    /**
     * @param id
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * @return String
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     * @return Employee
     */
    public Employee withName(String name) {
        this.setName(name);
        return this;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * @return Boolean
     */
    public Boolean getGender() {
        return gender;
    }

    /**
     * @param gender
     * @return Employee
     */
    public Employee withGender(Boolean gender) {
        this.setGender(gender);
        return this;
    }

    /**
     * @param gender
     */
    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    /**
     * @return String
     */
    public String getNo() {
        return no;
    }

    /**
     * @param no
     * @return Employee
     */
    public Employee withNo(String no) {
        this.setNo(no);
        return this;
    }

    /**
     * @param no
     */
    public void setNo(String no) {
        this.no = no == null ? null : no.trim();
    }

    /**
     * @return String
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password
     * @return Employee
     */
    public Employee withPassword(String password) {
        this.setPassword(password);
        return this;
    }

    /**
     * @param password
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * @return String
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone
     * @return Employee
     */
    public Employee withPhone(String phone) {
        this.setPhone(phone);
        return this;
    }

    /**
     * @param phone
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * @return String
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address
     * @return Employee
     */
    public Employee withAddress(String address) {
        this.setAddress(address);
        return this;
    }

    /**
     * @param address
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * @return Byte
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * @param status
     * @return Employee
     */
    public Employee withStatus(Byte status) {
        this.setStatus(status);
        return this;
    }

    /**
     * @param status
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * @return Boolean
     */
    public Boolean getDeleted() {
        return deleted;
    }

    /**
     * @param deleted
     * @return Employee
     */
    public Employee withDeleted(Boolean deleted) {
        this.setDeleted(deleted);
        return this;
    }

    /**
     * @param deleted
     */
    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    /**
     * @return String
     */
    public String getDepartmentId() {
        return departmentId;
    }

    /**
     * @param departmentId
     * @return Employee
     */
    public Employee withDepartmentId(String departmentId) {
        this.setDepartmentId(departmentId);
        return this;
    }

    /**
     * @param departmentId
     */
    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId == null ? null : departmentId.trim();
    }

    /**
     * @return Date
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * @param gmtCreate
     * @return Employee
     */
    public Employee withGmtCreate(Date gmtCreate) {
        this.setGmtCreate(gmtCreate);
        return this;
    }

    /**
     * @param gmtCreate
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * @return Date
     */
    public Date getGmtModified() {
        return gmtModified;
    }

    /**
     * @param gmtModified
     * @return Employee
     */
    public Employee withGmtModified(Date gmtModified) {
        this.setGmtModified(gmtModified);
        return this;
    }

    /**
     * @param gmtModified
     */
    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    /**
     * @param that
     * @return boolean
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Employee other = (Employee) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getGender() == null ? other.getGender() == null : this.getGender().equals(other.getGender()))
            && (this.getNo() == null ? other.getNo() == null : this.getNo().equals(other.getNo()))
            && (this.getPassword() == null ? other.getPassword() == null : this.getPassword().equals(other.getPassword()))
            && (this.getPhone() == null ? other.getPhone() == null : this.getPhone().equals(other.getPhone()))
            && (this.getAddress() == null ? other.getAddress() == null : this.getAddress().equals(other.getAddress()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getDeleted() == null ? other.getDeleted() == null : this.getDeleted().equals(other.getDeleted()))
            && (this.getDepartmentId() == null ? other.getDepartmentId() == null : this.getDepartmentId().equals(other.getDepartmentId()))
            && (this.getGmtCreate() == null ? other.getGmtCreate() == null : this.getGmtCreate().equals(other.getGmtCreate()))
            && (this.getGmtModified() == null ? other.getGmtModified() == null : this.getGmtModified().equals(other.getGmtModified()));
    }

    /**
     * @return int
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getGender() == null) ? 0 : getGender().hashCode());
        result = prime * result + ((getNo() == null) ? 0 : getNo().hashCode());
        result = prime * result + ((getPassword() == null) ? 0 : getPassword().hashCode());
        result = prime * result + ((getPhone() == null) ? 0 : getPhone().hashCode());
        result = prime * result + ((getAddress() == null) ? 0 : getAddress().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getDeleted() == null) ? 0 : getDeleted().hashCode());
        result = prime * result + ((getDepartmentId() == null) ? 0 : getDepartmentId().hashCode());
        result = prime * result + ((getGmtCreate() == null) ? 0 : getGmtCreate().hashCode());
        result = prime * result + ((getGmtModified() == null) ? 0 : getGmtModified().hashCode());
        return result;
    }

    /**
     * @return String
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", gender=").append(gender);
        sb.append(", no=").append(no);
        sb.append(", password=").append(password);
        sb.append(", phone=").append(phone);
        sb.append(", address=").append(address);
        sb.append(", status=").append(status);
        sb.append(", deleted=").append(deleted);
        sb.append(", departmentId=").append(departmentId);
        sb.append(", gmtCreate=").append(gmtCreate);
        sb.append(", gmtModified=").append(gmtModified);
        sb.append("]");
        return sb.toString();
    }
}