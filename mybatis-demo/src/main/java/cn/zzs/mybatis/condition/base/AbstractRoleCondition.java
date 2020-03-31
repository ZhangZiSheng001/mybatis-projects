package cn.zzs.mybatis.condition.base;

import java.util.Date;

/**
 * <p>角色查询条件 抽象类</p>
 * @author: zzs
 * @date: 2020年3月24日 上午8:40:12
 */
public abstract class AbstractRoleCondition extends BaseCondition {

	private String roleId;

	private String name;

	private Boolean general;

	private Boolean deleted;

	private Date create;

	private Date modified;

	public String getRoleId() {
		return roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

}
