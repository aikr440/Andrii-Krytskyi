public class Test5 {
	public static void main(String[] args) {
		int number=5;
		int factorial=1;
		for (int i=number; i>0; i--) {
			factorial=factorial*i;
		}
		System.out.println("Factorial of "+number+" is: "+factorial);
	}
}