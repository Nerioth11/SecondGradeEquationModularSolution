package SecondGradeModular;

/**
 * Created by joel on 17/9/15.
 */
public class Output {

    public void welcome(){
        System.out.println("Bienvenido a la aplicación para resolver ecuaciones de 2º grado");
    }
    public void entry1(){
        System.out.println("Introduzca el primer término:");
    }
    public void entry2(){
        System.out.println("Introduzca el segundo término:");
    }
    public void entry3() { System.out.println("Introduzca el tercer término:"); }
    public void results(double x, double y){
        System.out.println("Primer resultado =" + " " + x);
        System.out.println("Segundo resultado =" + " " + y);
    }
}
