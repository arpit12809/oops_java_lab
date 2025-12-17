import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Name : ");
		String name = sc.nextLine();
		
		System.out.print("Enter Roll : ");
		int roll = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Section :");
		String section = sc.nextLine();
		
		System.out.println("Enter Branch : ");
		String branch = sc.nextLine();
		
		System.out.println("Name : " + name);
		System.out.println("Roll : " + roll);
		System.out.println("Section : " + section);
		System.out.println("Branch : " + branch);
	}
}
