package cn.zzs.mybatis.entity;

import java.util.Date;

/**
 * 
 * @author zzs
 * @date 2021-03-21 14:17:57
 */
public class Department {
    /**
     * 部门id
     */
    private String id;

    /**
     * 部门编码
     */
    private String no;

    /**
     * 上级部门id
     */
    private String parentId;

    /**
     * 部门名称
     */
    private String name;

    /**
     * 部门类型 department部门，group小组
     */
    private String type;

    /**
     * 记录是否删除
     */
    private Boolean deleted;

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
     * @return Department
     */
    public Department withId(String id) {
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
    public String getNo() {
        return no;
    }

    /**
     * @param no
     * @return Department
     */
    public Department withNo(String no) {
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
    public String getParentId() {
        return parentId;
    }

    /**
     * @param parentId
     * @return Department
     */
    public Department withParentId(String parentId) {
        this.setParentId(parentId);
        return this;
    }

    /**
     * @param parentId
     */
    public void setParentId(String parentId) {
        this.parentId = parentId == null ? null : parentId.trim();
    }

    /**
     * @return String
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     * @return Department
     */
    public Department withName(String name) {
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
     * @return String
     */
    public String getType() {
        return type;
    }

    /**
     * @param type
     * @return Department
     */
    public Department withType(String type) {
        this.setType(type);
        return this;
    }

    /**
     * @param type
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * @return Boolean
     */
    public Boolean getDeleted() {
        return deleted;
    }

    /**
     * @param deleted
     * @return Department
     */
    public Department withDeleted(Boolean deleted) {
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
     * @return Date
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * @param gmtCreate
     * @return Department
     */
    public Department withGmtCreate(Date gmtCreate) {
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
     * @return Department
     */
    public Department withGmtModified(Date gmtModified) {
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
        Department other = (Department) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getNo() == null ? other.getNo() == null : this.getNo().equals(other.getNo()))
            && (this.getParentId() == null ? other.getParentId() == null : this.getParentId().equals(other.getParentId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getDeleted() == null ? other.getDeleted() == null : this.getDeleted().equals(other.getDeleted()))
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
        result = prime * result + ((getNo() == null) ? 0 : getNo().hashCode());
        result = prime * result + ((getParentId() == null) ? 0 : getParentId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getDeleted() == null) ? 0 : getDeleted().hashCode());
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
        sb.append(", no=").append(no);
        sb.append(", parentId=").append(parentId);
        sb.append(", name=").append(name);
        sb.append(", type=").append(type);
        sb.append(", deleted=").append(deleted);
        sb.append(", gmtCreate=").append(gmtCreate);
        sb.append(", gmtModified=").append(gmtModified);
        sb.append("]");
        return sb.toString();
    }
}