package cn.zzs.mybatis.repository.dataobject;

import java.util.Date;

public class Employee {
    private String id;

    private String name;

    private Boolean gender;

    private String no;

    private String password;

    private String phone;

    private String address;

    private Byte status;

    private Boolean deleted;

    private String departmentId;

    private Date create;

    private Date modified;

    public Employee(String id, String name, Boolean gender, String no, String password, String phone, String address, Byte status, Boolean deleted, String departmentId, Date create, Date modified) {
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
        this.create = create;
        this.modified = modified;
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

    public Date getCreate() {
        return create;
    }

    public void setCreate(Date create) {
        this.create = create;
    }

    public Date getModified() {
        return modified;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }
}