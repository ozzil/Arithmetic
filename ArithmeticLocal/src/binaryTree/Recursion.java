package binaryTree;

public class Recursion {
    
    
   //再帰関数
    public static long factorial(int n) {
        if(n == 1) {
            return 1;
        }else {
        return n*factorial(n-1);
    }
  }
    
    public static void main(String[] args) {
        long num = factorial(3);
        System.out.println(num);
    }
}
