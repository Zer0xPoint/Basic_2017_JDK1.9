package Day16;

public class Graph {
    private double circumference;

    public Graph() {
    }

    public double getCircumference() {
        return circumference;
    }

    public Graph(double r) {
        this.circumference = r * Math.PI * 2;
        System.out.println("圆形 周长为" + this.circumference);
    }

    public Graph(double length, double width) {
        this.circumference = (length + width) * 2;
        System.out.println("长方形 周长为" + this.circumference);
    }

    public Graph(int length) {
        this.circumference = length * 4;
        System.out.println("正方形 周长为" + this.circumference);
    }

    public Graph(double a, double b, double c) {
        this.circumference = a + b + c;
        System.out.println("三角形 周长为" + this.circumference);

    }

}

class GraphTestDrvie {
    public static void main(String[] args) {
        Graph graph1 = new Graph(2.1);
        Graph graph2 = new Graph(2.1,3.5);
        Graph graph3 = new Graph(2);
        Graph graph4 = new Graph(1.3, 1.0, 4.0);
    }
}
