class StarPattern10Ex1{
    public static void main(String[] args) {
        int size=args[0]!=null?Integer.parseInt(args[0]):10;
        
        for(int i=1;i<size;i++){
            for(int j=1;j<size;j++)
                if(j<=size/2-(i-1) || (i>=size/2 && j<=i-(size/2)+1))
                    System.out.print(" ");
                else if(j<size/2+(i-1) && i<=size/2 || (i>size/2 && j<size-(i-(size/2-1))))
                    System.out.print("*");
            System.out.println();
        }
    }
}