package cn.zzs.mybatis.vo;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.ResultContext;
import org.apache.ibatis.session.ResultHandler;

import cn.zzs.mybatis.util.ConvertUtils;
import cn.zzs.mybatis.util.Converter;



public class MyResultHandler<T, R> implements ResultHandler<T> {
    private List<R> list = new ArrayList<R>();
    private Converter<T, R> converter;
    
    public MyResultHandler(Converter<T, R> converter) {
        this.converter = converter;
    }
    
    @Override
    public void handleResult(ResultContext<? extends T> resultContext) {
        list.add(ConvertUtils.convertObject(resultContext.getResultObject(), converter));
    }
    
    public List<R> getList(){
        return list;
    }
}
