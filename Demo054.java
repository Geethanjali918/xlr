public class Demo054 {
    public void display(int a) {
        System.out.println("Display method with one parameter: " + a);
    }
    public void display(int a, int b) {
        System.out.println("Display method with two parameters: " + a + " and " + b);
    }
    public void display(double a) {
        System.out.println("Display method with double parameter: " + a);
    }

    public static void main(String[] args) {
        Demo054 obj = new Demo054();
        obj.display(10);
        obj.display(10, 20);
        obj.display(10.5);
    }
}
