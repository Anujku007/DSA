public class Palindrome{
    boolean ispal(int x){

        int rev=0;
        int temp=x;
        while(temp!=0){
            int L_D=temp%10;
            rev=rev*10+L_D;
            temp=temp/10;
        }
        return (rev==x);

            
    }
    public static void main(String[] args) {
        int number=363;
        Palindrome obj = new Palindrome();
        boolean pal=obj.ispal(number);
        System.out.println(""+ number +" is palindrome: " +pal);

    }
}