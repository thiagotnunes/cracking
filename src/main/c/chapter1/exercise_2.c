#include <stdio.h>
#include <string.h>

int main(int argc, char** argv) {
  if (argc != 2) {
    printf("Expected 1 string to reverse (%d arguments given)\n", argc);
    return -1;
  }

  char* str = argv[1];
  int length = strlen(str);
  char tmp;
  printf("Original %s (containing %d chars)\n", str, length);

  for (int i=0; i<length / 2; i++) {
    tmp = str[i];
    str[i] = str[length - 1 - i];
    str[length - 1 - i] = tmp;
  }
  printf("Reversed %s\n", str);

  return 0;
}
