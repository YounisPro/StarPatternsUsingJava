class StarPattern7Ex2{
    public static void main(String[] args) {
        int size=args[0]!=null?Integer.parseInt(args[0]):10;
        
        for(int i=0;i<size;i++){
            for(int j=1;j<size*2;j++)
                if(j>(size*2)/2-i && j<(size*2)/2+i)
                    System.out.print(" ");
                else System.out.print("*");
            System.out.println();
        }
    }
}