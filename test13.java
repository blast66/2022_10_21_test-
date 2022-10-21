public class test13	 {
    public static void main(String[] args) {
       	int row = 0 ;
		String star = "*";
			while(row < 10) {                  
				int b = 4 - row;
				
				while(b > 0){                 
					System.out.print(" ");    
					b = b - 1;                
				}     
				if(row<=4){
					star = star + "**";		      
				}
				if(row == 5 ){
					star = star + "**";	
				}
				System.out.println(star);
				row = row + 1;
			}
	}
}