package cn.zzs.mybatis.repository.dataobject;

import java.util.Date;

public class Menu {
    private String id;

    private String parentId;

    private String name;

    private Byte order;

    private String url;

    private Boolean isParent;

    private Boolean deleted;

    private Date create;

    private Date modified;

    public Menu(String id, String parentId, String name, Byte order, String url, Boolean isParent, Boolean deleted, Date create, Date modified) {
        this.id = id;
        this.parentId = parentId;
        this.name = name;
        this.order = order;
        this.url = url;
        this.isParent = isParent;
        this.deleted = deleted;
        this.create = create;
        this.modified = modified;
    }

    public Menu() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId == null ? null : parentId.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Byte getOrder() {
        return order;
    }

    public void setOrder(Byte order) {
        this.order = order;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public Boolean getIsParent() {
        return isParent;
    }

    public void setIsParent(Boolean isParent) {
        this.isParent = isParent;
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
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