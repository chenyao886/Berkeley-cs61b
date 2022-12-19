public class OurFirstProgram {
	public static void main(String[] args) {
		int x = 5;
		x = x + 1;
		System.out.println("x is: " + x);
		if (x<10) {
			x = x + 10;
		}
		System.out.println("x is: " + x);
		int y = x + 1;
		System.out.println("y is: " + y);
		if (x > 0) {
            System.out.println("I should negate X");
            x = -x;
        }
        System.out.println("x is: " + x);
	}
}