import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Hello ASE2017 - How are you now? :)");

		Scanner input = new Scanner(System.in);
		String userName = input.nextLine();
		
		HelloUser helloUser = new HelloUser(userName);
		helloUser.greetUser();

	}

}
