package cn.zzs.mybatis.entity;

import java.util.Date;

/**
 * 
 * @author zzs
 * @date 2021-03-21 14:17:57
 */
public class Role {
    /**
     * 角色id
     */
    private String id;

    /**
     * 角色名称
     */
    private String name;

    /**
     * 是否通用
     */
    private Boolean isGeneral;

    /**
     * 记录是否已删除
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
     * @return Role
     */
    public Role withId(String id) {
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
     * @return Role
     */
    public Role withName(String name) {
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
    public Boolean getIsGeneral() {
        return isGeneral;
    }

    /**
     * @param isGeneral
     * @return Role
     */
    public Role withIsGeneral(Boolean isGeneral) {
        this.setIsGeneral(isGeneral);
        return this;
    }

    /**
     * @param isGeneral
     */
    public void setIsGeneral(Boolean isGeneral) {
        this.isGeneral = isGeneral;
    }

    /**
     * @return Boolean
     */
    public Boolean getDeleted() {
        return deleted;
    }

    /**
     * @param deleted
     * @return Role
     */
    public Role withDeleted(Boolean deleted) {
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
     * @return Role
     */
    public Role withGmtCreate(Date gmtCreate) {
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
     * @return Role
     */
    public Role withGmtModified(Date gmtModified) {
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
        Role other = (Role) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getIsGeneral() == null ? other.getIsGeneral() == null : this.getIsGeneral().equals(other.getIsGeneral()))
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
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getIsGeneral() == null) ? 0 : getIsGeneral().hashCode());
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
        sb.append(", name=").append(name);
        sb.append(", isGeneral=").append(isGeneral);
        sb.append(", deleted=").append(deleted);
        sb.append(", gmtCreate=").append(gmtCreate);
        sb.append(", gmtModified=").append(gmtModified);
        sb.append("]");
        return sb.toString();
    }
}