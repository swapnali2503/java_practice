

import java.util.*;
class regionONPlane{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number of straight lines:");
        int N = sc.nextInt();

        int result = Regions(N);
        System.out.println("The number of regions are:" + result);


        
    }
    public static int Regions(int N){
        int M =0;
        if(N>=0 && N<=100){
            M = (N*(N+1)/2)+1;

        }
        else{
            System.out.println("The number of lines must be between 0 to 100.");
        }
        return M;
    }

}