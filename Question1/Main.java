public class Main{
    public static void main(String [] args){
        Vector v1 = new Vector(26, 1, 3, 4, 2, 5);
        //view
        System.out.println("The Vectors are \n" + v1.toString());
        //Add
        v1.add();
        //subtract
        v1.subtract();
        //dotProduct
        v1.dotProduct();
        //crossProduct
        v1.crossProduct();
        System.out.println("=================================");
        Timer t1 = new Timer(2, 56,6);
        Timer t2 = new Timer(2, 7, 5);
        t2.getAll();
        t2.toString();
        t2.convertToSeconds();
        t1.getAll();
        Timer result = t1.add(t2);
        System.out.println("Sum: " + result);



    }
}