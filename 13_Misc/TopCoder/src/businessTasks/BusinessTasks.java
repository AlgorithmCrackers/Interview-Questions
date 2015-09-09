package businessTasks;

import java.util.ArrayList;


/* Name of the class has to be "Main" only if the class is public. */
public class BusinessTasks {
	public static String getTask(String[] list, int n) {
		ArrayList<String> al = new ArrayList<String>();
		for(int i=0; i<list.length; i++) {
			al.add(list[i]);
		}
		int cursor = 0;
		while(al.size() > 1) {
			cursor += (n-1); // from current cursor position move n-1 times
			cursor =  cursor % al.size(); // get the index for the array
			System.out.format("%d mod %d = %d\n", n-1, al.size(), cursor);
			al.remove(cursor);
		}
		return al.get(0);
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		System.out.println(getTask(new String[]	{"a","b","c","d"}, 2));
	}
}
