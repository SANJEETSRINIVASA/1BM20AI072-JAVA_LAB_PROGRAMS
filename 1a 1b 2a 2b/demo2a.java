class A {
    private int i1,i2;
    protected float f1,f2;
    public int p1,p2;

    public void disp() {
        System.out.println(p1+p2);
    }
    
    public int gI1() {
        return this.i1;
    }

    public int gI2() {
        return this.i2;
    }

    public A(int i1, int i2, float f1, float f2, int p1, int p2) {
        this.i1=i1; this.i2=i2; this.f1=f1; this.f2=f2; this.p1=p1; this.p2=p2;
    }

    public A() {
        System.out.println("A");    //Default Constructor of class A
    }
}

class B extends A {
    public void disp() {
        System.out.println(f1+f2);
        super.disp();                //Using super() to Override the parent class A's disp() method
    }

    public B(int i1, int i2, float f1, float f2, int p1, int p2) {    //Parameterized Constructor of class B
        super(i1,i2,f1,f2,p1,p2);
    }

    public B() {
        System.out.println("B");
    }
}

final class C extends B { //Making the child classes non inheritable
    public void disp() {
        System.out.println(p1+p2);
    }

    public C(int i1, int i2, float f1, float f2, int p1, int p2) {
        super(i1,i2,f1,f2,p1,p2);
    }

    public C() {
        System.out.println("C");
    }
}

final class D extends B { //Making the child classes non inheritable
    public void disp() {
        System.out.println(gI1()+gI2());
        super.disp();
    }

    public D(int i1, int i2, float f1, float f2, int p1, int p2) {
        super(i1,i2,f1,f2,p1,p2);
    }

    public D() {
        System.out.println("D");
    }
}

public class demo2a {
    public static void main(String[] args) {
        D d1 = new D(); //Default Constructor
        d1.disp();
        D d2 = new D(1,2,3,4,5,6); //Parameterized Constructor
        d2.disp();
    }
}
