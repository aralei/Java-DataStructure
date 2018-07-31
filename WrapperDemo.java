// package whatever; // don't place package name!

public class WrapperDemo {
  public static void main(String[] args) {
    MemoryCell m = new MemoryCell();
    
    m.write(new Integer(37));
    Integer wrapperVal = (Integer)m.read();
    int val = wrapperVal.intValue();
    System.out.println("Contents are : " + val);
  }
}

class FindMaxDemo {
  //return max item in arr.
  //precondition: arr.length > 0.
  public static Comparable findMax (Comparable[] arr) {
    int maxIndex = 0;
    for (int i = 1; i < arr.length; i++) {
      if (arr[i].compareTo(arr[maxIndex]) > 0){
        maxIndex = i;
      }
    }
    return arr[maxIndex];
  }
  
  //test findMax on shape and string objects
  public static void main(String[] args) {
    Shape[] sh1 = {
      new Circle(2.0),
      new Square(3.0),
      new Rectangle(3.0,4.0)
    };
    
    String[] st1 = {"joe","bod","lily","luck"};
    
    System.out.println(findMax(sh1));
    System.out.println(findMax(st1));
  }
}
