class StarPattern35Ex1{
    public static void main(String[] args) {
        int size=args[0]!=null?Integer.parseInt(args[0]):10;
        
        for(int i=1;i<=size;i++){
            for(int j=0;j<i;j++)
                System.out.print(j*(i-1));
            System.out.println();    
        }
    }
}
/*
 *  0
 *  01
 *  024
 *  0369
 *  0481216
 * 
 * 
 * 
 */