package L4;

public class Rectangle {
    private float length;
    private float width;

    public Rectagle() {
        length = 1.0f;
        width = 1.0f;
    }
    public Rectagle (float length, float width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }
    public void setLength(float length) {
        this.length = length;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(float width) {
        this.width = width;
    }
    public double getArea() {
        return length * width;
    }
    public double getPerimeter() {
        return (width + length) * 2;
    }
    public String toString() {
        return "Rectangle[length: " + length + ", width=" + width + "]";
    }

}
