import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static boolean isPalindrome(LinkedList<Character> input) {
		if (input == null || input.size() == 0)
			return false;
		
		Iterator<Character> fast = input.iterator();
		Iterator<Character> slow = input.iterator();
		
		Stack<Character> firstHalf = new Stack<Character>();
		int i =0;
		while(fast.hasNext()){
			fast.next();
			if((i & 1) == 0)
				firstHalf.push(slow.next());
			i++;
		}
		System.out.println("Stack contents: " + firstHalf);
		// if stack size is odd, then the total ll is odd number, remove the head its not needed
		if ((input.size() & 1) != 0){
			firstHalf.pop();
		}
		// now each character in stack must be equal to the linkedlist
		while(slow.hasNext()){
			if(!firstHalf.pop().equals(slow.next())){
				return false;
			}
		}
		return true;
	}
	
	public static void main (String[] args) throws java.lang.Exception
	{
	  LinkedList<Character> ll = new LinkedList<>();
	  ll.add('F');
      ll.add('E');
      ll.add('D');
      ll.add('E');
      ll.add('F');
      System.out.println("Original contents of ll: " + ll);
      System.out.println( isPalindrome(ll) );

	}
}
