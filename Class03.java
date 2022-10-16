package Java10;
public class Class03 {
	  public static void main(String[] args) {
		  Caaa aa = new Caaa();
		  System.out.println("num1 = "+aa.num1);
		  System.out.println("num2 = "+aa.num2);
		  System.out.println();
		  
		  Caaa aa1 = new Caaa(5,10);
		  System.out.println("num1 = "+aa1.num1);
		  System.out.println("num2 = "+aa1.num2);
		  System.out.println();
		  
		  Cbbb bb = new Cbbb(5,10);
		  bb.show();
	  }	  
	}
class Caaa{
	public int num1;
	public int num2;
	public Caaa() {
		num1 = 1;
		num2 = 1;
	}
	public Caaa(int a,int b) {
		num1 = a;
		num2 = b;
	}
}
class Cbbb extends Caaa{
	public Cbbb(int a,int b) {
		super(a,b);
	}
	void set_num(int a,int b) {
		num1 = a;
		num2 = b;
	}
	void show() {
		System.out.println("num1 = "+ num1);
		System.out.println("num2 = "+ num2);
	}
}
