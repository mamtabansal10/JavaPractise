
public class PallindromeNum {

	public static void main(String[] args) {
	System.out.println(isPalindrome(121));

	}
    public static boolean isPalindrome(int x) {
         if(x<0||x==10){
            return false;
         }
         int rev = 0;
         int n = x;
         while(n>0) {
        	  int r = n%10; // 0
        	  rev = rev*10+r; // 12
        	  n= n/10;        // 1
        	 
         }
		 return(x==rev);
		 }
		
         

     }


