
public class Oop_14_Constructor {
    public static void main(String[] args){
        box b1 = new box();
        System.out.println(b1.volume());


        box b2 = new box(22,21,22);
        double x = b2.volume();
        System.out.println(x);

    }
    
}

class box{
    double heigth ;
    double length ;
    double width ;

    box(){
        heigth = 0;
        length = 0;
        width =0 ;
    }
    box(double h,double l,double w){
        heigth=h;
        length=l;
        width = w;
    }

     public double volume(){
        
        double vol = heigth*length*width;
        return vol;
     }
}
