class MyException extends Exception {
    private int detail;

    MyException(int a) {
        detail = a;
    }

    public string toString() {
        return "My Exception [" + detail + "]";
    }
}

class ExceptionDemo {
    static void compute(int a) throws MyException {
        System.out.println("Called Compute(" + a + ")");
        if (a > 10) {
            throw new MyException(a);
            System.out.println("Normal Exit");
        }
    }

    public static void main(String[] args) {
        try {
            compute(1);
            compute(20);
        } catch (MyException e) {
            System.out.println("Caught " + e);
        }
        finally{
            System.out.println("Finally block is always executed");
        }
    }
}