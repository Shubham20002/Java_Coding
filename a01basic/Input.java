package a01basic;
import java.util.Scanner;
public class Input {
 public static void main(String[] args) {
	//taking int input
	 Scanner sc=new Scanner(System.in);
	 int a=sc.nextInt();
	 System.out.println("a is :"+a);
	 
	 double b=sc.nextDouble();
	 System.out.println("b is :"+b);
	 
	 //there is no option to take char as input so we are taking string as input and featching first char from that
	 char ch=(sc.next()).charAt(0);
	 System.out.println("char is :"+ch);
	 
	 
}
}
