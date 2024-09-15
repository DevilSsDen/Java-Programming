public class CircleArea {
    private float pi = 3.14f;
    private float radius;

    public void setRadius(float rad) {
        radius = rad;
    }

    public float calculateArea() {
        return pi * radius * radius;
    }

    public static void main(String[] args) {
        CircleArea circle = new CircleArea();
        circle.setRadius(5.0f);
        float area = circle.calculateArea();
        System.out.println("The area of the circle is: " + area);
    }
}
