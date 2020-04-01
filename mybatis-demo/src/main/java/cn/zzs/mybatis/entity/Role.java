package cn.zzs.mybatis.entity;

import java.util.Date;

public class Role {

    private String id;

    private String name;

    private Boolean general;

    private Boolean deleted;

    private Date create;

    private Date modified;

    public Role(String id, String name, Boolean general, Boolean deleted, Date create, Date modified) {
        this.id = id;
        this.name = name;
        this.general = general;
        this.deleted = deleted;
        this.create = create;
        this.modified = modified;
    }

    public Role() {
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

    public Boolean getGeneral() {
        return general;
    }

    public void setGeneral(Boolean general) {
        this.general = general;
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

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Role [id=");
        builder.append(id);
        builder.append(", name=");
        builder.append(name);
        builder.append(", general=");
        builder.append(general);
        builder.append(", deleted=");
        builder.append(deleted);
        builder.append(", create=");
        builder.append(create);
        builder.append(", modified=");
        builder.append(modified);
        builder.append("]");
        return builder.toString();
    }
}