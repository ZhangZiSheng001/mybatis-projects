package cn.zzs.mybatis.factory;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

import javax.sql.DataSource;

import org.mybatis.generator.api.ConnectionFactory;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;


/**
 * <p>用于MBG使用的连接工厂</p>
 * @author: zzs
 * @date: 2020年5月2日 上午9:14:23
 */
public class HikariConnectionFactory implements ConnectionFactory {
    
    private DataSource dataSource;
    
    public HikariConnectionFactory() {
        super();
        HikariConfig config = new HikariConfig("/hikari.properties");
        dataSource = new HikariDataSource(config);
    }
    
    @Override
    public Connection getConnection() throws SQLException {
        return dataSource.getConnection();
    }

    @Override
    public void addConfigurationProperties(Properties properties) {
        // do nothing
    }

}
