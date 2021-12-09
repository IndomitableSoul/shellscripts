package shellscripts;

public class LineComparison {
	public static void main(String[] args) {
		System.out.println("Welcome To Line Comparison");
		Line line1 = new Line(10, 12, 7, 8);
		Line line2 = new Line(10, 12, 7, 8);
		Line line3 = new Line(15, 12, 12, 8);
		
		System.out.println("Line1 is equal to Line2: "+line1.equals(line2));
		System.out.println("Line1 is equal to Line3: "+line1.equals(line3));
		System.out.println("Line1 length minus Line3 length: "+line1.compareTo(line3));
	}
}
