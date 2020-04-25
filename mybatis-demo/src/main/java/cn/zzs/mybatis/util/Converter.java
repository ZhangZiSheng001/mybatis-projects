
package cn.zzs.mybatis.util;

@FunctionalInterface
public interface Converter<T, R> {

    public R convert(T value);
}
