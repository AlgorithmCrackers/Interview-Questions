#include <unordered_map>
#include <iostream>
#include <cassert>

bool containsDuplicate(int nums[], size_t size, size_t k) {
  std::unordered_map<int, size_t> m;
  for(size_t i=0; i < size; i++) {
    if(m.find(nums[i]) == m.end()) {
      // new element
      m[ nums[i] ] = i;
    }
    else {
      size_t prev_index = m[ nums[i] ];
      if ( (i - prev_index) <= k ) return true;
      else m[ nums[i] ] = i;
    }
  }
  return false;
}

int main(void)
{
  int arr[] = {1, 2, 7, 2, 3, 4};
  size_t n = sizeof(arr)/sizeof(arr[0]);
  assert(containsDuplicate(arr, n, 2) == true);
  assert(containsDuplicate(arr, n, 1) == false);
  std::cout << "Assers Passed" << std::endl;
  return 0;
}
