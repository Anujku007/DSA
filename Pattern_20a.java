public class Pattern_20a {
    public static void main(String[] args){
        int n = 5;

        for(int i = 1; i <= 2*n; i++){
            int stars = i <= n ? i : 2*n - i;
            int spaces = 2*(n - stars);

            // stars
            for(int j = 1; j <= stars; j++){
                System.out.print("*");
            }

            // spaces
            for(int j = 1; j <= spaces; j++){
                System.out.print(" ");
            }

            // stars
            for(int j = 1; j <= stars; j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}