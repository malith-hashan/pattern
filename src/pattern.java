public class pattern {
    public static void main(String[] args) {
        pattern1(4);
        System.out.println("\n");
        pattern2(4);
        System.out.println("\n");
        pattern3(5);
        System.out.println("\n");
        pattern4(5);
        System.out.println("\n");
        pattern5(9);
        System.out.println("\n");

    }

    static void pattern1(int n){
        for (int row=1 ; row<=n ; row++){
            for (int col=1 ; col<=row ; col++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }

    }



    static void pattern2(int n){
        for (int row=1;row <=n ;row++){
            for (int col=1;col<=n;col++)
            {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }

    static  void pattern3(int n){
        for(int row=1;row<=n;row++){
            for (int col=1;col<=(n-row+1);col++){
                System.out.print("* ");
            }
            System.out.println("\n");
        }
    }

    static void pattern4(int n){
        for (int row=1 ;row<=5;row++){
            for (int col=1;col<=row;col++){
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }

    static void pattern5(int n){
        int row;
        int col;
        for(row=1;row<Math.round(n/2)+1;row++){
            for (col=1;col<=row;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(row=Math.round(n/2)+1;row<=n;row++){
            for (col=1;col<=n-row+1;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }



}
