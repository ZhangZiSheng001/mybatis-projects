package cn.zzs.mybatis.condition.base;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

/**
 * <p>条件 基本类</p>
 * @author: zzs
 * @date: 2020年3月23日 下午5:12:35
 */
@Data
public class BaseCondition {

    private Integer pageNum;

    private Integer pageSize;

    /**
     * 关键字
     */
    private String searchKeyWord;

    /**
     * SQL 排序 ASC 集合
     */
    private List<String> ascs = new ArrayList<>();

    /**
     * SQL 排序 DESC 集合
     */
    private List<String> descs = new ArrayList<>();

}
