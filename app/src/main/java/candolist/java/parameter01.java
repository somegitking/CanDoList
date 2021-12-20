package candolist.java;

public class parameter01 {

  static void names(String...names) {
    for(int i = 0; i<names.length; i++) {
      System.out.printf("%s님 반갑습니다.\n", names[i]);


    }
    System.out.println("________");


  }


  public static void main(String[] args) {
    System.out.println("가변 파라미터 예제입니다.");

    names("111");

    names("111","222");

    names("111","222", "333");







  }


}
