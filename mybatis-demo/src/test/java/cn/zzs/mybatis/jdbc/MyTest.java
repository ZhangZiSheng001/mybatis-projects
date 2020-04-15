package cn.zzs.mybatis.jdbc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * <p>TODO</p>
 * @author: zzs
 * @date: 2020年4月2日 下午3:58:49
 */
public class MyTest {
    public static void main(String[] args) throws IOException {
        InputStream in = MyTest.class.getClassLoader().getResourceAsStream("table");
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        String prefix = "op";
        String buffer = null;
        
        while((buffer = reader.readLine()) != null) {
            String column = buffer.substring(buffer.indexOf("`")+1, buffer.lastIndexOf("`"));
            System.out.println(prefix + ".`" + column + "` as " + prefix + "_" + column + "," );
        }
        reader.close();
    }
}
