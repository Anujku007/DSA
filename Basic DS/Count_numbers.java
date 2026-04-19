public class Count_numbers{
    static int CountDigit(int x){
        int res=0;
        while(x>0){
            x=x/10;
            res++;
        }
        return res;
    }
    public static void main(String[] args) {
        int number=89762;
        int count=CountDigit(number);
        System.out.println("The number of Digits :" +count);
    }
}