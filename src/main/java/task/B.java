package task;

public class B extends A {
    int i = Math.round(3.5f);

    public static void main(String[] args) {
        A a = new B();
        a.print();
    }

    void print() {
        System.out.println(i);
    }

}
