import java.util.Scanner;
/*
 * A base-n number is a number that is made up of at most n symbols -
Base-2 is a number with 0s and 1
Base-10 is a number with digits in {0,1,2,3,4,5,6,7,8,9}
Base-16 is a number with digits 0-9,A-F etc

For this problem, you are required to do the following:
Given a number X (X will be a number in a base between base-2 and base-16), find the minimum base that can be associated with X.
Example: The minimum base associated 385 is base-9 (as it needs to have a base that supports the digit 8 which is its highest value digit). Similarly, the minimum base associated with B95 is base-12.

Convert X from this base to a value X_10 in base-10.

Do the same for another number Y and call its value in base-10 as Y_10

Print out the sum of these two numbers in base-10, ie X_10 + Y_10

Input Specifications

Your program will take
A number X in base-m (X >= 0, 2 ≤ m ≤ 16)

A number Y in base-n (Y >= 0, 2 ≤ n ≤ 16)

You can assume that X and Y when converted to base-10 will fit in a long long (C++).

Output Specifications

Based on the input, print out the sum of X_10 and Y_10

Sample Input/Output

INPUT
B95 101101 
OUTPUT
1742
EXPLANATION
B95 is in base-12. In base-10, its value is 1697. 101101 is in base-2. In base-10, its value is 45. 45 + 1697 = 1742
 */
public class BasicArithmetic {

	public static void main(String[] args) {
		
		int result = 0;
		char max = '0';
		Scanner stdin = new Scanner(System.in);
		
	   while(stdin.hasNextLine()) 
	   {
		   String string1 = stdin.nextLine();
		   char[] chArr = string1.toCharArray();
		   for(char ch : chArr) {
			   if(ch > max) max = ch;	//get the max to decide the base
		   }
		   int maxInt = max;
		   //test case for illegal values
		   if(!((maxInt < 58 && maxInt > 47) || (maxInt > 65 && maxInt < 71))) System.out.println("illegal value(s):"+(char)maxInt); 
		   int base = ( maxInt < 58 ) ? maxInt - 48 + 1: maxInt - 65 + 10 + 1 ;
		   int value_10 =  convertToBase10(chArr, base);
		   result += value_10;
		   String string2 = stdin.nextLine();
		   char[] chArr2 = string2.toCharArray();
		   max = '0';
		   for(char ch : chArr2) {
			   if(ch > max) max = ch;	//get the max to decide the base
		   }
		   maxInt = max;
		   if(!((maxInt < 58 && maxInt > 47) || (maxInt > 65 && maxInt < 71))) System.out.println("illegal value(s):"+(char)maxInt); 
		   base = ( maxInt < 58 ) ? maxInt - 48 + 1: maxInt - 65 + 10 + 1 ;
		   value_10 =  convertToBase10(chArr2, base);
		   result += value_10;
		   System.out.println(result);
	   }
	   stdin.close();

	}

	private static int convertToBase10(char[] chArr, int base) {
		int res = 0, value;
		float power = (float) 0.0;
		for(int i = chArr.length - 1; i >= 0; i--, power++) {
			int a = chArr[i];
			if(a < 58) value = (int) ((a - 48)*( Math.pow((double)base,power)));
			else value = (int) ((a - 55)*( Math.pow((double)base,power)));
			res += value;
		}
		return res;
	}

}
