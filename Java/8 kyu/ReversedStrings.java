/*
Complete the solution so that it reverses the string passed into it.

'world'  =>  'dlrow'
*/

import java.util.Arrays;

public class Kata {

  public static String solution(String str) {
    StringBuilder build = new StringBuilder();
    return build.append(str).reverse().toString();
  }

}