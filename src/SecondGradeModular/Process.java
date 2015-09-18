package SecondGradeModular;

/**
 * Created by joel on 17/9/15.
 */
public class Process {
    public double result1(double x, double y, double z){
        return (-y+Math.sqrt(Math.pow(y,2)-4*x*z))/2*x;
    }

    public double result2(double x, double y, double z){
        return (-y-Math.sqrt(Math.pow(y,2)-4*x*z))/2*x;
    }
}
