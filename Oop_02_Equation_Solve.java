
public class Oop_02_Equation_Solve {
    public static void main(String[] args) {
        // Write a program that solves the following equation and displays the value x
        // and y:
        // 1) 3.4x+50.2y=44.5
        // 2) 2.1x+.55y=5.9
        // ax+by=e x=ed-bf/ad-bc
        // cx+dy=f y=af-ec/ad-bc )
        System.out.println("3.4x+50.2y=44.5");
        System.out.println("2.1x+.55y=5.9 ");

        float a = 3.4f, b = 50.2f, c = 2.1f, d = 0.55f, e = 44.5f, f = 5.9f;

        float x = (e * d - b * f) / (a * d - b * c);
        float y = (a * f - e * c) / (a * d - b * c);

        System.out.println("\n\nSolution :\n");
        System.out.println("x = "+x);
        System.out.println("y = "+y);
    }

}