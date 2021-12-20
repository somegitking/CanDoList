package candolist.java;

public class parameter02 {

  static void names(String[] names) {
    for(int i = 0;i < names.length; i++ ) {
      System.out.printf("%s님 반갑습니다. \n", names[i]);


    }
    System.out.println("-------------------");

  }


  public static void main(String[] args) {
    System.out.println("가변 파라미터 예제입니다.");

    String[] arr1 = {"111"};
    String[] arr2 = {"111", "222"};
    String[] arr3 = {"111", "222", "333"};


    names(arr1);
    names(arr2);
    names(arr3);







  }


}
