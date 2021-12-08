package shellscripts;

public class LineComparison {
	public static void main(String[] args) {
		System.out.println("Welcome To Line Comparison");
		int x1 = 10;
		int y1 = 10;
		int x2 = 6;
		int y2 = 7;
		double lineLength = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
		System.out.println(lineLength);
		
	}
}
