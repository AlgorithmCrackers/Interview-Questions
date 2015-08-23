import java.util.Iterator;
import java.util.Stack;
/*
 * Find out missing no. from a stack if two given stacks have same numbers.
 */

public class MissingNoFromStack {
	/*
	 * @param: stack1 
	 * @param: stack2
	 */
	public static int missingNumber(Stack<Integer> st, Stack<Integer> st2) {
		int res1 = missingHelper(st);
		int res2 = missingHelper(st2);
	
		return res1 ^ res2;
	}
	/*
	 * computes the Exor of all the elements of Stack
	 * @param: Stack<Integer>
	 */
	public static int missingHelper(Stack<Integer> st) {
		Iterator<Integer> it = st.iterator();
		int res = 0;
		while(it.hasNext()) {
			res = res ^ it.next();	// exor all the elements
		}
		return res;
	}
	public static void main(String[] args) {
		Stack<Integer> st = new Stack<Integer>();
		st.add(2);
		st.add(3);
		st.add(40);
		Stack<Integer> st2 = new Stack<Integer>();
		st.add(2);
		st.add(3);
		int missingNo = missingNumber(st, st2);
		assert(missingNo == 40);
		System.out.print("Success " );

	}

}
