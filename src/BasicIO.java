import java.util.*;

//An exploration of basic input and output.
class BasicIO {
	// Reads and processes string input.
	public static void main(String[] args) {
		
		Scanner stdin = new Scanner(System.in);
		
		// get first input
		System.out.print("Enter your name: ");
		String name = stdin.nextLine();
		int years = stdin.nextInt();
		int height = stdin.nextInt();
		
		// display output on console
		System.out.println("your name is " + name);
		System.out.println("your age is " + years);
		System.out.println("your day is " + years*365);
		System.out.println("your height is " + height);
		System.out.print("2020�� 09�� 28�� ���� " + name +"(" + years + ")�� Ű�� " + height + " cm�Դϴ�.");
		
	} // method main
	
} // class BASIC_IO
