package co.nstant.in.dec64;

/**
 * A Java implementation of Dec64
 * 
 * http://dec64.com/
 */
public class Dec64 {

    public static final Dec64 ZERO = new Dec64(0, 0);
    public static final Dec64 NaN = new Dec64(0, -128);
    private final long coefficient;
    private final long exponent;

    public static long MIN_COEFFICIENT = -36028797018963968L;
    public static long MAX_COEFFICIENT = 36028797018963967L;

    public static int MIN_EXPONENT = -127;
    public static int MAX_EXPONENT = 127;

    // Constructors -----------------------------------------------------------

    public Dec64(long coefficient, long exponent) {
        if (coefficient == 0) {
            exponent = 0;
        }

        this.coefficient = coefficient;
        this.exponent = exponent;
    }

    // Getters ----------------------------------------------------------------

    public long coefficient() {
        return coefficient;
    }

    public long exponent() {
        return exponent;
    }

    // Comparison -------------------------------------------------------------

    public boolean equal(Dec64 comparahend, Dec64 comparator) {
        return false;
    }

    public boolean isInteger() {
        return false;
    }

    public boolean isNaN() {
        return false;
    }

    public boolean isZero() {
        return false;
    }

    public boolean less(Dec64 comparahend, Dec64 comparator) {
        return false;
    }

    // Converters -------------------------------------------------------------

    @Override
    public String toString() {
        return super.toString();
    }

    // Comparison -------------------------------------------------------------

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object instanceof Dec64) {
            Dec64 other = (Dec64) object;
            return coefficient == other.coefficient && exponent == other.exponent;
        }
        return false;
    }

    public long toLong() {
        return (coefficient << 8) | exponent;
    }

}
