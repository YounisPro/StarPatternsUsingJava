class StarPattern27Ex1{
    public static void main(String[] args) {
        int size=args[0]!=null?Integer.parseInt(args[0]):10;
        
        for(int i=0;i<size;i++){
            for(int j=0;j<size*2-1;j++)
                if(j<size-(i+1) || j>=size+i)
                    System.out.print(" ");
                else System.out.print(j<size?size-j:(j-size)+2);
            System.out.println();
        }
    }
}
/*
 *     1 
 *    212
 *   32123
 *  4321234 
 */           