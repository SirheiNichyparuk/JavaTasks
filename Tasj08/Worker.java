package Task08;

//8. В массив A [N] занесены натуральные числа. 
//Найти сумму тех элементов, которые кратны данному К.

public class Worker {
	int k = 3;
	int[] mass = { 2, 4, 6, 10, 3, 6, 9, 12 };
	int sum = 0;

	public void counting() {

		for (int i = 0; i < mass.length; i++) {
			if (mass[i] % k == 0) {
				sum = sum + mass[i];

			}

		}

		System.out.println("Сумма элементов, которые кратны" + " " + k + ": = "
				+ sum);

	}
}
