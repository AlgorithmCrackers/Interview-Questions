/*
Count the number of occurrences in a sorted array
  Given a sorted array arr[] and a number x,
  write a function that counts the occurrences of x in arr[].

http://goo.gl/4cpGcs

Time Complexity: O(Logn)
Programming Paradigm: Divide & Conquer
*/

#include <stdio.h>
#include <stdbool.h>
#include <stddef.h>

int binarySearch(int arr[], int x, size_t n, bool isFirst);

/* if x is present in arr[] then returns the count of occurrences of x,
   otherwise returns -1. */
int count(int arr[], int x, size_t n)
{
  int i; // index of first occurrence of x in arr[0..n-1]
  int j; // index of last occurrence of x in arr[0..n-1]

  /* get the index of first occurrence of x */
  i = binarySearch(arr, x, n, true);

  /* If x doesn't exist in arr[] then return -1 */
  if(i == -1)
    return i;

  /* Else get the index of last occurrence of x. */
  j = binarySearch(arr, x, n, false);

  /* return count */
  return j-i+1;
}

int binarySearch(int arr[], int x, size_t n, bool isFirst)
{
  size_t low = 0;
  size_t high = n-1;
  size_t result = -1; // initialise result to -1
  while(low <= high)
  {
    int mid = low + (high - low)/2;
    if (arr[mid] == x) {
      result = mid;
      if(isFirst) high = mid-1; // need first occurence
      else low = mid+1; //  need second occurence
    }
    else if(x > arr[mid])
      low = mid + 1;
    else
      high = mid - 1;
  }
  return result;
}

/* driver program to test above functions */
int main()
{
  int arr[] = {1, 2, 2, 3, 3, 3, 3};
  int x =  3;  // Element to be counted in arr[]
  size_t n = sizeof(arr)/sizeof(arr[0]);
  int c = count(arr, x, n);
  printf(" \"%d\" occurs %d times ", x, c);
  getchar();
  return 0;
}
