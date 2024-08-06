public class QA7 {
    QA7()
    {
        System.out.println("Hello Constructor");
    }
    static
    {
        System.out.println("Hello Static");
    }

    public static void main(String[] args) {

        QA7 qa7=new QA7();

    }
}

//Hello Static
//Hello Constructor
//static things goes into the mwmory before object creation and constructor will call after object creation thats why the output sequence like this..