package cn.zzs.mybatis.repository.dataobject;

import java.util.Date;

public class Role {
    private String id;

    private String name;

    private String departmentId;

    private Boolean isGeneral;

    private Boolean deleted;

    private Date create;

    private Date modified;

    public Role(String id, String name, String departmentId, Boolean isGeneral, Boolean deleted, Date create, Date modified) {
        this.id = id;
        this.name = name;
        this.departmentId = departmentId;
        this.isGeneral = isGeneral;
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

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId == null ? null : departmentId.trim();
    }

    public Boolean getIsGeneral() {
        return isGeneral;
    }

    public void setIsGeneral(Boolean isGeneral) {
        this.isGeneral = isGeneral;
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