package Java10;

public class Class19 {
	
	public static void main(String[] args) {
		CRectangle rect = new CRectangle(2,6);
		System.out.println(rect);
	  }	  
	}
class CRectangle{
	protected int length;
	protected int width;
	
	public CRectangle(int l,int w) {
		length = l;
		width = w;
	}
	
	public String toString() {
		return "length="+length+","+"width="+width+","+"area="+length*width;
	}
}
