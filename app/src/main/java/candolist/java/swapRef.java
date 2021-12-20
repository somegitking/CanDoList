package candolist.java;

public class swapRef {

  static void swap(int[] a) {

    int temp;

    temp = a[0];
    a[0] = a[1];
    a[1] = temp;


  }

  public static void main(String[] args) {
    System.out.println("Call by Reference 예제");

    int[] arr = {1234, 562456};


    System.out.printf("Before: %d, %d\n",  arr[0], arr[1]);

    swap(arr);

    System.out.printf("After: %d, %d\n",  arr[0], arr[1]);




  }


}
