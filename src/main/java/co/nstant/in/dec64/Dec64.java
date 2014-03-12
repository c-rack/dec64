package co.nstant.in.dec64;

import java.math.BigDecimal;

/**
 * A Java implementation of Dec64
 * 
 * @see http://dec64.com/
 */
public class Dec64 implements Comparable<Dec64> {

	private long coefficient;
	private int exponent;

	public static long MIN_COEFFICIENT = -36028797018963968L;
	public static long MAX_COEFFICIENT = 36028797018963967L;

	public static int MIN_EXPONENT = -127;
	public static int MAX_EXPONENT = 127;

	// Constructors -----------------------------------------------------------

	public Dec64(byte[] bytes) {
	}

	public Dec64(BigDecimal value) {
	}

	public Dec64(float value) {
	}

	public Dec64(double value) {
	}

	// Getters ----------------------------------------------------------------

	public long getCoefficient() {
		return coefficient;
	}

	public long getExponent() {
		return exponent;
	}

	public boolean isNaN() {
		return false;
	}

	// Converters -------------------------------------------------------------

	public BigDecimal toBigDecimal() {
		BigDecimal bigCoefficient = new BigDecimal(coefficient);
		BigDecimal bigDecimal = bigCoefficient.multiply(BigDecimal.TEN.pow(exponent));
		return bigDecimal;
	}

	public float toFloat() {
		return toBigDecimal().floatValue();
	}

	public double toDouble() {
		return toBigDecimal().doubleValue();
	}

	public byte[] toBytes() {
		return null;
	}

	@Override
	public String toString() {
		return super.toString();
	}

	// Comparison -------------------------------------------------------------

	public int compareTo(Dec64 other) {
		if (other == null) {
			throw new NullPointerException();
		}
		return toBigDecimal().compareTo(other.toBigDecimal());
	}

	@Override
	public boolean equals(Object otherObject) {
		if (this == otherObject) {
			return true;
		}
		if (otherObject instanceof Dec64) {
			Dec64 other = (Dec64) otherObject;
			return coefficient == other.coefficient && exponent == other.exponent;
		}
		return false;
	}

}
