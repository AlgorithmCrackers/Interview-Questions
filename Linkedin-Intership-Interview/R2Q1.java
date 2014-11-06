import java.util.LinkedList;


class Tree<T extends Comparable<T>> {
	protected T value;
	protected Tree<T> left;
	protected Tree<T> right;
	
	public Tree(T v) {
		value = v;
		left = null;
		right = null;
	}

	public void insert(T v) {
		if (value.compareTo(v) == 0)
			return;
		if (value.compareTo(v) > 0) {
			if (left == null)
				left = new Tree<T>(v);
			else
				left.insert(v);
		}
		else if (value.compareTo(v) < 0) {
			if (right == null)
				right = new Tree<T>(v);
			else
				right.insert(v);
		}	
	}
}

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public<T extends Comparable<T>> void printLevelOrder(Tree<T> root) { // O(number of elements in tree)
		LinkedList<Tree<T>> queue = new LinkedList<Tree<T>>();
		int currentLevelNodes = 1;
		int nextLevelNodes = 0;
		queue.addLast(root);
		while(!queue.isEmpty()) {
			Tree<T> cur = queue.pop();
			currentLevelNodes--;
			if(cur != null){
				System.out.print(cur.value.toString() + " ");
				if(cur.left != null){
					queue.addLast(cur.left);
					nextLevelNodes++;
				}
				if(cur.right != null){
					queue.addLast(cur.right);
					nextLevelNodes++;
				}
			}
			if(currentLevelNodes == 0) { 
				System.out.println("$");
				currentLevelNodes = nextLevelNodes;
				nextLevelNodes = 0;
			}
		}
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		Ideone program = new Ideone();
		Tree<Integer> tree1 = new Tree<Integer>(60);
		tree1.insert(50);
		tree1.insert(70);
		tree1.insert(45);
		tree1.insert(55);
		tree1.insert(65);
		tree1.insert(75);
		tree1.insert(10);
		program.printLevelOrder(tree1);
		
	}
}
