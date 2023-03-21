package pdf2.Task1;

public class Parent { 
    void diplay()//default accsses modifire
    { 
        System.out.println("Parent_ diplay_method"); 
    } 
    //private void m1(){
      // System.out.println("parent_m1 private method");
    //}
   protected void m2() {
     System.out.println("parent_m2 protected method");
  }
public static void m3(){
     System.out.println("parent_m3 Static method");
  }
}
