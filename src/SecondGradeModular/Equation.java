package SecondGradeModular;

/**
 * Created by joel on 17/9/15.
 */
public class Equation {
    private static double a;
    private static double b;
    private static double c;
    private static double result1;
    private static double result2;

    public static void main(String[] args) {
        Input input = new Input();
        Output output = new Output();
        Process process = new Process();
        output.welcome();
        output.entry1();
        a=input.input();
        output.entry2();
        b=input.input();
        output.entry3();
        c=input.input();
        result1 = process.result1(a,b,c);
        result2 = process.result2(a,b,c);
        output.results(result1,result2);
    }
}
