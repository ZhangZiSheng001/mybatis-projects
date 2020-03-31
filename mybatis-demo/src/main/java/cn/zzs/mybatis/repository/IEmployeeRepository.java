package cn.zzs.mybatis.repository;

import java.util.List;

import cn.zzs.mybatis.condition.EmployeeCondition;
import cn.zzs.mybatis.entity.Employee;

/**
 * <p>用户 Repository接口</p>
 * @author: zzs
 * @date: 2020年3月23日 下午4:52:25
 */
public interface IEmployeeRepository {

	/**
	 * 
	 * <p>根据id查询</p>
	 * @author: zzs
	 * @date: 2020年3月24日 下午1:18:35
	 * @param id
	 * @return: Employee
	 */
	Employee get(String id);
	
	/**
	 * 
	 * <p>根据条件查询</p>
	 * @author: zzs
	 * @date: 2020年3月24日 下午1:19:57
	 * @param con
	 * @return: List<Employee>
	 */
	List<Employee> list(EmployeeCondition con);

	/**
	 * 
	 * <p>根据条件查询数量</p>
	 * @author: zzs
	 * @date: 2020年3月24日 下午1:20:49
	 * @param con
	 * @return: long
	 */
	long count(EmployeeCondition con);

	/**
	 * 
	 * <p>根据条件删除</p>
	 * @author: zzs
	 * @date: 2020年3月24日 下午1:21:05
	 * @param con
	 * @return: int
	 */
	int delete(EmployeeCondition con);

	/**
	 * 
	 * <p>根据id删除</p>
	 * @author: zzs
	 * @date: 2020年3月24日 下午1:21:41
	 * @param id
	 * @return: int
	 */
	int delete(String id);

	/**
	 * 
	 * <p>保存</p>
	 * @author: zzs
	 * @date: 2020年3月24日 下午1:22:06
	 * @param employee
	 * @return: int
	 */
	int save(Employee employee);
	
	/**
	 * 
	 * <p>批量新增</p>
	 * @author: zzs
	 * @date: 2020年3月30日 下午10:00:22
	 * @param list
	 * @return: int
	 */
	int saveBatch(List<Employee> list);

	/**
	 * 
	 * <p>根据条件更新</p>
	 * @author: zzs
	 * @date: 2020年3月24日 下午1:23:41
	 * @param employee
	 * @param con
	 * @return: int
	 */
	int update(Employee employee, EmployeeCondition con);

	/**
	 * 
	 * <p>根据id更新</p>
	 * @author: zzs
	 * @date: 2020年3月24日 下午1:24:38
	 * @param employee
	 * @return: int
	 */
	int update(Employee employee);
}
