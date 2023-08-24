package pk;
import java.util.*;
public class Utility {
	static Scanner sc = null;
	public Utility() {
		
	}
	public static boolean checkPrimr(int num) {
		 boolean flag = false;
		 if(num<2)
			 return flag;
		    for (int i = 2; i <= num / 2; ++i) {
		      // condition for nonprime number
		      if (num % i == 0) {
		        flag = true;
		        break;
		      }
		    }
		    return !flag;
	}
	public static void main(String args[]) {
		sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = sc.nextInt();
		boolean res = checkPrimr(num);
		System.out.println(res);
	}
	
}

