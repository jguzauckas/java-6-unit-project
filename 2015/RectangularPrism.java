public class RectangularPrism {
    private int length;
    private int width;
    private int height;

    public RectangularPrism(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public int surfaceArea() {
        return 2 * length * width + 2 * width * height + 2 * height * length;
    }

    public int smallestSide() {
        int s1 = length * width;
        int s2 = width * height;
        int s3 = length * height;
        if (s1 <= s2 && s1 <= s3) {
            return s1;
        } else if (s2 <= s1 && s2 <= s3) {
            return s2;
        }
        return s3;
    }

    public int shortestDist() {
        int p1 = 2 * (length + width);
        int p2 = 2 * (width + height);
        int p3 = 2 * (length + height);
        if (p1 <= p2 && p1 <= p3) {
            return p1;
        } else if (p2 <= p1 && p2 <= p3) {
            return p2;
        }
        return p3;
    }

    public int volume() {
        return length * width * height;
    }
}
