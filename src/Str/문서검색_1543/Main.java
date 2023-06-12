package Str.문서검색_1543;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    String word = sc.nextLine();


    int startIndex = 0;
    int count = 0;

    while (true) {
      int findIndex = str.indexOf(word, startIndex);
      if (findIndex < 0)
        break;
      startIndex = findIndex + word.length();
      count++;
    }
    System.out.print(count);
  }
}
