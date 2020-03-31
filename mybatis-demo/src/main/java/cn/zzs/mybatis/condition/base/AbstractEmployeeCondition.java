package cn.zzs.mybatis.condition.base;

import java.util.Date;

/**
 * <p>员工查询条件 抽象类</p>
 * @author: zzs
 * @date: 2020年3月23日 下午5:18:48
 */
public abstract class AbstractEmployeeCondition extends BaseCondition {

	private String employeeId;

	private String name;

	private Boolean gender;

	private String no;

	private String password;

	private String phone;

	private String address;

	private Byte status;

	private Boolean deleted;

	private String departmentId;

	private Date createStart;
	
	private Date createEnd;

	private Date modifiedStart;
	
	private Date modifiedEnd;

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Boolean getGender() {
		return gender;
	}

	public void setGender(Boolean gender) {
		this.gender = gender;
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Byte getStatus() {
		return status;
	}

	public void setStatus(Byte status) {
		this.status = status;
	}

	public Boolean getDeleted() {
		return deleted;
	}

	public void setDeleted(Boolean deleted) {
		this.deleted = deleted;
	}

	public String getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(String departmentId) {
		this.departmentId = departmentId;
	}

	
	public Date getCreateStart() {
		return createStart;
	}

	
	public void setCreateStart(Date createStart) {
		this.createStart = createStart;
	}

	
	public Date getCreateEnd() {
		return createEnd;
	}

	
	public void setCreateEnd(Date createEnd) {
		this.createEnd = createEnd;
	}

	
	public Date getModifiedStart() {
		return modifiedStart;
	}

	
	public void setModifiedStart(Date modifiedStart) {
		this.modifiedStart = modifiedStart;
	}

	
	public Date getModifiedEnd() {
		return modifiedEnd;
	}

	
	public void setModifiedEnd(Date modifiedEnd) {
		this.modifiedEnd = modifiedEnd;
	}


}
