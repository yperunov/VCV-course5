public class Main {
    public static void main(String[] args) {
        System.out.println("Showing how to use custom exceptions");
        try {int num1 = 2;
        int num2 = 0;
        if (num2 == 0) {
            throw new DividingByZeroException("Can't divide by zero");
        }
            double divideResult = num1 / (num2*1d);
            System.out.println(divideResult);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        finally {
            System.out.println("Dividing by zero exception");
        }
    }
}

