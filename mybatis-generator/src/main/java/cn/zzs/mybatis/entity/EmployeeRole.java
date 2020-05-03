package cn.zzs.mybatis.entity;

/**
 * 
 * @author zzs
 * @date 2020-05-03 10:54:09
 */
public class EmployeeRole {
    /**
     * <p>主键</p>
     */
    private String id;

    /**
     * <p>用户id</p>
     */
    private String employeeId;

    /**
     * <p>角色id</p>
     */
    private String roleId;

    /**
     * @return String
     */
    public String getId() {
        return id;
    }

    /**
     * @param id
     * @return EmployeeRole
     */
    public EmployeeRole withId(String id) {
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
    public String getEmployeeId() {
        return employeeId;
    }

    /**
     * @param employeeId
     * @return EmployeeRole
     */
    public EmployeeRole withEmployeeId(String employeeId) {
        this.setEmployeeId(employeeId);
        return this;
    }

    /**
     * @param employeeId
     */
    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId == null ? null : employeeId.trim();
    }

    /**
     * @return String
     */
    public String getRoleId() {
        return roleId;
    }

    /**
     * @param roleId
     * @return EmployeeRole
     */
    public EmployeeRole withRoleId(String roleId) {
        this.setRoleId(roleId);
        return this;
    }

    /**
     * @param roleId
     */
    public void setRoleId(String roleId) {
        this.roleId = roleId == null ? null : roleId.trim();
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
        EmployeeRole other = (EmployeeRole) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getEmployeeId() == null ? other.getEmployeeId() == null : this.getEmployeeId().equals(other.getEmployeeId()))
            && (this.getRoleId() == null ? other.getRoleId() == null : this.getRoleId().equals(other.getRoleId()));
    }

    /**
     * @return int
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getEmployeeId() == null) ? 0 : getEmployeeId().hashCode());
        result = prime * result + ((getRoleId() == null) ? 0 : getRoleId().hashCode());
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
        sb.append(", employeeId=").append(employeeId);
        sb.append(", roleId=").append(roleId);
        sb.append("]");
        return sb.toString();
    }
}