package Task04;

//4. Для данных областей составить линейную программу, 
//которая печатает true, если точка с координатами (х, у) принадлежит закрашенной области, 
//и false — в противном случае:

public class ClassTask4 {

	private static final int X1_FIRST_AREA = -4;
	private static final int X2_FIRST_AREA = 4;
	private static final int Y1_FIRST_AREA = 0;
	private static final int Y2_FIRST_AREA = -3;
	private static final int X1_SECOND_AREA = -2;
	private static final int X2_SECOND_AREA = 2;
	private static final int Y1_SECOND_AREA = 0;
	private static final int Y2_SECOND_AREA = -4;

	public void checkAreaAndPoints(double x, double y) { // check if our point
															// is in the area
		if (((x >= X1_FIRST_AREA) && (x <= X2_FIRST_AREA)
				&& (y >= Y2_FIRST_AREA) && (y <= Y1_FIRST_AREA))
				|| ((x >= X1_SECOND_AREA) && (x <= X2_SECOND_AREA)
						&& (y >= Y1_SECOND_AREA) && (y <= Y2_SECOND_AREA))) {
			System.out.println("true");
		} else {
			System.out.println("false");

		}

	}

}
