class StarPattern25Ex1{
    public static void main(String[] args) {
        int size=args[0]!=null?Integer.parseInt(args[0]):10;
        
        for(int i=0;i<size;i++){
            int c=i<size/2?i:(size-(i+1));
            for(int j=0;j<size;j++)
                if(j<size/2-i || j<i-(size/2) || j>size/2+i || (i>size/2-i && j>size-(i-size/2+1)))
                    System.out.print(" ");
                else {
                    if(c==10)
                        c=0;
                    System.out.print(c);
                    if(c>8) {
                        c=j<size/2?0:c-1;
                    }else {
                        c=c+(j<size/2?+1:(c==0?9:-1));
                    }
                }
            System.out.println();
        }
    }
}
/*
 *           0
 *          121   
 *         23432  
 *        3456543   
 *       456787654
 *      56789098765 
 *     6789012109876  
 *    789012343210987   
 *   89012345654321098
 *  0123456789876543210
 *   89012345654321098
 *    789012343210987 
 *     6789012109876
 *      56789098765     
 *       456787654
 *        3456543 
 *         23432  
 *          121   
 *           0
 */           