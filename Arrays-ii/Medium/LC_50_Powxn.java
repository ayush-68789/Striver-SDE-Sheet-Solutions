public class LC_50_Powxn {
    public static void main(String[] args) {
        double x = 2.00000 ;
        int n = 10 ;
        System.out.println(myPow(x, n));
    }   
    public static double myPow(double x, int n) 
    {
        long pow = n ;
        if(pow < 0)
        {
            x = 1 / x ;
            pow = -pow ; 
        }
        double ans = 1.0 ;
        while(pow > 0)
        {
            if(pow % 2 == 1)
            {
                ans *= x ;
                pow -- ;
            }
            else
            {
                pow = pow / 2 ; 
                x = x * x ;
            }
        }
        return ans ;
    } 
}
