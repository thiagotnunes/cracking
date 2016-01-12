package chapter1;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Exercise1Test {

  private Strings strings = new Strings();

  @Test
  public void hasUniqueChars() {
    assertEquals(strings.hasUniqueChars("abcde".toCharArray()), true);
  }

  @Test
  public void hasDuplicatedChars() {
    assertEquals(strings.hasUniqueChars("abcdea".toCharArray()), false);
  }

  @Test
  public void hasUniqueChars2() {
    assertEquals(strings.hasUniqueChars2("abcde".toCharArray()), true);
  }

  @Test
  public void hasDuplicatedChars2() {
    assertEquals(strings.hasUniqueChars2("abcdea".toCharArray()), false);
  }
}