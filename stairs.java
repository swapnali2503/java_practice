/* There are n stairs, a person standing at the bottom wants to climb stairs to reach the nth stair. 
The person can climb either 1 stair or 2 stairs at a time,
 the task is to count the number of ways that a person can reach at the top. */


 import java.util.*;
public class stairs{
    

        // Function to calculate number of ways to reach the nth stair
        public static int countWays(int n) {
            // Base cases
            if (n == 1) return 1;
            if (n == 2) return 2;
    
            // dp[i] will store the number of ways to reach the ith stair
            int[] dp = new int[n + 1];
            
            // Initializing the base values
            dp[1] = 1;
            dp[2] = 2;
    
            // Filling the dp array using the recurrence relation
            for (int i = 3; i <= n; i++) {
                dp[i] = dp[i - 1] + dp[i - 2];
            }
    
            return dp[n];
        }
    
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the value of n:");
            int n = sc.nextInt();  // Example input
            System.out.println("Number of ways to reach the " + n + "th stair: " + countWays(n));
        }
    }
    
