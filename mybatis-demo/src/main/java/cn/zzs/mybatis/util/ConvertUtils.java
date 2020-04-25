package cn.zzs.mybatis.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ConvertUtils {

    public static <T, R> R convertObject(T value, Converter<T, R> converter) {
        if(value == null) {
            return null;
        }
        return converter.convert(value);
    }
    
    public static <T, R> List<R> convertList(List<T> sourceList, Converter<T, R> converter) {
        if(sourceList == null || sourceList.isEmpty()) {
            return Collections.emptyList();
        }
        List<R> targetList = new ArrayList<>();
        for(T t : sourceList) {
            R target = convertObject(t, converter);
            targetList.add(target);
        }
        return targetList;
    }
}
