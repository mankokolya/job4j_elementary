package ru.job4j.condition;

public class Triangle {
    private Point a;
    private Point b;
    private Point c;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    /**
     * This method calculates perimeter of a triangular according to the lengths of its sides;
     *
     * @param ab - distance between point a and b;
     * @param ac - distance between point a and c;
     * @param bc - distance between point b and c;
     * @return - perimeter;
     */
    public double halfPerimeter(double ab, double ac, double bc) {
        return (ab + ac + bc) / 2;
    }

    /**
     * @param ab  - distance between point a and b;
     * @param ac - distance between point a and c;
     * @param bc - distance between point b and c;
     *
     * @return - true if the triangular can exist otherwise false;
     */
    public boolean exist(double ab, double ac, double bc) {
        return ab + ac > bc && ab + bc > ac && ac + bc > ab;
    }

    /**
     * This method calculates an area of a triangular;
     *
     * @return - area of the triangular if it exist or -1;
     */

    public double area() {
        double result = -1.0;
        double ab = this.a.distance(this.b);
        double ac = this.a.distance(this.c);
        double bc = this.b.distance(this.a);
        double halfPerimeter = halfPerimeter(ab, ac, bc);
        if (this.exist(ab, ac, bc)) {
            result = Math.sqrt(halfPerimeter * (halfPerimeter - ab) * (halfPerimeter - ac) * (halfPerimeter - bc));
        }
        return result;
    }
}
