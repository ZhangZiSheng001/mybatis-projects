package cn.zzs.mybatis.condition.base;

import java.util.Date;

/**
 * <p>部门查询条件 抽象类</p>
 * @author: zzs
 * @date: 2020年3月24日 上午8:48:25
 */
public abstract class AbstractDepartmentCondition extends BaseCondition {

    private String departmentId;

    private String no;

    private String parentId;

    private String name;

    private String type;

    private Boolean deleted;

    private Date create;

    private Date modified;

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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
