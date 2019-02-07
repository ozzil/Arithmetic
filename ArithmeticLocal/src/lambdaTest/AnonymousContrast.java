package lambdaTest;

public class AnonymousContrast {
    public static void main(String[] args) {
        
        AnonymousContrast acmilan = new AnonymousContrast();
        //抽象クラスを実現する、計算式を追加
        MathOperation mathOperation = (x, y) -> x + y;
        //
        System.out.println(acmilan.operation(5, 10, mathOperation));
        
    }
    interface MathOperation{
        //default int operation (int a, int b){
        //return a + b;}
         int operation(int a, int b);
    }
    private int operation(int a, int b, MathOperation mathOperation) {
        return mathOperation.operation(a, b);
    }
}
