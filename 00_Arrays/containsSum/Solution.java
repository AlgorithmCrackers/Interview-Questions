class Solution {
  
  public static boolean hasSum(int[] array, int sum) {
    java.util.Arrays.sort(array);
    int first = 0;
    int second = array.length - 1;
    while(first < second) {
      int gotSum = array[first] + array[second];
      if (gotSum == sum)
        return true;
      else if (gotSum < sum)
        first++;
      else
        second--;
    }
    return false;
  }

}