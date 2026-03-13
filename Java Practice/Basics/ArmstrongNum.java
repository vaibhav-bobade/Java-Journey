import java.util.*;
public class ArmstrongNum{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number to check whether it is Armstrong or not: ");
		int num = sc.nextInt();
		
		int temp = num, sum = 0,lastdigit;
		
		while(temp!=0){
			lastdigit = temp%10;
			sum = sum + (lastdigit * lastdigit * lastdigit);
			temp = temp/10;
		}
		
		if(num == sum){
			System.out.println("Number "+ num +" is Armstrong");
		}
		else{
			System.out.println("Number "+num+" is not Armstrong");
		}
		sc.close();
		
	}
}		