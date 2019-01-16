public class LambdaThree {
    interface Expression{
        boolean isEqual(int n);
    }

    private static void m1(){
        Expression Func = (n) -> n % 2 == 0;
        Expression Func2 = (n) -> n/3 == 10;

        int [] nums = {1, 2, 3, 5, 10, 15, 17, 30, 50};

        System.out.println(sum(nums, Func));
        System.out.println(sum(nums, Func2));

    }

    private static int sum(int[] numbers, Expression Func){
        int result = 0;

        for (int i:numbers){
            if (Func.isEqual(i)){
                result += i;
            }
        }
        return result;
    }

    static class ExpressionHelper{
        static boolean isEven(int n){
            return n % 2 ==0;
        }

        static boolean isPositive(int n){
            return n > 0;
        }

        boolean isNotEven(int n){
            return n % 2 != 0;
        }

    }

    public static void m2(){
        int [] nums = {-5, -3, -1, 0, 1, 2 ,5 ,7, 50};
        int sumOfEven = sum(nums, ExpressionHelper::isEven);

        Expression expr = ExpressionHelper::isPositive;

        int sumOfPositive = sum(nums, expr);

        ExpressionHelper exHelp = new ExpressionHelper();

        int sumOfNotEven = sum(nums, exHelp::isNotEven);
    }
}
