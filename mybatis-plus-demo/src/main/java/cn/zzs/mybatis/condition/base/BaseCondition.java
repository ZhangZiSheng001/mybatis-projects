package cn.zzs.mybatis.condition.base;

/**
 * <p>条件 基本类</p>
 * @author: zzs
 * @date: 2020年3月23日 下午5:12:35
 */
public class BaseCondition {

    private Integer pageNum;

    private Integer pageSize;

    /**
     * 排序语句
     */
    private String orderByClause;

    /**
     * 关键字
     */
    private String searchKeyWord;

    /**
     * 是否去重
     */
    private boolean distinct;

    public BaseCondition() {}

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getSearchKeyWord() {
        return searchKeyWord;
    }

    public void setSearchKeyWord(String searchKeyWord) {
        this.searchKeyWord = searchKeyWord;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }
}
