public class Factorial{
    static int factor(int n){
        int res=1;
        for(int i=2; i<=n; i++){
            res=res*i;
        }
        return res;
    }
    public static void main(String[] args) {
        int num=5;
        int calculated_factorail= factor(num);
        System.out.println("Factorial of number"+ num +" is : " + calculated_factorail);
    }
}