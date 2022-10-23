package Java10;
public class Class17 {
	  public static void main(String[] args) {
		   CColor mycar = new CColor("Riaan","A1-2345","Black");
		   mycar.show1();
	  }	  
	}
class Car{
	protected String owner;
	protected String id;
	public Car(String own, String s) {
		owner = own;
		id = s;
	}
	final void show() {
		System.out.println("車主姓名"+owner);
		System.out.println("車牌號碼"+id);
	}
}
class CColor extends Car{
	String color;
	public CColor(String s1,String s2,String s3) {
		super(s1,s2);
		color = s3;
	}
	public void show1() {
		System.out.println("車主姓名:"+owner);
		System.out.println("車牌號碼:"+id);
		System.out.println("車身顏色:"+color);
	}
}
