package util;

/**
 * @author Veritas
 * @create 2021/7/8 15:00
 * Determines an output value based on an input value.
 *
 *
 */

public interface Function<F, T> {

    /**
     * Returns the result of applying this function to {@code input}.
     */
    T apply(F input);

    /**
     * Indicates whether another object is equal to this function.
     */
    boolean equals(Object obj);
}