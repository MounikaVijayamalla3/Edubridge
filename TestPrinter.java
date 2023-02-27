package designpatterns;

public class TestPrinter {

	public static void main(String[] args) {
		//Object 1
		Printer printer=Printer.getPrinter();
		System.out.println("Object 1------>"+printer.getA4Papers());
		printer.setA4Papers(200);
		System.out.println(printer.getA4Papers());
		//Object 2
		Printer printer1=Printer.getPrinter();
		System.out.println("Object 2------>"+printer1.getA4Papers());
		//Object 3
		Printer printer2=Printer.getPrinter();
		System.out.println("Object 3------>"+printer2.getA4Papers());
		

	}

}
