
interface Operation {
    public int calculate(int a, int b);
}

class Sum implements Operation {
    public int calculate(int a, int b) {
        return a + b;
    }
}

class Multiplication implements Operation {
    public int calculate(int a, int b) {
        return a * b;
    }
}

class SumLadron implements Operation {
    public int calculate(int a, int b) {
        return a + b - 1;
    }
}



public class Calculator {

    Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    private int a, b;

    public int execute(Operation o) {
        return o.calculate(a, b);
    }

    static public void main(String[] args) {
        Calculator c = new Calculator(3, 2);

        Operation s = new Sum();
        Operation m = new Multiplication();
        Operation sm = new SumLadron();

        System.out.println(c.execute(s));
        System.out.println(c.execute(m));
        System.out.println(c.execute(sm));





//        System.out.println(c.calc((int a, int b) -> { return a + b;}));
//        System.out.println(c.calc((a, b) -> { return a + b;}));
//        System.out.println(c.calc((a, b) -> a + b));
//        System.out.println(c.calc((int a, int b) -> { return a + b;}));
//        System.out.println(c.calc((int a, int b) -> { return a + b;}));

    }
}
