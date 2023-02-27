package designpatterns;

public class Printer {
	private int a4Papers=150;
  private static final Printer printer=null;
 private Printer() {
	  
  }
  public static Printer getPrinter() {
	 if(printer==null) {
		  return new Printer();
	 }  
	 return printer;
  }
public void setA4Papers(int a4Papers) {
	this.a4Papers=a4Papers;
}
public int getA4Papers() {
	return a4Papers;
}
}
