package Java10;

public class Class11 {
	public static void largest(double a[]) {
		double max = 0.0;
		for(int i = 0;i<a.length;i++) {
			if(a[i]>max) {
				max = a[i];
			}
		}
		System.out.println("面積最大的是 "+max);
	}
    public static void main(String[] args) {
    	double[] data = new double[6];
    	
		CCircle cir1 = new CCircle(3);
		CSquare csq1 = new CSquare(3);
		CTriangle ctr1= new CTriangle(4,10);
		CCircle cir2 = new CCircle(4);
		CSquare csq2 = new CSquare(4);
		CTriangle ctr2 = new CTriangle(6,15);
		
		data[0] =  cir1.area();
		data[1] =  csq1.area();
		data[2] =  ctr1.area();
		data[3] =  cir2.area();
		data[4] =  csq2.area();
		data[5] =  ctr2.area();
		
		largest(data); //(e)需要再建立出一個陣列去儲存物件產生出來的面積才可計算
	  }	  
	}
class CShape{
	
	public double area() {
		return 0.0;
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
