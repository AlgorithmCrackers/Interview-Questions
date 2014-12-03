#include <stddef.h>
#include <assert.h>
#include <stdio.h>

static void merge (int *C, int *A, int *B, size_t na, size_t nb) {
  while (na > 0  && nb > 0) {
    if (*A <= *B) {
      *C++ = *A++; na--;
    }
    else {
      *C++ = *B++; nb--;
    }
  }
  while (na > 0) {
    *C++ = *A++;
    na--;
  }
  while (nb > 0) {
    *C++ = *B++;
    nb--;
  }
}

static void merge_BitHack (int *C, int *A, int *B, size_t na, size_t nb) {
  while (na > 0 && nb > 0) {
    int cmp = (*A <= *B);
    int min = *B ^ ((*B ^ *A) & (-cmp)); // the 'minimum of two numbers' bitHack
    *C++ = min;
    A +=  cmp; na -=  cmp; // if A is the minimum, do A++ and na-­‐;
    B += !cmp; nb -= !cmp; // if B is the minimum, do B++ and nb-­‐;
  }
  while (na > 0) {
    *C++ = *A++;
    na--;
  }
  while (nb > 0)
  {
    *C++ = *B++;
    nb--;
  }
}

int equalArrays ( int *needed, int *existing, size_t size) {
  for (int i = 0; i < size; i++){
    if(needed[i] != existing[i]) return 0;
  }
  return 1;
}

void printArray( int *A, size_t size) {
  for(int i = 0; i < size; i++) {
      printf("%d ", A[i]);
  }
  printf("\n");
}

int main ( void ) {
  int A[4] = { 3, 12, 19, 46 };
  int B[4] = { 4, 14, 21, 23 };
  int C[8];
  int required[8] = { 3, 4, 12, 14, 19, 21, 23, 46};
  merge_BitHack ( C, A, B, sizeof(A)/sizeof(A[0]), sizeof(B)/sizeof(B[0]) );
  printArray( C,  sizeof(C)/sizeof(C[0]) );
  assert ( equalArrays( required , C,  sizeof(C)/sizeof(C[0])) );
}
