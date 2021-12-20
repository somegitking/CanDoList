package candolist.java;





public class method {

  static int plusTwo(int a, int b) {

    a = a + b +2;
    return a;

  }

  public static void main(String[] args) {
    System.out.println("메소드 중첩 호출 예제");

    System.out.println(plusTwo(2, 1));

    System.out.println(plusTwo(plusTwo(2, 1), 1));

    System.out.println(plusTwo(plusTwo(plusTwo(2, 1), 1), 1));




  }

}
