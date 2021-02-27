package cn.zzs.mybatis.plugin;

import java.util.List;

import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.PluginAdapter;

/**
 * 更改文件名
 * @author zzs
 * @date 2021年2月28日 上午12:06:08
 */
public class RenameFilePlugin extends PluginAdapter {

    @Override
    public boolean validate(List<String> warnings) {
        return true;
    }

    @Override
    public void initialized(IntrospectedTable introspectedTable) {
        // 更改实体类名称，例如：cn.zzs.mybatis.entity.Menu => cn.zzs.mybatis.entity.MenuDomain
        String oldType = introspectedTable.getBaseRecordType();
        introspectedTable.setBaseRecordType(oldType + "Domain");
        
        // 更改Mapper名称
        String mapperType = introspectedTable.getMyBatis3JavaMapperType();
        introspectedTable.setMyBatis3JavaMapperType(mapperType.replace("Mapper", "DAO"));
    }
}