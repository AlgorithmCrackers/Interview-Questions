/*
Count the number of occurrences in a sorted array
  Given a sorted array arr[] and a number x,
  write a function that counts the occurrences of x in arr[]. 

http://goo.gl/4cpGcs

Time Complexity: O(Logn)
Programming Paradigm: Divide & Conquer
*/

#include <stdio.h>
#include <stdlib.h>

int first(int arr[], int low, int high, int x, int n);
int last(int arr[], int low, int high, int x, int n);

/* if x is present in arr[] then returns the count of occurrences of x, 
   otherwise returns -1. */
int count(int arr[], int x, int n)
{
  int i; // index of first occurrence of x in arr[0..n-1]
  int j; // index of last occurrence of x in arr[0..n-1]
     
  /* get the index of first occurrence of x */
  i = first(arr, 0, n-1, x, n);
 
  /* If x doesn't exist in arr[] then return -1 */
  if(i == -1)
    return i;
    
  /* Else get the index of last occurrence of x. Note that we 
      are only looking in the subarray after first occurrence */  
  j = last(arr, i, n-1, x, n);     
    
  /* return count */
  return j-i+1;
}
 
/* if x is present in arr[] then returns the index of FIRST occurrence 
   of x in arr[0..n-1], otherwise returns -1 */
int first(int arr[], int low, int high, int x, int n)
{
  if(high >= low)
  {
    int mid = (low + high)/2;  /*low + (high - low)/2;*/
    if ( ( mid == 0 ) || (  ( x > arr[mid-1] )  && ( arr[mid] == x ) ) )
      return mid;
    else if(x > arr[mid])
      return first(arr, (mid + 1), high, x, n);
    else
      return first(arr, low, (mid -1), x, n);
  }
  return -1;
}
 
 
/* if x is present in arr[] then returns the index of LAST occurrence 
   of x in arr[0..n-1], otherwise returns -1 */
int last(int arr[], int low, int high, int x, int n)
{
  if(high >= low)
  {
    int mid = (low + high)/2;  /*low + (high - low)/2;*/
    if ( ( mid == n-1 ) || ( ( x < arr[mid+1])  && ( arr[mid] == x ) ) )
      return mid;
    else if(x < arr[mid])
      return last(arr, low, (mid -1), x, n);
    else
      return last(arr, (mid + 1), high, x, n);    
  }
  return -1;
}
 
/* driver program to test above functions */
int main()
{
  int arr[] = {1, 2, 2, 3, 3, 3, 3};
  int x =  3;  // Element to be counted in arr[]
  int n = sizeof(arr)/sizeof(arr[0]);
  int c = count(arr, x, n);
  printf(" \"%d\" occurs %d times ", x, c);
  getchar();
  return 0;
}