package candolist.java;

public class swapValue {

  static void swap(int a, int b) {
    int temp;

    temp = a;
    a = b;
    b = temp;

    System.out.printf("After: %d, %d", a, b);



  }



  public static void main(String[] args) {
    System.out.println("Call by Value");

    int a, b;
    a = 1234; 
    b = 3462;

    System.out.printf("Befor: %d, %d\n", a, b);

    swap(a, b);



  }

}
