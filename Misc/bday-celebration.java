/* You are given n candles with size of each candle present as an element in an 
integer array i.e a[i] represent length of ith candle. There is a tradition according 
to which you celebrate by lighting a candle every night. The candles are lit such that 
there are k candles lit on the kth day. For ex. 1 candle on day 1 , 2 candles on day 2 and so on. 
Each night a candle burns 1 inch.
you need to write a program to find out maximum number of days you can celebrate the tradition 
with the n candles and their lengths?
ref: http://www.geeksforgeeks.org/forums/topic/amazon-coding-round-question/

@author:prakashn27
*/
import java.util.Scanner;

class BdayCelebration {
            public static void main(String args[])
			{ 
				int[] len;
				int sum = 0;
				System.out.println("Enter the no. of candles");
				Scanner jin=new Scanner(System.in);
				int n=jin.nextInt();
				len=new int[n];
				System.out.println("Enter the length of each candle");
				for(int k=0;k<n;k++)
				{
					System.out.print("length of candle "+(k+1)+" : ");
					len[k]=jin.nextInt();
					sum = sum + len[k]; //calculate the sum of length of all the candles
				}
				jin.close();
				int i=1;	//i is dayscount
				/* algorithm used:
				sum of length all the candles should be sum of i days 
				*/
				
				do {
					i++;
				} while(( i*(i+1)/2) <= sum);
				System.out.println("Max no. of days we can celebrate the tradition : "+(i-1));
        }

}
