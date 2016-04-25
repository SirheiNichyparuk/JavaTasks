package Task05;

//5. Даны три действительных числа. Возвести в квадрат те из них, 
//значения которых неотрицательны, и в четвертую степень — отрицательные.

public class DigitsClass {

	int a = -2;
	int b = -4;
	int c = 4;
	int n = 2; // степень
	int m = 4; // степень

	public void checkDigits() {
		if (a > 0) {
			a = (int) Math.pow(a, n);
			System.out.println(a);
		} else {
			a = (int) Math.pow(a, m);
			System.out.println(a);

		}
		if (b > 0) {
			b = (int) Math.pow(b, n);
			System.out.println(b);
		} else {
			b = (int) Math.pow(b, m);
			System.out.println(b);

		}
		if (c > 0) {
			c = (int) Math.pow(c, n);
			System.out.println(c);
		} else {
			c = (int) Math.pow(c, m);
			System.out.println(c);

		}

	}
}
