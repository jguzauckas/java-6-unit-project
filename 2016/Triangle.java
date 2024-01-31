public class Triangle {
    private int a;
    private int b;
    private int c;

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public boolean isTriangle() {
        return (a + b > c && a + c > b && b + c > a);
    }

    public int isTriangles(Triangle tri1, Triangle tri2) {
        int count = 0;
        if (this.a + tri1.a > tri2.a && this.a + tri2.a > tri1.a && tri1.a + tri2.a > this.a) {
            count++;
        } 
        if (this.b + tri1.b > tri2.b && this.b + tri2.b > tri1.b && tri1.b + tri2.b > this.b) {
            count++;
        }
        if (this.c + tri1.c > tri2.c && this.c + tri2.c > tri1.c && tri1.c + tri2.c > this.c) {
            count++;
        }
        return count;
    }
}
