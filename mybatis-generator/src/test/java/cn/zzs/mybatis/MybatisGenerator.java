package cn.zzs.mybatis;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

/**
 * <p>Mybatis 代码生成</p>
 * @author: zzs
 * @date: 2020年5月1日 下午5:15:15
 */
public class MybatisGenerator {
    
    public static void main(String[] args) throws Exception {
        
        // LogFactory.forceSlf4jLogging();
        System.setProperty("user.name", "zzs");
        // 这个集合记录着生成、合并、覆盖文件的信息
        List<String> warnings = new ArrayList<String>();
        InputStream in = MybatisGenerator.class.getClassLoader().getResourceAsStream("generatorConfig.xml");
        ConfigurationParser cp = new ConfigurationParser(warnings);
        Configuration config = cp.parseConfiguration(in);
        
        // 不覆盖 Java 文件
        boolean overwrite = false;
        DefaultShellCallback callback = new DefaultShellCallback(overwrite);
        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
        
        // 生成文件
        myBatisGenerator.generate(null);
        // 打印信息
        warnings.forEach(System.err::println);
    }

}
