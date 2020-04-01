package cn.zzs.mybatis.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.UUID;

import org.junit.Test;

import cn.zzs.mybatis.entity.Employee;
import cn.zzs.mybatis.util.JDBCUtils;

/**
 * <p>测试使用 JDBC 方式操作员工对象</p>
 * @author: zzs
 * @date: 2020年3月28日 下午12:07:23
 */
public class EmployeeJDBCTest {

    /**
     * 测试根据id查询
     * @throws SQLException 
     */
    @Test
    public void testSelectByPrimaryKey() throws SQLException {
        String id = "cc6b08506cdb11ea802000fffc35d9fe";

        Connection connection = null;
        try {
            // 获得连接
            connection = JDBCUtils.getConnection();
            Employee employee = selectByPrimaryKey(id);
            // 打印
            System.err.println(employee);

        } finally {
            // 释放资源
            connection.close();
        }
    }

    public Employee selectByPrimaryKey(String id) throws SQLException {
        Employee employee = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;

        // 创建sql
        String sql = "select * from demo_employee where id = ?";
        try {
            // 获得连接
            Connection connection = JDBCUtils.getConnection();
            // 获得Statement对象
            statement = connection.prepareStatement(sql);

            // 设置参数
            statement.setObject(1, id);

            // 执行，获取结果集
            resultSet = statement.executeQuery();

            if(resultSet.next()) {
                // 映射结果集
                employee = convert(resultSet);
            }
            // 返回对象
            return employee;

        } finally {
            // 释放资源
            JDBCUtils.release(null, statement, resultSet);
        }
    }

    /**
     * <p>通过结果集构造员工对象</p>
     * @author: zzs
     * @date: 2020年3月28日 下午12:20:02
     * @param resultSet
     * @return: Employee
     * @throws SQLException 
     */
    private Employee convert(ResultSet resultSet) throws SQLException {
        Employee employee = new Employee();
        employee.setId(resultSet.getString("id"));
        employee.setName(resultSet.getString("name"));
        employee.setGender(resultSet.getBoolean("gender"));
        employee.setNo(resultSet.getString("no"));
        employee.setAddress(resultSet.getString("address"));
        employee.setDeleted(resultSet.getBoolean("deleted"));
        employee.setDepartmentId(resultSet.getString("department_id"));
        employee.setPassword(resultSet.getString("password"));
        employee.setPhone(resultSet.getString("phone"));
        employee.setStatus(resultSet.getByte("status"));
        employee.setCreate(resultSet.getDate("gmt_create"));
        employee.setModified(resultSet.getDate("gmt_modified"));
        return employee;
    }

    /**
     * 测试保存
     * @throws SQLException 
     */
    @Test
    public void testInsert() throws SQLException {
        // 创建用户
        Employee employee = new Employee(UUID.randomUUID().toString().replace("-", ""), "zzs005", true, "zzs005", "admin", "18826****41", "广东", (byte)1, false, "94e2d2e56cd811ea802000fffc35d9fa", new Date(), new Date());

        Connection connection = null;
        try {
            // 获得连接
            connection = JDBCUtils.getConnection();

            // 开启事务
            connection.setAutoCommit(false);

            // 执行
            save(employee);

            // 提交事务
            connection.commit();
        } finally {
            // 释放资源
            connection.close();
        }
    }

    private void save(Employee employee) throws SQLException {

        PreparedStatement statement = null;
        // 创建sql
        String sql = "insert into demo_employee set id = ?, name = ?, gender = ?, no = ?, " + "address = ?, deleted = ?, department_id = ?, password = ?, phone = ?, " + "status = ?, gmt_create = ?, gmt_modified = ?";
        try {
            // 获得连接
            Connection connection = JDBCUtils.getConnection();

            // 开启事务
            connection.setAutoCommit(false);

            // 获得Statement对象
            statement = connection.prepareStatement(sql);

            // 设置参数
            construct(statement, employee);

            // 执行
            statement.executeUpdate();

            // 提交事务
            connection.commit();
        } finally {
            // 释放资源
            statement.close();
        }
    }

    /**
     * <p>通过员工构造语句</p>
     * @author: zzs
     * @date: 2020年3月28日 下午12:46:25
     * @param statement
     * @param employee
     * @return: void
     * @throws SQLException 
     */
    private void construct(PreparedStatement statement, Employee employee) throws SQLException {
        statement.setNString(1, employee.getId());
        statement.setNString(2, employee.getName());
        statement.setBoolean(3, employee.getGender());
        statement.setNString(4, employee.getNo());
        statement.setNString(5, employee.getAddress());
        statement.setBoolean(6, employee.getDeleted());
        statement.setNString(7, employee.getDepartmentId());
        statement.setNString(8, employee.getPassword());
        statement.setNString(9, employee.getPhone());
        statement.setByte(10, employee.getStatus().byteValue());
        statement.setDate(11, new java.sql.Date(employee.getCreate().getTime()));
        statement.setDate(12, new java.sql.Date(employee.getModified().getTime()));
    }
}
