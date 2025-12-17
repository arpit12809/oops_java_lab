import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the mark : ");
		int mark = sc.nextInt();
		String grade;
		if(mark >= 90){
		    grade = "O";
		} else if(mark >= 80){
		    grade = "E";
		} else if(mark >= 70){
		    grade = "A";
		} else if(mark >= 60){
		    grade = "B";
		} else if(mark >= 50){
		    grade = "C";
		} else{
		    grade = "F";
		}
		
		System.out.println("Grade : " + grade);
	}
}
