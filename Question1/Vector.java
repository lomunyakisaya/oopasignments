public class Vector {
    int [] vector1 = new int[3];
    int [] vector2 = new int [3];

   public Vector(int x, int y, int z, int p, int q, int r){
        this.vector1[0] = x;
        this.vector1[1] = y;
        this.vector1[2] = z;
        this.vector2[0] = p;
        this.vector2[1] = q;
        this.vector2[2] = r;
    }
    public void add(){
        int sum1 = this.vector1[0] + this.vector2[0];
        int sum2 = this.vector1[1] + this.vector2[1];
        int sum3 = this.vector1[2] + this.vector2[2];

        
        System.out.println("==========The sum of Vectors A and B is=============");
        System.out.println("\t\t\t<" + sum1 + "," + sum2 + "," + sum3 + ">");
    }
    public void subtract(){
        int sum1 = this.vector1[0] - this.vector2[0];
        int sum2 = this.vector1[1] - this.vector2[1];
        int sum3 = this.vector1[2] - this.vector2[2];
        System.out.println("==========The Difference of Vectors A and B is=============");
        System.out.println("\t\t\t<" + sum1 + "," + sum2 + "," + sum3 + ">");
    }
    public void dotProduct(){
        int value =0;
        for(int i=0; i < 3; i++){
           int product = vector1[i] * vector2[i];
           value += product;
        }
        System.out.println("==========The Dot Product of Vectors A and B is============="); 
        System.out.println("\t\t\t<" + value + ">");
    }
    public void crossProduct(){
        int det1 = vector1[1] * vector2[2] - vector1[2]*vector2[1];
        int det2 = vector1[1] * vector2[2] - vector1[0]*vector2[2];
        int det3 = vector1[0] * vector2[1] - vector1[1]*vector2[0];
        System.out.println("==========The Cross Product of Vectors A and B is============="); 
        System.out.println("\t\t\t<"+ det1 + "," + det2 + "," + det3 + ">");
    }
    @Override 
    public String toString(){
        return "Vector 1 is: <" + this.vector1[0] + this.vector1[1] + this.vector1[2] + ">" + "\t" + "Vector 2 is: <" + this.vector2[0] + this.vector1[1] + this.vector1[2]  +">";
    }
}
