package cn.zzs.mybatis.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.mchange.v2.c3p0.ComboPooledDataSource;

/**
 * @ClassName: DataSourceConfig
 * @Description: 配置数据库连接池
 * @author: zzs
 * @date: 2019年9月4日 下午3:45:32
 */
@Configuration
public class DataSourceConfig {
	//指定当前对象作为bean
	@Bean(name = "dataSource")
	//指定dataSource来DI
	@Qualifier(value = "dataSource")
	//primary将当前数据库连接池作为默认数据库连接池
	//@Primary
	public DataSource dataSource() {
		return new ComboPooledDataSource();
	}
}
