public class QA9 {
    public static void main(String[] args) {
        System.out.println(((10&10)==0 )== ((5|5)==0));
    }
}
//true
//because & or | between same number is exactly that number okay..
//so 10==0 -> false and 5==0-> false
//false==false->true