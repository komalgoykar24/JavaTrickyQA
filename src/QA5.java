public class QA5 {
    public static void main(String[] args) {
        byte a=100,b=30,c;
        c=(byte)(a+b);
        System.out.println(c);
    }
}

//-126
//so output is -126 because the size of byte is 0 to 127 okay ..and addition of 100+30==130
//so as I said size of byte is 0 to 127 and our ans is 130 ..after 127 the valuse is incremnetes by 3
//that means -128,-127,-126 so our output will be-126