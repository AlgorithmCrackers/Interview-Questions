/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class QueueUsingStack
{
	private Stack<Integer> st;
	public QueueUsingStack() {
		st = new Stack<Integer>();
	}
	
	public void enqueue(Integer data) {
		if(st.isEmpty()) {
			st.push(data);
			return;
		}
		Integer topElement = st.pop();
		enqueue(data);
		st.push(topElement);
	}
	
	public Integer dequeue() {
		return st.pop();
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		QueueUsingStack q = new QueueUsingStack();
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		System.out.println(q.dequeue()); //1
		System.out.println(q.dequeue()); //2
	}
}