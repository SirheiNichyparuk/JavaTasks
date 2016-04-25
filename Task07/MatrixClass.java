package Task07;

import java.io.IOException;

public class Main {

	 public static void main(String[] args) throws ArrayIndexOutOfBoundsException, NumberFormatException, IOException {
	        
	        double a = 2.0;
	        double b = 40.0;
	        double h = 2.0;
	        Func f = new Func();
	        System.out.println("\t x \t\t\t F(x)");
	        f.show(f.calculationFunction(a, b, h));
	    }

}
