package util;

/**
 * @author Veritas
 * @create 2021/7/8 15:02
 */
public final class Ints {

    /**
     * The largest power of two that can be represented as an int.
     */
    public static final int MAX_POWER_OF_TWO = 1 << (Integer.SIZE - 2);

    /**
     * Returns the {@code int} value that is equal to {@code value}, if possible.
     */
    public static int checkedCast(long value) {
        int result = (int) value;
        Requires.requireTrue(result == value, "out of range: " + value);
        return result;
    }

    /**
     * Returns the {@code int} nearest in value to {@code value}.
     */
    public static int saturatedCast(long value) {
        return value > Integer.MAX_VALUE ? Integer.MAX_VALUE : value < Integer.MIN_VALUE ? Integer.MIN_VALUE : (int) value;
    }

    /**
     * Fast method of finding the next power of 2 greater than or equal to the supplied value.
     *
     * If the value is {@code <= 0} then 1 will be returned.
     * This method is not suitable for {@link Integer#MIN_VALUE} or numbers greater than 2^30.
     *
     * @param value from which to search for next power of 2
     * @return The next power of 2 or the value itself if it is a power of 2
     */
    public static int findNextPositivePowerOfTwo(int value) {
        return value <= 0 ? 1 : value >= 0x40000000 ? 0x40000000 : 1 << (32 - Integer.numberOfLeadingZeros(value - 1));
    }

    private Ints() {}
}

