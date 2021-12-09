package shellscripts;

public class Line {
	int x1 ;
	int y1 ;
	int x2 ;
	int y2 ;
	double lengthOfLine = Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
	public Line(){}
	public Line(int x1, int y1, int x2, int y2) {
		super();
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}
	@Override
	public boolean equals(Object ob) {
		Line obj = (Line)ob;
	    if(obj.x1 == this.x1 && obj.x2 == this.x2 && obj.y1 == this.y1 && obj.y2 == this.y2 )
		return true;
	    else
	    	return false;
	}
	
}
