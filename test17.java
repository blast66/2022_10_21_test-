public class test17 {
    public static void main(String[] args) { 
        for(int i = 1 ; i<=6; i++){
            int c = 1;
            for(int z=0; z<6;z++){
                if(z<6-i){
                    System.out.print("*");
                }
                else{
                    System.out.print(c);
                    c = c+1;
                }
            }
            System.out.println();
            }
            
        
        
    }
}