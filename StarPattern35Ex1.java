class StarPattern35Ex1{
    public static void main(String[] args) {
        int size=args[0]!=null?Integer.parseInt(args[0]):10;
        
        for(int i=0,k=0;i<size*2-1;i++){
            
            if(i<size-(k+1) || i>size+k-1)
                System.out.print(" ");
            else 
                if(k%2==0)
                    System.out.print(i%2==0?"*":" ");
                else System.out.print(i%2==0?" ":"*");
            if(k<size-1 && i==size*2-2){
                i=-1;
                k++;
                System.out.println();
            }
        }
        System.out.println();
    }
}
/*
 *      *    
 *     * *   
 *    * * *  
 *   * * * * 
 *  * * * * *  
 * 
 * 
 * 
 */