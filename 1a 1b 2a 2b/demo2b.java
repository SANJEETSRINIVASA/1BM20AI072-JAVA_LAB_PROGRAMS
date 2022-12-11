abstract class shape {
    abstract void area();
}

class delta extends shape {
    float b;
    float h;
    float area;

    delta(float b,float h) {
        this.base = base;
        this.height = height;
    }

    void Area() {
        area=0.5*b*h;
    }

    void area() {
        System.out.println(this.area);
    }
}

class Circle extends shape {
    float r;
    float area;

    Circle() {}

    Circle(float r) {
        this.r=r;
    }

    void Area() {
        area=3.14*r*r;
    }

    void area() {
        System.out.println(this.area);
    }
}

class Hexagon extends shape {
    float s;
    float area;

    Hexagon(float s) {
        this.s=s;
    }

    void Area() {
        area=((3*1.73)/2)*s*s;
    }

    void area() {
        System.out.println(this.area);
    }
}

class Sphere extends Circle {

    Sphere(float r) {
        this.r=r;
    }

    void Area() {
        area = 4*3.14*r*r;
    }

    void area() {
        System.out.println(this.area);
    }
}

public class demo2b {
    public static void main(String[] args) {
        delta d=new delta(5,6);
        d.Area();
        d.area();
        
        Circle c=new Circle(3.14);
        c.Area();
        c.area();
        
        Hexagon h=new Hexagon(2);
        h.Area();
        h.area();

        Sphere s=new Sphere(5);
        s.Area();
        s.area();
    }
}
