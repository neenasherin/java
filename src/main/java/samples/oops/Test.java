public class Test {

    protected int x;
    protected int y;

    Test(int x, int y) {
        this.x = x;
        this.y = y;
    }


    public int sum() {
        return x + y;
    }

    public int product() {
        return x * y;
    }



    public static void main(String[] args) {
        Test t = new Test(10, 20);
        
        System.out.println(t.sum());
        System.out.println(t.product());
    }
}