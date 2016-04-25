package Task02;

//2. Вычислить значение выражения по формуле (все переменные принимают действительные значения):

public class Calc {
	double a = 3.0; // variable a should not be equal to zero;
	double b = 5.0;
	double c = 5.0;
	double numerator; // числитель
	double denominator; // знаменатель
	double quotient; // частное от деления
	double result; // результат

	public void Calculate() {
		numerator = ((b + Math.sqrt(Math.pow(b, 2) + (4 * a * c))));
		denominator = 2 * a;
		quotient = numerator / denominator;
		result = quotient - (Math.pow(a, 3)) * c + (Math.pow(b, -2));
		//System.out.println(numerator);
		//System.out.println(denominator);
		//System.out.println(quotient);
		System.out.println("Значение выражения = " + result);

	}

}
