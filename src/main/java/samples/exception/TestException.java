public class TestException {
    public static void main(String[] args) {

        int x = 20, y = 0;
        double result = 0;
        try {
            result = divide(x, 0);
        } catch (ArithmeticException e) {
            result = 5;
        } catch (RuntimeException e) {
            result = 1;
        } catch (Exception e) {

        }
        System.out.println(result);
    }

    public static double divide(Integer x, Integer y) throws Exception {
        if (x == null || y == null) {
            throw new Exception("X or Y is not defined");
        }

        if (y == 0) {
            throw new RuntimeException("Y cannot be zero ");
        }
        double result = x / y;
        System.out.println("Result = " + result);
        return result;
    }
}