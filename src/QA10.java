public class QA10 {
    public static void main(String[] args) {
        String s1=new String("India");
        String s2=new String("India");
        if(s1==s2)
            System.out.println("Same");
        else
            System.out.println("NOT Same");
    }
}

//NOT Same
//becuse == compare memory address of two objects which is different
//if I want to Output Same then I will use equals() which compare contents of two strings..
//s1.equals(s2) ->Same