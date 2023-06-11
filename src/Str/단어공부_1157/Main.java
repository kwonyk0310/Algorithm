package Str.단어공부_1157;

import java.util.Scanner;

public class Main {

  public static int[] getAlphabetCount(String str){
    int[] count = new int[26];
    for (int i = 0; i < str.length(); i++) {
      count[str.charAt(i) - 'A']++;
    }
    return count;
  }

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    String str = sc.next().toUpperCase();

    int[] countAlphabet = getAlphabetCount(str);

    int maxCnt = -1;
    char maxAlp = '?';

    for (int i = 0; i < countAlphabet.length; i++) {
      if (maxCnt < countAlphabet[i]){
        maxCnt = countAlphabet[i];
        maxAlp = (char)('A' + i);
      }else if(maxCnt == countAlphabet[i]){
        maxAlp = '?';
      }
    }

    System.out.print(maxAlp);
  }
}
