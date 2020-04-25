package cn.zzs.mybatis.vo;

import java.io.Serializable;

import org.apache.commons.beanutils.BeanUtils;

import cn.zzs.mybatis.entity.Department;
import cn.zzs.mybatis.entity.Employee;
import cn.zzs.mybatis.util.Converter;

public class EmployeeVO implements Converter<Employee, EmployeeVO>, Serializable {

    private static final long serialVersionUID = 1L;

    private String id;

    private String name;

    private String genderStr;

    private String no;

    private String password;

    private String phone;

    private String address;

    private Byte status;

    private String departmentId;
    
    private String departmentName;
    
    private String departmentNo;
    
    
    public String getId() {
        return id;
    }

    
    public void setId(String id) {
        this.id = id;
    }

    
    public String getName() {
        return name;
    }

    
    public void setName(String name) {
        this.name = name;
    }

    
    public String getGenderStr() {
        return genderStr;
    }

    
    public void setGenderStr(String genderStr) {
        this.genderStr = genderStr;
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

    
    public String getDepartmentId() {
        return departmentId;
    }

    
    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }
    
    


    
    public String getDepartmentName() {
        return departmentName;
    }


    
    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }


    
    public String getDepartmentNo() {
        return departmentNo;
    }


    
    public void setDepartmentNo(String departmentNo) {
        this.departmentNo = departmentNo;
    }




    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("EmployeeVO [id=");
        builder.append(id);
        builder.append(", name=");
        builder.append(name);
        builder.append(", genderStr=");
        builder.append(genderStr);
        builder.append(", no=");
        builder.append(no);
        builder.append(", password=");
        builder.append(password);
        builder.append(", phone=");
        builder.append(phone);
        builder.append(", address=");
        builder.append(address);
        builder.append(", status=");
        builder.append(status);
        builder.append(", departmentId=");
        builder.append(departmentId);
        builder.append(", departmentName=");
        builder.append(departmentName);
        builder.append(", departmentNo=");
        builder.append(departmentNo);
        builder.append("]");
        return builder.toString();
    }


    @Override
    public EmployeeVO convert(Employee value) {
        EmployeeVO employeeVO = new EmployeeVO();
        try {
            BeanUtils.copyProperties(employeeVO, value);
        } catch(Exception e) {
            // do nothing
        }
        employeeVO.setGenderStr(value.getGender()?"男":"女");
        Department department = value.getDepartment();
        if(department != null) {
            employeeVO.setDepartmentName(department.getName());
            employeeVO.setDepartmentNo(department.getNo());
        }
        return employeeVO;
    }
    
}