package cn.zzs.mybatis.condition;

import cn.zzs.mybatis.condition.base.AbstractEmployeeCondition;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>员工查询条件</p>
 * @author: zzs
 * @date: 2020年3月23日 下午5:21:17
 */
@Data
@EqualsAndHashCode(callSuper = true)
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
    
    
}
