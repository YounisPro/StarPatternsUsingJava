class StarPattern30Ex1{
    public static void main(String[] args) {
        int size=args[0]!=null?Integer.parseInt(args[0]):10;
        
        for(int i=0;i<size;i++){
            for(int j=0;j<size/2;j++){
                if(i>=size/3 && i<=(size/3)*2 && j==size/4)
                    System.out.print("|");
                else if(j<size/2-i-1 || (i>=size/2 && j>=size/2-(i-size/2)) || (i>=size/3 && i<=(size/3)*2) && j>i-size/2 
                    && j<size/2-(size/2-(i)))
                    System.out.print(" ");
                else
                    System.out.print("*");
                    
            }
            System.out.println();
        }
    }
}
/*      *
 *     **
 *    ***
 *    |**  
 *  * | *
 *  **|
 *  ***
 *  **
 *  *
 */           