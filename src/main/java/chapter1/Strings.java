package chapter1;


import java.util.HashSet;

public class Strings {
  public boolean hasUniqueChars(char[] chars) {
    HashSet<Character> uniqueChars = new HashSet<>();
    for (char c : chars) {
      if (uniqueChars.contains(c)) {
        return false;
      } else {
        uniqueChars.add(c);
      }
    }
    return true;
  }

  // 1 + 2 + 3 + ... + N - 1
  // ~ (N * (N + 1)) / 2
  // (N^2 + N) / 2
  // O(N^2)
  public boolean hasUniqueChars2(char[] chars) {
    for (int i = 1; i < chars.length; i++) {
      for (int j = i - 1; j >= 0; j--) {
        if (chars[i] == chars[j]) {
          return false;
        }
      }
    }
    return true;
  }
}
