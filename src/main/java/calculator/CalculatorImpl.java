package calculator;

public class CalculatorImpl implements Calculator {

    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public int subtract(int a, int b) {
        return a - b;
    }

    @Override
    public int multiply(int a, int b) {
        return a * b;
    }

    @Override
    public int divide(int a, int b) throws ArithmeticException {
        try {
            if (b == 0) {
                throw new ArithmeticException();
            }
            return a / b;
        } catch (ArithmeticException e) {
            System.out.println("Math E R R O R ! ! !" + e.getMessage());
        }
        return -1;
    }

    @Override
    public int modulo(int a, int b) {
        return a % b;
    }

    @Override
    public boolean isPositive(int a) { // number is NOT negative
        if (a >= 0) {
            return true;
        }
        return false;
    }

    @Override
    public boolean isNegative(int a) {
        if (a < 0)
            return true;
        return false;
    }

    @Override
    public boolean isOdd(int a) {
        if (a % 2 == 0)
            return true;
        return false;
    }

    @Override
    public int min(int a, int b) {
        if (a > b) {
            System.out.print("min value is: ");
            return b;
        } else if (a < b) {
            System.out.print("min value is: ");
            return a;
        } else if (a == b) {
            System.out.print("numbers have the same value: ");
        }
        return a;
    }

    @Override
    public int max(int a, int b) {
        if (a > b) {
            System.out.print("Max value is: ");
            return a;
        } else if (a < b) {
            System.out.print("Max value is: ");
            return b;
        } else if (a == b) {
            System.out.print("numbers have the same value: ");
        }
        return a;
    }

    @Override
    public double average(int a, int b) {
        var v = (double) (a + b) / 2;
        return v;
    }

    @Override
    public int power(int a, int x) {
        return (int) Math.pow(a, x);
    }

    @Override
    public int addThreeIntegers(int a, int b, int c) {
        return a + b + c;
    }

    @Override
    public int subtractThreeIntegers(int a, int b, int c) {
        return a - b - c;
    }

    @Override
    public int multiplyThreeIntegers(int a, int b, int c) {
        return a * b * c;
    }

    @Override
    public double divideThreeIntegers(int a, int b, int c) throws ArithmeticException {
        try {
            if (b == 0 || c == 0) {
                throw new ArithmeticException();
            }
            return a / b / c;
        } catch (ArithmeticException e) {
            System.out.println("Math E R R O R ! ! ! " + e.getMessage());
        }
        return -1;
    }

    @Override
    public int minOfThreeIntegers(int a, int b, int c) {
        int[] tab = {a, b, c};
        int min = tab[0];
        for (int i = 0; i < tab.length; i++) {
            if (tab[i]<min)
            return min = tab[i];
        }
        return min;
    }

    @Override
    public int maxOfThreeIntegers(int a, int b, int c) {
        int[] tab = {a,b,c};
        int max = tab[0];
        for (int i = 0; i < tab.length; i++) {
            if (tab[i]>max)
                return max = tab[i];
        }
        return max;
    }

    @Override
    public double averageOfThreeIntegers(int a, int b, int c) {
        var v = (double) (a + b + c) / 3;
        return v;
    }
}
