package poetry;

import java.util.HashMap;
import java.util.Map;
// http://community.topcoder.com/tc?module=ProblemDetail&rd=4655&pm=1835
public class Poetry {
	public static boolean isVowel(char c, int i, int len) {
		if( c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
			return true;
		else if (c == 'y' && (i>0 && i < len-1)) {
			return true;
		}
		return false;
	}
	public static String getBackPtrn(String word) {
		char[] ltrs = word.toCharArray();
		int len = ltrs.length;
		int i = len-1; // back to front
		boolean vowFound = false;
		while( i>=0 ) {
			boolean isVowel = isVowel(ltrs[i],i,len);
			if(!isVowel) {
				if (vowFound) { // this a nonvowel preceding a vowel so stop!
					i++; break;
				} else { // go to the next char
					i--;
				}
			} else {
			    vowFound = true;
			    if(i ==0) break; // if at first char, stop
			    i--;
			}
		}
		return word.substring(i);
	}
	public static String rhymeScheme(String[] poem){
	    	StringBuilder sb = new StringBuilder();
	    	int len = poem.length;
	    	char rCursor = ((char)('a'-1));
	    	Map<String, Character> backPatternPrev = new HashMap<String, Character>();
	        for (int i=0; i<= len-1; i++) {
	        	String line = poem[i].toLowerCase();
	        	// find if it is a empty string then just add a space
	            if(line.trim().isEmpty()) {
	            	sb.append(" ");
	            } else {
	            	// get the last word
	            	String[] words = line.split("\\s+");
	            	String last = words[words.length-1];
	            	String backPtrn = getBackPtrn(last);
	            	if(!backPatternPrev.containsKey(backPtrn)) { 
	            		rCursor++;
	            		if (rCursor >= ((char)('z'+1))) rCursor = 'A';
	            		backPatternPrev.put(backPtrn,rCursor);
	            	}
	            	sb.append(backPatternPrev.get(backPtrn));
	            }
	        }
	        return sb.toString();
	    }

	public static void main (String[] args) throws java.lang.Exception
	{
		String[] poem = new String[]{" ", "Measure your height", "AND WEIGHT ", "said the doctor", "", "And make sure to take your pills", " to cure your ills", "Every", "DAY"};
		System.out.println(rhymeScheme(poem));
	}
}
