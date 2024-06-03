class StarPattern17Ex1{
    public static void main(String[] args) {
        int size=args[0]!=null?Integer.parseInt(args[0]):10;
        
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++)
                if(j<=size/2-i || j>=size/2+i || (i>size/2 && (j<=i-size/2 || j>size-(i-size/2+2))))
                    System.out.print("*");
                else
                    System.out.print(" ");
            System.out.println();
        }
    }
}