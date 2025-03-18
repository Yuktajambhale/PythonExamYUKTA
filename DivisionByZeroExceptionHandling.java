import java.util.Scanner;

class DivisionByZeroExceptionHandling {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the first integer");
		int num1=sc.nextInt();
		
		System.out.println("enter the second integer");
		int num2=sc.nextInt();
		
		try {
			int result=num1/num2;
			System.out.println("result is"+result);
		}
		catch(ArithmeticException e) {
			System.out.println("division ny zero is not allowed");
		}
		finally {
			System.out.println("end the program");
		}
		//4System.out.println("result is  :"+ result);

	}

}



























