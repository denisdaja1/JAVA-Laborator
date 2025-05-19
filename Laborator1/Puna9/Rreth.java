class Rreth extends FigureGjeometrike {
    public Rreth(double r) {
        super(r, 0, 0);
    }

    public double llogaritPerimeter() {
        return 2 * Math.PI * a;
    }

    public String toString() {
        return "Rreth me rreze " + a;
    }
}

class Drejtkendeshi extends FigureGjeometrike {
    public Drejtkendeshi(double gjatesia, double gjeresia) {
        super(gjatesia, gjeresia, 0);
    }

    public double llogaritPerimeter() {
        return 2 * (a + b);
    }

    public String toString() {
        return "Drejtkendeshi " + a + " x " + b;
    }
}

class Trekendeshi extends FigureGjeometrike {
    public Trekendeshi(double a, double b, double c) {
        super(a, b, c);
    }

    public boolean eshteValid() {
        return a + b > c && a + c > b && b + c > a;
    }

    public double llogaritPerimeter() {
        if (!eshteValid()) return 0;
        return a + b + c;
    }

    public String toString() {
        return "Trekendeshi (" + a + ", " + b + ", " + c + ")";
    }
}
