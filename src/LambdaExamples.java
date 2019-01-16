public class LambdaExamples {
    interface Printable {
        void print(String s);
    }

    interface Operationable {
        int calculate(int x, int y);
    }

    public static void main(String[] args) {
        Operationable opAnanym = new Operationable() {
            @Override
            public int calculate(int x, int y) {
                return x + y;
            }
        };

        int resultAnanym = opAnanym.calculate(10, 20);

        Operationable operation = ((x, y) -> x + y); // Лямба вариант реализации кода выше
        int result = operation.calculate(10, 20);

        Operationable operation2  = ((x, y) -> x - y);
        int result2 = operation2.calculate(10, 20);

        System.out.println(result2);


        Printable printer = S -> System.out.println(S);

        Printable p2 = System.out::println;


        printer.print("Hello");

        p2.print("Hello");
    }


}