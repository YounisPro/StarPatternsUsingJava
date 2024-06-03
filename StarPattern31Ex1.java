class StarPattern31Ex1{
    public static void main(String[] args) {
        int size=args[0]!=null?Integer.parseInt(args[0]):10;
        
        
        for(int i=0;i<size;i++){
            for(int j=0;j<size*2;j++){
                if(j<size-i || j>size+i)
                    System.out.print(" ");
                else{
                    System.out.print(i%2==0?((j-(size-(i+1)))%2!=0 ? (j-(size-(i+1)))/2+1:" "):
                    ((j-(size-(i+1)))%2!=0 ? (char)(64+(j-(size-(i+1)))/2+1):" "));
                }
                    
            }
            System.out.println();
        }
    }
}
/*
         1         
        A B        
       1 2 3       
      A B C D      
     1 2 3 4 5     
    A B C D E F    
   1 2 3 4 5 6 7   
  A B C D E F G H  
 1 2 3 4 5 6 7 8 9 
A B C D E F G H I J
*/