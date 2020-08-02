public class Test2 extends Test {
    
    Test2(int x, int y) {
        super(x, y);
    }

    public double divide() {
        if(y == 0) throw new IllegalArgumentException("Division by 0");
        return x / y;
    }

    public static void main(String[] args) {
        Test2 t = new Test2(20, 10);
        System.out.println(t.divide());
        System.out.println(t.sum());
        System.out.println(t.product());
    }
}