class StarPattern18Ex1{
    public static void main(String[] args) {
        int size=args[0]!=null?Integer.parseInt(args[0]):10;
        
        for(int i=0;i<size;i++){
            for(int j=0;j<size*2-1;j++)
                if(j>=i && j<size*2-(i+1))
                    System.out.print("*");
                else
                    System.out.print("-");
            System.out.println();
        }
    }
}