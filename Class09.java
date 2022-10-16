package Java10;
public class Class09 {
	  public static void main(String[] args) {
		  Cbbb bb = new Cbbb();
		  bb.show();
//		  (c) 由子類別的display()改寫父類別的display() 在呼叫父類別的display()
	  }	  
	}
class Caaa{
	private int num;
	public Caaa(int n) {
		num = n;
	}
	public int get() {
		return num;
	}
	public void display() {
		System.out.println("printed from Caaa class");
	}
}
class Cbbb extends Caaa{
	public Cbbb() {
		super(2);
	}
	public void show() {
		System.out.println("num="+get());
	}
	public void display() {
		System.out.println("printed from Cbbb class");
	}
}
