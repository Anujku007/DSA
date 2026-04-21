public class GCD {
    static int Gcd_cal(int a , int b){
        int res = Math.min(a,b);
        while(res>0){
            if(a%res==0 && b%res ==0){
                break;
            }
            res--;
        }
        return res;
    }
    public static void main(String[] args){
        int a = 140;
        int b = 600;
        int result = Gcd_cal(a,b);
        System.out.println(result);
    }
}
