package cn.zzs.mybatis.entity;

import java.util.Date;

/**
 * 
 * @author zzs
 * @date 2021-03-21 14:17:57
 */
public class Menu {
    /**
     * 菜单id
     */
    private String id;

    /**
     * 父菜单id
     */
    private String parentId;

    /**
     * 菜单名
     */
    private String name;

    /**
     * 菜单先后
     */
    private Byte order;

    /**
     * 菜单url
     */
    private String url;

    /**
     * 是否父菜单
     */
    private Boolean isParent;

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
     * @return Menu
     */
    public Menu withId(String id) {
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
    public String getParentId() {
        return parentId;
    }

    /**
     * @param parentId
     * @return Menu
     */
    public Menu withParentId(String parentId) {
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
     * @return Menu
     */
    public Menu withName(String name) {
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
     * @return Byte
     */
    public Byte getOrder() {
        return order;
    }

    /**
     * @param order
     * @return Menu
     */
    public Menu withOrder(Byte order) {
        this.setOrder(order);
        return this;
    }

    /**
     * @param order
     */
    public void setOrder(Byte order) {
        this.order = order;
    }

    /**
     * @return String
     */
    public String getUrl() {
        return url;
    }

    /**
     * @param url
     * @return Menu
     */
    public Menu withUrl(String url) {
        this.setUrl(url);
        return this;
    }

    /**
     * @param url
     */
    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    /**
     * @return Boolean
     */
    public Boolean getIsParent() {
        return isParent;
    }

    /**
     * @param isParent
     * @return Menu
     */
    public Menu withIsParent(Boolean isParent) {
        this.setIsParent(isParent);
        return this;
    }

    /**
     * @param isParent
     */
    public void setIsParent(Boolean isParent) {
        this.isParent = isParent;
    }

    /**
     * @return Boolean
     */
    public Boolean getDeleted() {
        return deleted;
    }

    /**
     * @param deleted
     * @return Menu
     */
    public Menu withDeleted(Boolean deleted) {
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
     * @return Menu
     */
    public Menu withGmtCreate(Date gmtCreate) {
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
     * @return Menu
     */
    public Menu withGmtModified(Date gmtModified) {
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
        Menu other = (Menu) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getParentId() == null ? other.getParentId() == null : this.getParentId().equals(other.getParentId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getOrder() == null ? other.getOrder() == null : this.getOrder().equals(other.getOrder()))
            && (this.getUrl() == null ? other.getUrl() == null : this.getUrl().equals(other.getUrl()))
            && (this.getIsParent() == null ? other.getIsParent() == null : this.getIsParent().equals(other.getIsParent()))
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
        result = prime * result + ((getParentId() == null) ? 0 : getParentId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getOrder() == null) ? 0 : getOrder().hashCode());
        result = prime * result + ((getUrl() == null) ? 0 : getUrl().hashCode());
        result = prime * result + ((getIsParent() == null) ? 0 : getIsParent().hashCode());
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
        sb.append(", parentId=").append(parentId);
        sb.append(", name=").append(name);
        sb.append(", order=").append(order);
        sb.append(", url=").append(url);
        sb.append(", isParent=").append(isParent);
        sb.append(", deleted=").append(deleted);
        sb.append(", gmtCreate=").append(gmtCreate);
        sb.append(", gmtModified=").append(gmtModified);
        sb.append("]");
        return sb.toString();
    }
}