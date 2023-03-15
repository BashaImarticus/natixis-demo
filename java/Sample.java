public class Sample{

    public static void main(String[] s){

        int n=13;
        int count=0;
        boolean res =true;

        for(int i=2;i<n/2;i++){
            if(n % i == 0) res = false;
        }
        if(res ==true) System.out.println("prime");
        else System.out.println("Not prime");
    }
}