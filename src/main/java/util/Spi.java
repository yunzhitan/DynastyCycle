package util;

import java.lang.annotation.*;

/**
 * @author Veritas
 * @create 2021/7/7 12:05
 */

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
public @interface Spi {
    String name() default "";

    int priority() default 0;
}
