public class GCD_Euclid {
    static int gcd_1(int a , int b ){
        while(a!=b){
            if(a>b) {
                a = a - b;
            }
                else{
                    b=b-a;
                }
        }
        return a;
    }

    static int gcd_2(int a , int b){
        if(b==0){
            return a ;
        }
        else{
            return gcd_2(b,a%b);
        }
    }
    public static void main(String[] args){
        int a = 25;
        int b = 15;
        int result = gcd_2(a,b);
        System.out.println(result);
    }
}
