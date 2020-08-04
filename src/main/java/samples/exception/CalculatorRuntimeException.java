package samples.exception;

public class CalculatorRuntimeException extends RuntimeException {
    CalculatorRuntimeException(String message) {
        super(message);
    }    
}