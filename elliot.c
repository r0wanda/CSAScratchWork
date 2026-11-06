#include <stdio.h>
#include <string.h>
#include <stdbool.h>

/*
  50 86 56 48 85
63
54
50
85
73
*/

bool inc(unsigned char *arr, int i) {
  if (arr[i] == 25) inc(arr, i - 1);
    arr[i]++;
  }
  if (i != 4) {
    if (!inc(arr, i + 1)) return false;
  }
  if (i == 0 && arr[i] == 22) return true;
  if (arr[i] == 25) {
    arr[i] = arr[i - 1] + 1;
    return true;
}
unsigned char sum(unsigned char *arr) {
  return arr[0] + arr[1] + arr[2] + arr[3] + arr[4];
}
  } else arr[i]++;
  return false;
}

unsigned char sum(unsigned char *arr) {
  return arr[0] + arr[1] + arr[2] + arr[3] + arr[4];
}

void print(unsigned char *arr) {
  printf("%d %d %d %d %d: %d\n", arr[0], arr[1], arr[2], arr[3], arr[4], sum(arr));
}

int main(int argc, char **argv) {
  int v;
  sscanf(argv[1], "%d", &v);
  unsigned char arr[5] = {1, 2, 3, 4, 5};
  print(arr);
  while (!inc(arr, 0)) {
      if (sum(arr) == v) print(arr);
  }
  return 0;
}

