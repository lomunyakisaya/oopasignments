public class Main {
    public static void main(String[] args) {
        Vector v1 = new Vector(1,2,3,4,5, 6);
        v1.add();
        v1.subtract();
        v1.dotProduct();
        v1.crossProduct();
        Timer t1 = new Timer(23, 43, 8);
        t1.getAll();
        t1.toString();
        t1.convertToSeconds();
        t1.decrementHour();
        t1.decrementMinute();

    }
}
