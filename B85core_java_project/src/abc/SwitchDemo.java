package abc;
import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
	System.out.println("enter ur choice");
	System.out.println("1.l/L");
	System.out.println("2.d/D");
	System.out.println("3.w/W");
	System.out.println("4.s/S");
	String x=sc.next();
	switch(x) {
	case "l":
	case "L":
		System.out.println("x is a letter");
		break;
	case "d":
	case "D":
		System.out.println("x is a digit");
		break;
	case "w":
	case "W":
		System.out.println("x is a white space");
		break;
	case "s":
	case "S":
		System.out.println("x is a Special symbol");
		break;
	}

	}

}
