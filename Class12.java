package Java10;
public class Class12 {
	  public static void main(String[] args) {
		  CShape[] cs = new CShape[6];
		  cs[0] = new CCircle(3);
		  cs[1] = new CSquare(3);
		  cs[2] = new CTriangle(4,10);
		  cs[3] = new CCircle(4);
		  cs[4] = new CSquare(4);
		  cs[5] = new CTriangle(6,15);
		  CShape.largest(cs);	  
	  }	  
	}
class CShape{
	
	public double area() {
		return 0.0;
	}
	public static void largest(CShape a[]) {
		double max = 0.0;
		for(int i = 0;i<a.length;i++) {
			if(a[i].area()>max) {
				max = a[i].area();
			}
		}
		System.out.println("面積最大的是 "+max);
	}
}
class CCircle extends CShape{
	int radius;
	public CCircle(int a) {
		radius = a;
	}
	public double area() {
		return (Math.round(Math.pow(radius, 2)*Math.PI));
	}
}
class CSquare extends CShape{
	int length;
	public CSquare(int a) {
		length = a;
	}
	public double area() {
		return (Math.pow(length, 2));
	}
}
class CTriangle extends CShape{
	int length;
	int height;
	public CTriangle(int a,int b) {
		length = a;
		height = b;
	}
	public double area() {
		return (length * height / 2.0);
	}
}

