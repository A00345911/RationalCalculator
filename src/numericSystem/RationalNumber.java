package numericSystem;

public class RationalNumber<T extends Number> implements IRationalNumber<RationalNumber<Number>> {

	private T numerator;
	private T denominator;

	public RationalNumber(T numerator, T denominator) {
		super();
		this.numerator = numerator;
		this.denominator = denominator;
	}

	@Override
	public void addRational(RationalNumber<Number> rationalToBeAdded) {

		if (rationalToBeAdded.getDenominator() == this.getDenominator()) {
			numerator = add(numerator, (T) rationalToBeAdded.getNumerator());
		} else {
			T temp1 = multiply(numerator, (T) rationalToBeAdded.getDenominator());
			T temp2 = multiply(denominator, (T) rationalToBeAdded.getNumerator());
			T newDenominator = multiply(denominator, (T) rationalToBeAdded.getDenominator());

			numerator = add(temp1, temp2);
			denominator = newDenominator;
		}
		simplifyRational();
	}

	public T add(T n1, T n2) {

		T number = null;

		if (n1 instanceof Long || n2 instanceof Long) {
			number = (T) Long.valueOf(n1.longValue() + n2.longValue());
		} else if (n1 instanceof Short) {
			if (n2 instanceof Integer) {
				number = (T) Integer.valueOf(n1.intValue() + n2.intValue());
			} else if (n2 instanceof Short) {
				number = (T) Short.valueOf((short) (n1.shortValue() + n2.shortValue()));
			}
		} else if (n1 instanceof Integer) {
			number = (T) Integer.valueOf(n1.intValue() + n2.intValue());
		}

		return number;
	}

	@Override
	public void substractRational(RationalNumber<Number> rationalToBeSubstracted) {

		if (rationalToBeSubstracted.getDenominator() == this.getDenominator()) {
			numerator = substract(numerator, (T) rationalToBeSubstracted.getNumerator());
		} else {
			T temp1 = multiply(numerator, (T) rationalToBeSubstracted.getDenominator());
			T temp2 = multiply(denominator, (T) rationalToBeSubstracted.getNumerator());
			T newDenominator = multiply(denominator, (T) rationalToBeSubstracted.getDenominator());

			numerator = substract(temp1, temp2);
			denominator = newDenominator;
		}
		simplifyRational();
	}

	public T substract(T n1, T n2) {

		T number = null;

		if (n1 instanceof Long || n2 instanceof Long) {
			number = (T) Long.valueOf(n1.longValue() - n2.longValue());
		} else if (n1 instanceof Short) {
			if (n2 instanceof Integer) {
				number = (T) Integer.valueOf(n1.intValue() - n2.intValue());
			} else if (n2 instanceof Short) {
				number = (T) Short.valueOf((short) (n1.shortValue() - n2.shortValue()));
			}
		} else if (n1 instanceof Integer) {
			number = (T) Integer.valueOf(n1.intValue() - n2.intValue());
		}

		return number;
	}

	@Override
	public void multiplyRational(RationalNumber<Number> rationalFactor) {

		this.numerator = multiply(numerator, (T) rationalFactor.getNumerator());
		this.denominator = multiply(denominator, (T) rationalFactor.getDenominator());
		simplifyRational();
	}

	public T multiply(T n1, T n2) {

		T number = null;

		if (n1 instanceof Long || n2 instanceof Long) {
			number = (T) Long.valueOf(n1.longValue() * n2.longValue());
		} else if (n1 instanceof Short) {
			if (n2 instanceof Integer) {
				number = (T) Integer.valueOf(n1.intValue() * n2.intValue());
			} else if (n2 instanceof Short) {
				number = (T) Short.valueOf((short) (n1.shortValue() * n2.shortValue()));
			}
		} else if (n1 instanceof Integer) {
			number = (T) Integer.valueOf(n1.intValue() * n2.intValue());
		}

		return number;
	}

	@Override
	public void divideRational(RationalNumber<Number> rationalQuocient) {
		multiply(numerator, (T) rationalQuocient.getDenominator());
		multiply(denominator, (T) rationalQuocient.getNumerator());
		simplifyRational();
	}

