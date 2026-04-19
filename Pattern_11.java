public class Pattern_11 {
    public static void main(String[] args){
        int n = 5;
        int stars = 1;
        for(int i = 1 ; i<=n ; i++){
            if(i % 2 == 0) stars=1;
            else stars=0;
            for(int j = 1 ; j<=i ; j++){
                System.out.print(stars);
                stars = 1-stars;
            }
            System.out.println();
        }
    }
}
