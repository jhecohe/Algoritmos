public class RaizCuadrada {
    
    public static int mySqrt(int x) {
        
        if(x==0 || x==1){
            return x;
        }
        int init = 1, end = x, mid = -1;

        //Binary search way
        while(init<=end){
            mid = init + (end-init)/2;
            System.out.println(mid);
            System.out.println(Math.pow(mid,2));
            if(Math.pow(mid,2) == x){
                return mid;
            } else if (Math.pow(mid,2) < x){
                init = mid+1;
            }
            else {
                end = mid-1;
            }
        }

        return end;
    }

    public static void main(String[] args) {
        System.out.println("===:>  " + mySqrt(8));
    }
}
