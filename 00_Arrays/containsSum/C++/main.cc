#include <algorithm>
#include <iostream>
#include <cassert>

bool hasSum(int nums[], size_t size, int neededSum) {
  std::sort(nums, nums + size);
  size_t low = 0;
  size_t high = size-1;
  while(low < high) {
    int sum = nums[low] + nums[high];
    if(neededSum == sum) return true;
    else if (neededSum > sum) low++;
    else high--;
  }
  return false;
}

int main(void)
{
  int arr[] = {1, 2, 7, 2, 3, 4};
  size_t n = sizeof(arr)/sizeof(arr[0]);
  assert( hasSum(arr, n, 5) == true );
  assert( hasSum(arr, n, 50) == false );
  return 0;
}
