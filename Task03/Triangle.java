package Task03;

public class Triangle {

	int a = 3; // The first leg
	int b = 4; // The second leg
	int c = (int) Math.sqrt(a * a + b * b); // Hypotenuse
	int p; // Perimeter
	int s; // Square

	public void Calculate() { // Square and perimeter
		p = a + b + c;
		s = a * b / 2;
	}

	public void show() {

		System.out.println("Perimeter of rectangular triangle is = " + p);
		System.out.println("Square of rectangular triangle is = " + s);
	}

}
