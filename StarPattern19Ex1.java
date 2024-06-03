class StarPattern19Ex1{
    public static void main(String[] args) {
        int size=args[0]!=null?Integer.parseInt(args[0]):10;
        
        for(int i=1;i<size;i++){
            for(int j=0;j<(size*2)-3;j++)
                if(j>=size-(i+1) && j<=size+(i-3))
                    System.out.print((char)(64+(j<size-1?(j+2)-(size-i):i+(size-(j+2)))));
                else
                    System.out.print(" ");
            System.out.println();
        }
    }
}