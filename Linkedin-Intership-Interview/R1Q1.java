class Ideone
{
	public int Distance(String[] array, String X, String Y){
		int l = array.length;
		int minDist = l;
		int i = 0;
		while(i < l) {
			if(X.equals(array[i]) || Y.equals(array[i])) {
				int j = i;
				while(j < l) {
					Boolean boolA = (X.equals(array[i]) && Y.equals(array[j]));
					Boolean boolB = (X.equals(array[j]) && Y.equals(array[i]));
					if((boolA || boolB) && minDist > Math.abs(i-j)) {
						minDist = Math.abs(i-j);
					}
					j++;
				}
				i++;
			}
		}
		return minDist;
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		Ideone program = new Ideone();
		String[] array = {"the", "quick", "brown", "fox", "quick"};
		System.out.println( program.Distance(array, "fox", "the"));
		
	}
}
