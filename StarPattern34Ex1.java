class StarPattern34Ex1{
    public static void main(String[] args) {
        int size=args[0]!=null?Integer.parseInt(args[0]):10;
        
        int sum=-size;
        for(int i=1;i<=size;i++){
            sum=sum+(size-i+2);
            int tmp=sum;
            for(int j=0;j<i;j++){
                System.out.print(tmp);
                tmp=tmp-(j+size-(i-1));
            }
            System.out.println();
        }
    }
}
/*
 *  
 * 
 * 
 * 1
 * 62
 * 1073
 * 131184
 * 15141295
 */