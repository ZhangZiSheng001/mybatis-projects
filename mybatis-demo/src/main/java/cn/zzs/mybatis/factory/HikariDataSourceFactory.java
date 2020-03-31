package cn.zzs.mybatis.factory;

import java.util.Properties;

import javax.sql.DataSource;

import org.apache.ibatis.datasource.DataSourceFactory;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;


/**
 * <p>获取Hikari数据源--用于mybatis获取数据源使用</p>
 * @author: zzs
 * @date: 2020年3月30日 上午10:43:37
 */
public class HikariDataSourceFactory implements DataSourceFactory {
	
	private DataSource dataSource;
	
	public HikariDataSourceFactory() {
		super();
		try {
			HikariConfig config = new HikariConfig("/hikari.properties");
			dataSource = new HikariDataSource(config);
		} catch(Exception e) {
			throw new RuntimeException("创建数据源失败", e);
		}
	}

	@Override
	public void setProperties(Properties props) {
		// TODO Auto-generated method stub

	}

	@Override
	public DataSource getDataSource() {
		return dataSource;
	}

}
