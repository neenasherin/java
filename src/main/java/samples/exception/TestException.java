import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class TestException {
    public static void main(String[] args) {

        int x = 20, y = 0;
        double result = 0;
        try {
            result = divide(x, 1);

        } catch (CalculatorException | CalculationException e) {
            result = 1;
            System.out.println(e.getMessage());
        } finally {
            result = -1;
        }

        String s = readFile();
        System.out.println(s);

        System.out.println(result);
    }

    public static double divide(Integer x, Integer y) throws CalculatorException, CalculationException {
        if (x == null || y == null) {
            throw new CalculatorException("X or Y is not defined");
        }

        if (y == 0) {
            throw new CalculationException("Y cannot be zero ");
        }
        double result = x / y;
        System.out.println("Result = " + result);
        return result;
    }

    static String readFile() {

        StringBuilder s = new StringBuilder();

        try (BufferedReader reader = new BufferedReader(new FileReader("file.txt"))) {
            s.append(reader.readLine());
        } catch (IOException e) {
            System.out.println(e);
            return s.toString();
        } 
        
        return s.toString();
    }
}