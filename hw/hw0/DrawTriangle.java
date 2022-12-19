public class DrawTriangle {
	public static void drawTriangle(int N) {
		String s = "";
		int index = 1;
		while (index <= N) {
			s = s + "*";
			index = index +1;
			System.out.println(s);
		}
	}

	public static void main(String[] args) {
		int N = 5;
		drawTriangle(N);
	}
}