	@Override
	public void simplifyRational() {

		T mcd = findMCD();

		if (numerator instanceof Long || denominator instanceof Long) {
			numerator = (T) Long.valueOf(numerator.longValue() / Math.abs(mcd.longValue()));
			denominator = (T) Long.valueOf(denominator.longValue() / Math.abs(mcd.longValue()));

		} else if (numerator instanceof Short) {
			if (denominator instanceof Integer) {
				numerator = (T) Short.valueOf((short) (numerator.shortValue() / Math.abs(mcd.shortValue())));
				denominator = (T) Integer.valueOf(denominator.intValue() / Math.abs(mcd.intValue()));
			} else if (denominator instanceof Short) {
				numerator = (T) Short.valueOf((short) (numerator.shortValue() / Math.abs(mcd.shortValue())));
				denominator = (T) Short.valueOf((short) (denominator.shortValue() / Math.abs(mcd.shortValue())));

			}
		} else if (numerator instanceof Integer) {
			if (denominator instanceof Short) {
				denominator = (T) Short.valueOf((short) (denominator.shortValue() / Math.abs(mcd.shortValue())));
				numerator = (T) Integer.valueOf(numerator.intValue() / Math.abs(mcd.intValue()));
			} else if (denominator instanceof Integer) {
				numerator = (T) Integer.valueOf(numerator.intValue() / Math.abs(mcd.intValue()));
				denominator = (T) Integer.valueOf(denominator.intValue() / Math.abs(mcd.intValue()));
			}
		}
	}

	public T findMCD() {

		T n1 = numerator;
		T n2 = denominator;
		T temp = null;

		if (n1 instanceof Long || n2 instanceof Long) {
			if (n2.longValue() == 0) {
				return n1;
			} else {
				while (n2.longValue() != 0) {
					temp = (T) Long.valueOf(n1.longValue() % n2.longValue());
					n1 = n2;
					n2 = temp;
				}

			}

		} else if (n1 instanceof Short) {
			if (n2 instanceof Integer) {
				if (n2.intValue() == 0) {
					return n1;
				} else {
					while (n2.intValue() != 0) {
						temp = (T) Integer.valueOf(n1.intValue() % n2.intValue());
						n1 = n2;
						n2 = temp;
					}
				}
			} else if (n2 instanceof Short) {

				if (n2.shortValue() == 0) {
					return n1;
				} else {
					while (n2.shortValue() != 0) {
						temp = (T) Short.valueOf((short) (n1.shortValue() % n2.shortValue()));
						n1 = n2;
						n2 = temp;
					}
				}
			}
		} else if (n1 instanceof Integer) {
			if (n2 instanceof Short) {
				if (n2.intValue() == 0) {
					return n1;
				} else {
					while (n2.intValue() != 0) {
						temp = (T) Integer.valueOf(n1.intValue() % n2.intValue());
						n1 = n2;
						n2 = temp;
					}
				}
			} else if (n2 instanceof Integer) {
				if (n2.intValue() == 0) {
					return n1;
				} else {
					while (n2.intValue() != 0) {
						temp = (T) Integer.valueOf(n1.intValue() % n2.intValue());
						n1 = n2;
						n2 = temp;
					}
				}
			}
		}

		return n1;
	}

	@Override
	public void rationalInverse() {
		inverse(numerator, denominator);
		simplifyRational();
	}

	public void inverse(T numerator, T denominator) {

		T temp = null;

		if (numerator instanceof Long || denominator instanceof Long) {
			temp = (T) Long.valueOf(numerator.longValue());
			numerator = (T) Long.valueOf(denominator.longValue());
			denominator = temp;
		} else if (numerator instanceof Short) {
			if (denominator instanceof Integer) {
				temp = (T) Integer.valueOf(numerator.intValue());
				numerator = (T) Integer.valueOf(denominator.intValue());
				denominator = temp;
			} else if (denominator instanceof Short) {
				temp = (T) Short.valueOf((short) numerator.shortValue());
				numerator = (T) Short.valueOf((short) denominator.intValue());
				denominator = temp;
			}
		} else if (numerator instanceof Integer) {
			temp = (T) Integer.valueOf(numerator.intValue());
			numerator = (T) Integer.valueOf(denominator.intValue());
			denominator = temp;
		}
	}

	@Override
	public void squaredRational() {
		numerator = multiply(this.numerator, this.numerator);
		denominator = multiply(this.denominator, this.denominator);
		simplifyRational();
	}

	@Override
	public Number getNumerator() {
		return numerator;
	}

	@Override
	public Number getDenominator() {
		return denominator;
	}
}