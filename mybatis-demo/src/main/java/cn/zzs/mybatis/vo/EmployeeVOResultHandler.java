package cn.zzs.mybatis.vo;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.ibatis.session.ResultContext;
import org.apache.ibatis.session.ResultHandler;

import cn.zzs.mybatis.entity.Employee;

public class EmployeeVOResultHandler implements ResultHandler<Employee> {

    private List<EmployeeVO> VOs = new ArrayList<>();

    @Override
    public void handleResult(ResultContext<? extends Employee> resultContext) {
        // 获取Employee
        Employee employee = resultContext.getResultObject();

        // 转换为EmployeeVO
        EmployeeVO employeeVO = new EmployeeVO();
        try {
            BeanUtils.copyProperties(employeeVO, employee);
        } catch(Exception e) {
            // do nothing
        }

        // 添加到结果列表
        VOs.add(employeeVO);
    }

    public List<EmployeeVO> getResults() {
        return VOs;
    }
}
