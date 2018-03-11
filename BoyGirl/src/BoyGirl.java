import java.util.Scanner;
public class BoyGirl{

	//Zhaotian Wu GitHub Test


	public static final String NAME = null;

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner input = new Scanner (System.in);
		@SuppressWarnings("resource")
		Scanner inputname = new Scanner (System.in);

		String NAME = "name";
		int gender = 0;

		System.out.println("1 For Boy, 2 For Girl");

		gender = input.nextInt();

		if(gender==1) {
			System.out.println("Wow!");
		}
		
		if(gender==2) { System.out.println("Great");
		}


		if(gender==1) {
			System.out.println("What's his name?");
			NAME = inputname.next();
		}
		
		else if (gender==2) {
			System.out.println("What's her name?");
			NAME = inputname.next();
		}

		if(gender==1) {
			System.out.println("Your boy's name is: " + NAME);
		}
		else {
			System.out.println("Your girl's name is: " + NAME);

		}

	
		System.out.println(NAME + " Is how old?");
		gender = input.nextInt();
		System.out.println(NAME+" is "+ gender + " years old!");
	}
}