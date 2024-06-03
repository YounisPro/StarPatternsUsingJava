class StarPattern28Ex1{
    public static void main(String[] args) {
        int size=args[0]!=null?Integer.parseInt(args[0]):10;
        int sum=0;
        
        for(int i=1;i<size;i++){
            String str="";
            sum+=i;
            for(int j=sum-i;j<sum;j++){
                System.out.print(str+(i%2!=0?j+1:sum-j+sum-i));
                str="*";
            }
            
            System.out.println();
        }
    }
}
/*
 *  1
 *  3*2
 *  4*5*6
 *  10*9*8*7
 *  11*12*13*14*15
 */           