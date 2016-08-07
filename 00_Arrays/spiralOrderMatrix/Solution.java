public class Solution {
	public ArrayList<Integer> spiralOrder(final List<ArrayList<Integer>> a) {
		 ArrayList<Integer> result = new ArrayList<Integer>();
		 // Populate result;
		 int m = a.size();
		 int n = a.get(0).size();
		 int t = 0, b = m-1, l = 0, r = n-1;
		 int dir = 0; // will be 0-left, 1=down, 2-right, 3-up;
		 while(t <= b && l <= r) {
		     if(dir == 0) { // right
		         for(int i = l; i <= r; i++) { // traverse till end and change direction mark row as done
		          //  System.out.println(a.get(t).get(i));
		          result.add(a.get(t).get(i));
		         }
		         t++;
		         dir = 1;
		     }
		     if(t > b) break; // break while loop when the t > b condition breaks
		     if(dir == 1) { //down
		         for(int j = t; j <= b; j++) {
		          //   System.out.println(a.get(j).get(r));
		            result.add(a.get(j).get(r));
		         }
		         // change direction and mark the column as done
		         r--;
		         dir = 2;
		     }
		     if(l > r) break;  // break while loop when the l > r condition breaks
		     if(dir == 2) { //left
		         for(int i = r; i >= l; i--) {
		          //   System.out.println(a.get(b).get(i));
		            result.add(a.get(b).get(i));
		         }
		         b--;
		         dir = 3;
		     }
		     if(t > b) break;
		     if(dir == 3) { // top
		        for(int j = b; j >= t; j--) {
		          //  System.out.println(a.get(j).get(l));
		          result.add(a.get(j).get(l));
		        }   
		        l++;
		        dir = 0;
		     }
		     if(l > r) break;
		 }
		 
		 return result;
	}
}
