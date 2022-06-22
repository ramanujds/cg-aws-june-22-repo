package lambdaexpression;

interface Printable{
	void print(String str);
	default void scan() {
		// ....
	}
}

//class Printer implements Printable{
//	
//	public void print() {
//		System.out.println("Hello Everyone..");
//	}
//}


public class LambdaExpression {

	public static void main(String[] args) {
//		Printable obj = new Printable() {
//			public void print() {
//				System.out.println("Hey there..");
//			}
//		};
		
		Printable obj = str -> System.out.println("Hey there.."+str);

		
		obj.print("Java is Great");
	}

}
