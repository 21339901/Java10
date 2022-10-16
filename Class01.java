package Java10;
public class Class01 {
	  public static void main(String[] args) {
		  Cbbb bb = new Cbbb();
		  bb.set_num(5, 10);
		  bb.show();
	  }	  
	}
class Caaa{
	public int num1;
	public int num2;
}
class Cbbb extends Caaa{
	void set_num(int a,int b) {
		num1 = a;
		num2 = b;
	}
	void show() {
		System.out.println("num1 = "+ num1);
		System.out.println("num2 = "+ num2);
	}
}
