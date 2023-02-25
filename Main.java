public class Main {
    public static void main(String[] args) {
        Rectange rec  = new Rectange();
        Triangle tri = new Triangle();

        rec.set_values(10,10);
        tri.set_values(20,10);

        System.out.println(rec.area());
        System.out.println(tri.area());
    }
}