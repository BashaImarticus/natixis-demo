public class Sample{

    public static void main(String[] s){

        int n=13;
        int count=0;

        for(int i=1;i<=n;i++){
            if(n % i == 0) count++;
        }
        if(count== 2) System.out.println("prime");
        else System.out.println("Not prime");
    }
}