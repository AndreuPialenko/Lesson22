public class SecondLambdaApp {
    static int x = 10;
    static int y = 20;

    interface Operation{
        int calculate();
    }

    interface Operationable {
        int calculate (int x, int y);
    }

    public static void main(String[] args) {
        Operation op = () -> {
            x = 30;
            return x + y;
        };

        System.out.println(op.calculate());
        System.out.println(x);

        m2();
        m3();
    }

    private static void m2(){
        int n = 70;
        int m = 30;

        Operation op = () -> {
//            n = 100; нельзя менять значение переменной в лямбда выражении
            return m + n;
        };

//        n = 100; нельзя менять значение лямбда переменной и после - final.
        System.out.println(op.calculate());
    }

    private static void m3(){
        Operationable op = (x, y) -> {
            if (y == 0){
                return 0;
            }else {
                return x / y;
            }
        };

        System.out.println(op.calculate(10,30));
    }
    interface OperationableGeneric<T>{
        T calculate(T x, T y);
    }

    private static void m4(){
        OperationableGeneric<Integer> o1 = (x,y) -> x + y;
        OperationableGeneric<String> o2 = (x,y) -> x + y;
    }

}
