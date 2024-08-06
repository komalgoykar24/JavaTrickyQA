//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class QA1 {
    int n=10;
    public static void main(String[] args) {
        System.out.println(n+5);
    }
}

//D:\intellijIDEA\JavaTrickyQA\src\Main.java:6:28
//java: non-static variable n cannot be referenced from a static context

//It means we cant not call n ot static things from static..
// but if I declare n variable as a static then it returns me 15 Output as expected..