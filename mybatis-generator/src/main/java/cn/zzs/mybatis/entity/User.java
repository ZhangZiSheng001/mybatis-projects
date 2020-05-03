package cn.zzs.mybatis.entity;

import java.util.Date;

/**
 * 
 * @author zzs
 * @date 2020-05-03 10:54:09
 */
public class User {
    /**
     * <p>用户id</p>
     */
    private String id;

    /**
     * <p>用户名</p>
     */
    private String name;

    /**
     * <p>性别</p>
     */
    private Boolean gender;

    /**
     * <p>用户年龄</p>
     */
    private Integer age;

    /**
     * <p>记录创建时间</p>
     */
    private Date gmtCreate;

    /**
     * <p>记录最近修改时间</p>
     */
    private Date gmtModified;

    /**
     * <p>是否删除</p>
     */
    private Boolean deleted;

    /**
     * <p>电话号码</p>
     */
    private String phone;

    /**
     * @return String
     */
    public String getId() {
        return id;
    }

    /**
     * @param id
     * @return User
     */
    public User withId(String id) {
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
     * @return User
     */
    public User withName(String name) {
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
     * @return User
     */
    public User withGender(Boolean gender) {
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
     * @return Integer
     */
    public Integer getAge() {
        return age;
    }

    /**
     * @param age
     * @return User
     */
    public User withAge(Integer age) {
        this.setAge(age);
        return this;
    }

    /**
     * @param age
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * @return Date
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * @param gmtCreate
     * @return User
     */
    public User withGmtCreate(Date gmtCreate) {
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
     * @return User
     */
    public User withGmtModified(Date gmtModified) {
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
     * @return Boolean
     */
    public Boolean getDeleted() {
        return deleted;
    }

    /**
     * @param deleted
     * @return User
     */
    public User withDeleted(Boolean deleted) {
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
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone
     * @return User
     */
    public User withPhone(String phone) {
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
        User other = (User) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getGender() == null ? other.getGender() == null : this.getGender().equals(other.getGender()))
            && (this.getAge() == null ? other.getAge() == null : this.getAge().equals(other.getAge()))
            && (this.getGmtCreate() == null ? other.getGmtCreate() == null : this.getGmtCreate().equals(other.getGmtCreate()))
            && (this.getGmtModified() == null ? other.getGmtModified() == null : this.getGmtModified().equals(other.getGmtModified()))
            && (this.getDeleted() == null ? other.getDeleted() == null : this.getDeleted().equals(other.getDeleted()))
            && (this.getPhone() == null ? other.getPhone() == null : this.getPhone().equals(other.getPhone()));
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
        result = prime * result + ((getAge() == null) ? 0 : getAge().hashCode());
        result = prime * result + ((getGmtCreate() == null) ? 0 : getGmtCreate().hashCode());
        result = prime * result + ((getGmtModified() == null) ? 0 : getGmtModified().hashCode());
        result = prime * result + ((getDeleted() == null) ? 0 : getDeleted().hashCode());
        result = prime * result + ((getPhone() == null) ? 0 : getPhone().hashCode());
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
        sb.append(", age=").append(age);
        sb.append(", gmtCreate=").append(gmtCreate);
        sb.append(", gmtModified=").append(gmtModified);
        sb.append(", deleted=").append(deleted);
        sb.append(", phone=").append(phone);
        sb.append("]");
        return sb.toString();
    }
}