package top.hihuzi.function.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * tips function-auto
 *
 * @author hihuzi 19 9:20
 */
@Target({ElementType.TYPE}) // 使用在类上
@Retention(RetentionPolicy.SOURCE) //表示这个注解只在编译期起作用
public @interface Get {
}