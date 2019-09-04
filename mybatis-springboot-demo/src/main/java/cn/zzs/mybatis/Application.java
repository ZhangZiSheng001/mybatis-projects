package cn.zzs.mybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Description
 * @Author zzs
 * @Date 2018-05-02 14:51
 */
@SpringBootApplication
@MapperScan("cn.zzs.mybatis.mapper")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
