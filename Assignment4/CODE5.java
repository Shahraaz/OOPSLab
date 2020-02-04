import java.io.InputStream;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.*;

/**
 * Marks
 */
abstract class Marks {
    abstract double getPercentage();
}
/**
 * StudentA
 */
class StudentA extends Marks{
    double list[];
    StudentA(double a,double b,double c)
    {
        list = new double[3];
        list[0] = a;
        list[1] = b;
        list[2] = c;
    }
    @Override
    double getPercentage() {
        // TODO Auto-generated method stub
        // System.out.println(Arrays.stream(list).sum() +" "+ list.length);
        return Arrays.stream(list).sum() / list.length;
    }
}

/**
 * StudentB
 */
class StudentB extends Marks{
    double list[];
    StudentB(double a,double b,double c,double d)
    {
        list = new double[4];
        list[0] = a;
        list[1] = b;
        list[2] = c;
        list[3] = d;
    }
    @Override
    double getPercentage() {
        // TODO Auto-generated method stub
        // System.out.println(Arrays.stream(list).sum() +" "+ list.length);
        return Arrays.stream(list).sum() / list.length;
    }
}


/**
 * CODE3
 */
public class CODE5 {

    public static void main(final String[] args) {
        StudentA A = new StudentA(10,20,30);
        StudentB B = new StudentB(10,20,30,40);
        System.out.println(A.getPercentage());
        System.out.println(B.getPercentage());
    }
}