package smartWordToy;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class SmartWordToy {
	public static int minPresses(String start, String finish, String[] forbid) {
        Node.initForbidden(forbid);
        Node s = new Node(start.toCharArray());
        return bfs(s, finish);
    }

    private static int bfs(Node s, String finish) {
        Set<String> visited = new HashSet<String>();
        Queue<Node> q = new LinkedList<Node>();
        q.add(s);
        visited.add(s.toString());
        while (! q.isEmpty()) {
           Node v = q.poll();
           if (v.toString().equals(finish)) return v.steps;
           for (Node n: v.neighbors()) {
        	   if(! visited.contains(n.toString())){
        		  visited.add(n.toString());
        		  n.steps = v.steps+1;
        		  q.add(n);
        	   }
           }
        }
        return -1;
    }
    static class Node {
    	public static final char A = 'a';
    	public int steps = 0; // level in the graph
    	static boolean[][][][] forbidden;
    	char[] word = new char[4];
    	
    	Node(char[] word) {
            this.word = word;
        }
    	/**
    	 * Find the forbidden words and set them to true in the corresponding forbidden matrix position
    	 * @param forbid
    	 */
    	public static void initForbidden(String[] forbid) {
    		forbidden = new boolean[26][26][26][26];
			for(String f: forbid) {
				String[] constraint = f.split("\\s");
				for (int i = 0; i < constraint[0].length(); i++) { // letter 1 - all constraint chars
                    for (int j = 0; j < constraint[1].length(); j++) {
                        for (int k = 0; k < constraint[2].length(); k++) {
                            for (int l = 0; l < constraint[3].length(); l++) { // letter 4 - all constraint chars
                                forbidden[constraint[0].charAt(i) - A][constraint[1].charAt(j) - A]
                                		[constraint[2].charAt(k) - A][constraint[3].charAt(l) - A] = true;
                            }
                        }
                    }
                }
			}
		}
    	/**
    	 * Get all the neighbor words for the current node(word)
    	 * @return A set of all the neighbor nodes
    	 */
		public Set<Node> neighbors() {
    		Set<Node> set = new HashSet<Node>();
    		// 4 words for going to previous letter for each char in the word
    		for(int i=0; i < word.length; i++) {
    			char[] wrd = getWord("prev",i);
    			if(! isForbidden(wrd)){
    				set.add(new Node(wrd));
    			}
    		}
    		// 4 words for going to next letter for each char in the word
    		for(int i=0; i < word.length; i++) {
    			char[] wrd = getWord("next",i);
    			if(! isForbidden(wrd)){
    				set.add(new Node(wrd));
    			}
    		}
    		return set;
    	}
    	/**
    	 * Is the word forbidden?
    	 * @param wrd
    	 * @return boolean
    	 */
    	private boolean isForbidden(char[] wrd) {
			return forbidden[wrd[0]-A][wrd[1]-A][wrd[2]-A][wrd[3]-A];
		}
    	/**
    	 * Get the previous or next word
    	 * @param prevOrNext
    	 * @param index
    	 * @return word
    	 */
		private char[] getWord(String prevOrNext, int index) {
    		char[] wrd = new char[4];
    		Boolean prev = (prevOrNext.charAt(0) == 'p');
    		for(int i=0; i < wrd.length; i++){
    			if(i==index) {
    				if (prev) wrd[i] = prev(word[i]);
    				else wrd[i] = next(word[i]);
    			} else {
    				wrd[i] = word[i];
    			}
    		}
    		return wrd;
    	}

		private char next(char c) {
			if(c == 'z') return 'a';
			return (char) (c+1);
		}

		private char prev(char c) {
			if(c == 'a') return 'z';
			return (char) (c-1);
		}
        public String toString() {
            return new String(word);
        }
    }
    public static void main(String[] args) {
    	System.out.println(
    			minPresses("aaaa", "zzzz", new String[]{"a a a z", "a a z a", "a z a a", "z a a a", "a z z z", "z a z z", "z z a z", "z z z a"})
    			);
    }
}
