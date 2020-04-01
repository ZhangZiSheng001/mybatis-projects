package cn.zzs.mybatis.condition;

import cn.zzs.mybatis.condition.base.AbstractEmployeeCondition;

/**
 * <p>员工查询条件</p>
 * @author: zzs
 * @date: 2020年3月23日 下午5:21:17
 */
public class EmployeeCondition extends AbstractEmployeeCondition {

    // ============部门表============
    /**
     * <p>部门编号</p>
     */
    private String departmentNo;

    /**
     * <p>部门名</p>
     */
    private String departmentName;

    public boolean isJoinDepartment() {
        return (departmentNo != null && !departmentNo.isEmpty()) || (departmentName != null && !departmentName.isEmpty());
    }

    public String getDepartmentNo() {
        return departmentNo;
    }

    public void setDepartmentNo(String departmentNo) {
        this.departmentNo = departmentNo;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
}
