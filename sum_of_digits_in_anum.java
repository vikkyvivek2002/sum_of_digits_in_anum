package microsoft;
import java.util.*;
public class sum_of_digits_in_anum {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number :");
		int  a = s.nextInt();
		int sum =0;
		while (a!=0)
		{
              int rem = a%10;
              sum = sum+rem;
              a =a/10;
              
		}
		System.out.println(sum);
	}

}
