class StarPattern29Ex1{
    public static void main(String[] args) {
        int size=args[0]!=null?Integer.parseInt(args[0]):10;
        
        int sum=0;
        for(int i=1;i<size;i++){
            
            for(int j=0;j<size;j++){
                if(j<size-i)
                    System.out.print(" ");
                else
                    System.out.print((char)((65+sum)+(size-(j+1))));
                    
            }
            sum+=i;
            System.out.println();
        }
    }
}
/*
 *      A
 *     CB 
 *    FED  
 *   JIHG
 *  ONMLK
 */           