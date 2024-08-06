
public class QA3 {

    public static void main(String[] args) {
        String s="Hello";
        s.concat("Pune");
        System.out.println(s);
    }
}

//So in this code output of code is Hello ..it will not print HelloPune
// because String class is immutable class so it cants change the value of string
//for HelloPune Output I need to store the concat string values in another String and print that string
//For ex concatString=s.concat("Pune") so it will show as expected output