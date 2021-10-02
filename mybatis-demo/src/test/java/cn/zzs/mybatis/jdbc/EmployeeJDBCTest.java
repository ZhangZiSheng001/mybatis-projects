package cn.zzs.mybatis.jdbc;

import static org.junit.Assert.assertTrue;

import java.io.Closeable;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.apache.commons.collections.CollectionUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import cn.zzs.mybatis.entity.Employee;

/**
 * <p>测试使用 JDBC 方式操作员工对象</p>
 * @author: zzs
 * @date: 2020年3月28日 下午12:07:23
 */
public class EmployeeJDBCTest {
    
    private DataSource dataSource;
    
    private Connection connection;
    
    @Before
    public void setup() throws SQLException {
        HikariConfig config = new HikariConfig("/hikari.properties");
        dataSource = new HikariDataSource(config);
        connection = dataSource.getConnection();
    }
    
    @After
    public void tearDown() throws IOException, SQLException {
        connection.close();
        if(dataSource instanceof Closeable) {
            Closeable closeable = (Closeable)dataSource;
            closeable.close();
        }
    }

    @Test
    public void testSample() throws SQLException {
        // 查询
        List<Employee> employees = queryListByNameAndGenderAndPhone("zzs001", 1, "18826****41");
        
        // 测试
        assertTrue(!CollectionUtils.isEmpty(employees));
        employees.stream().forEach(System.err::println);
    }
    
    
    public List<Employee> queryListByNameAndGenderAndPhone(String name, Integer gender, String phone) throws SQLException{
        
        String sql = "select * from demo_employee where name = ? and gender = ? and phone = ? and deleted = 0";
        
        // 获得连接、语句对象
        PreparedStatement statement = connection.prepareStatement(sql);
        
        // 入参映射
        statement.setString(1, name);
        statement.setInt(2, gender);
        statement.setString(3, phone);
        
        // 执行sql
        ResultSet resultSet = statement.executeQuery();
        
        // 出参映射
        List<Employee> employees = new ArrayList<>();
        while(resultSet.next()) {
            Employee employee = new Employee();
            employee.setId(resultSet.getString("id"));
            employee.setName(resultSet.getString("name"));
            employee.setGender(resultSet.getInt("gender"));
            employee.setNo(resultSet.getString("no"));
            employee.setAddress(resultSet.getString("address"));
            employee.setDeleted(resultSet.getInt("deleted"));
            employee.setDepartmentId(resultSet.getString("department_id"));
            employee.setPassword(resultSet.getString("password"));
            employee.setPhone(resultSet.getString("phone"));
            employee.setStatus(resultSet.getInt("status"));
            employee.setGmtCreate(resultSet.getDate("gmt_create"));
            employee.setGmtModified(resultSet.getDate("gmt_modified"));
            employees.add(employee);
        }
        
        // 释放资源
        resultSet.close();
        statement.close();
        
        return employees;
    }
}
