public class test16	 {
    public static void main(String[] args) {
		int blank = 4;
		int star = 0;
        int col;
        
        for (int row = 0; row < 9 ;){
            col = 0;
            for (;col < blank;) {
                System.out.print(" ");
                col += 1;
            }
            col = 0;
            for (;col <= star;) {
                System.out.print("*");
                col += 1;
            }
            System.out.print("\n");
            
            if(row < 4) {
                blank -= 1;
                star += 2;
            }
            else{
                blank += 1;
                star -= 2;
            }
            row += 1;
        }
    }
			
}