import java.io.*;
import java.util.LinkedList;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Stack {
	LinkedList<Integer> stack;

	public Stack() {
		stack = new LinkedList<Integer>();
	}

	public Boolean push(Integer data) {
		stack.addLast(data);
		return true;
	}

	// removes the last added element
	public Integer pop() {
		if(stack.isEmpty()) {
			// no data to pop
			return -1;
		}
		Integer ret = stack.removeLast();
		return ret;
	}

	//show the items in stack
	public void display() {
		System.out.println(stack);
	}

	public static void main(String[] args) {
		Stack st = new Stack();
		st.push(1);
		st.push(3);
		st.push(2);
		st.display();
		System.out.println(st.pop()); // 2
		st.display();
		System.out.println(st.pop()); // 3
		System.out.println(st.pop()); // 1
		System.out.println(st.pop()); // -1
		assert(st.pop() == 1);
		System.out.println("success.. ");
	}
}