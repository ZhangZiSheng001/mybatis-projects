package cn.zzs.mybatis.condition.base;

import java.util.Collection;
import java.util.Date;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 员工查询条件 抽象类
 * @author: zzs
 * @date: 2020年3月23日 下午5:18:48
 */
@Data
@EqualsAndHashCode(callSuper = true)
public abstract class AbstractEmployeeCondition extends BaseCondition {

    private String id;

    private String name;

    private Integer gender;

    private String no;

    private String password;

    private String phone;

    private String address;

    private Integer status;

    private Integer deleted;

    private String departmentId;
    
    private Date gmtCreate;

    private Date gmtModified;

    private Date createStart;

    private Date createEnd;

    private Date modifiedStart;

    private Date modifiedEnd;

    private Collection<String> phoneInclude;
}
