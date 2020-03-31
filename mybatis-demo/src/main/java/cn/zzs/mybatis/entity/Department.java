package cn.zzs.mybatis.entity;

import java.util.Date;

public class Department {

	private String id;

	private String no;

	private String parentId;

	private String name;

	private String type;

	private Boolean deleted;

	private Date create;

	private Date modified;

	public Department(String id, String no, String parentId, String name, String type, Boolean deleted, Date create, Date modified) {
		this.id = id;
		this.no = no;
		this.parentId = parentId;
		this.name = name;
		this.type = type;
		this.deleted = deleted;
		this.create = create;
		this.modified = modified;
	}

	public Department() {
		super();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id == null ? null : id.trim();
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no == null ? null : no.trim();
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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type == null ? null : type.trim();
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
		builder.append("Department [id=");
		builder.append(id);
		builder.append(", no=");
		builder.append(no);
		builder.append(", parentId=");
		builder.append(parentId);
		builder.append(", name=");
		builder.append(name);
		builder.append(", type=");
		builder.append(type);
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