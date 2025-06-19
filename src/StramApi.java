import java.util.Arrays;

public class StramApi {
    public static void main(String[] args) {
        int a[]={12,67,54,32,55,9,03,39};
        int sum=0;
        for(int i=0;i<a.length;i++)
        {

            if(a[i]%2==0)
            {
                System.out.println(a[i]);
                sum=sum+a[i];
            }
        }
        System.out.println("Sum :"+sum);

        int b[]={12,67,54,32,55,9,03,39};
        long sum2=0;
        sum2=sum2+ Arrays.stream(b).filter(n ->n % 2 == 0).sum();
        System.out.println("Sum2 :"+sum2);
    }

}

