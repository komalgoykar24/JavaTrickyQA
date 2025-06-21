import java.time.LocalDate;
import java.time.LocalTime;

public class Demo implements A,B {
    public static void main(String[] args) {
    Demo demo=new Demo();
    demo.print();
    }
    @Override
    public void print()
    {
        A.super.print();
    }
}
