public class test15 {
    public static void main(String[] args) {
        int l = 4 ;  
        int s = 0;
        int col = 0;
        
        for(int row = 0;row<9;row++) {
            col = 0;
            for(; col<l;){
                System.out.print(" ");
                col = col+1;
            }
            
            col = 0;            
            for(;col <= s;){
                System.out.print("*");
                col = col+1;
            }
            System.out.println();
            if(row<4){
                s = s+2;
                l = l-1;
            }
            else{
                s = s-2;
                l = l+1;
            }
        
        }
        
    }
}