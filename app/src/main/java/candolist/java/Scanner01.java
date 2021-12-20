package candolist.java;

import java.util.Scanner;

public class Scanner01 {

  public static void main(String[] args) {
    Scanner keyScan = new Scanner(System.in);
    System.out.print("밑변의 길이?");
    int len = keyScan.nextInt();
    keyScan.close();
    System.out.println(len+10);


  }
}
