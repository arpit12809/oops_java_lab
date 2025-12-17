import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		sc.nextLine();
		int temp = x;
		int reverse = 0;
		while(temp != 0){
		    int digit = temp % 10; //extract last digit
		    reverse = reverse + digit; //build reverse Number
		    reverse = reverse * 10;
		    temp = temp/10;
		}
		reverse = reverse /10; //correct extra *10
		
		if(x == reverse){
		    System.out.println(x + " is Palidrome");
		} else{
		    System.out.println(x + " is not a Palindrome");
		}
	}
}
