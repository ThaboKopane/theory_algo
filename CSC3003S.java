import java.util.Arrays;
import java.util.Scanner;

public class CSC3003S{
    static final double TESTC = 0.075;
    static final double PRAC = 0.11;
    static final double STAGE1 = 0.065;
    static final double STAGE2 = 0.065;
    static final double STAGE3 = 0.1;
    static final double STAGE4 = 0.44;
    static final double PRACTICALS = 0.35;

    static double mark;
    private double[] written;
    private double[] stages;
    private double[] toaPracticals;

    public CSC3003S(double[] Wtests, double[] stages, double[] toA){
        written = Wtests;
        this.stages = stages;
        toaPracticals = toA;

        testMarks(Wtests);
        Capstone(stages);
        practicals(toA);
    }

    
    //Percentage of marks from test1 and test 2
    void testMarks(double[] tests){
        tests = written;
        double ma = 0.0;
        for(int i=0; i<tests.length; i++)
            ma += tests[i]*TESTC;

        mark += ma;



    }
    //percentage of marks from stage 1, 2, 3 and 4 for capstone
    void Capstone(double[] capStages){
        capStages = stages;
        double m1 = capStages[0]*STAGE1*PRACTICALS;
        m1 += capStages[1]*STAGE2*PRACTICALS;
        m1 += capStages[2]*STAGE3*PRACTICALS;
        m1 += capStages[3]*STAGE4*PRACTICALS;

        mark += m1;

    }
    //percentage of marks from pracs 1,2,3
    void practicals(double[] progPrac){
        progPrac = toaPracticals;
        double m = 0.0;

        for(int i=0; i<progPrac.length; i++)
            m += progPrac[i]*PRAC*PRACTICALS;

        mark += m;
        
    }

    //return the mark obtained.
    public double howMuch(){

        return mark;
    }
    public static void main(String[] args){
        CSC3003S marks = new CSC3003S();
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your test scores separated by spaces");
        while(!scan.nextLine().equals("q")){
            double tests[] = Arrays.stream(scan.nextLine().split(" ")).mapToDouble(Double::parseDouble).toArray();

            System.out.println("Now for capstone");
            System.out.println("Enter your capstone scores separate by space");
            double capstone[] = Arrays.stream(scan.nextLine().split(" ")).mapToDouble(Duble::parseDouble).toArray();

            System.out.println("Now for the Theory of algorithm pracs");
            System.out.println("Enter your pracs separated by space");
            double toaPracs[] = Arrays.stream(scan.nextLine().split(" ")).mapToDouble(Double::parseDouble).toArray();

        }


    }
}