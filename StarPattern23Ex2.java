class StarPattern23Ex2{
    public static void main(String[] args) {
        int size=args[0]!=null?Integer.parseInt(args[0]):10;
        
        for(int i=0;i<size;i++){
            for(int j=0;j<i+1;j++)
                System.out.print(j%2==0?1:0);
            System.out.println();
        }
    }
}