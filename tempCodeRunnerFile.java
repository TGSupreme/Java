public class Oop_12_Area {
    public static void main(String[] args) {
        Area ar = new Area();
        ar.area(4);
        ar.area(4 , 6);
        ar.area(2.3);
        ar.area(2.3 , 3.5);
    }
  
}

class Area{
    void area(int x){
        //Square
        int ans = x*x;
        System.out.println("Area = "+ ans);
    }
    void area(int x,int y){
        //ractangle
        int ans = x*y;
        System.out.println("Area = "+ ans);
    }
    void area(double x){
        //circle
        double ans = (3.14 * x * x);
        System.out.println("Area = "+ ans);
    }
    void area(double x, double y){
        //triangle
        double ans = (0.5 * x * y);
        System.out.println("Area = "+ ans);
    }
}



