class StarPattern15Ex1{
    public static void main(String[] args) {
        int size=args[0]!=null?Integer.parseInt(args[0]):10;
        
        for(int i=1;i<size*2;i++){
            for(int j=0;j<size;j++)
                if(j<size-i || (i>size && j<i-size))
                    System.out.print(" ");
                else System.out.print(i<=size?j-(size-(i+1)):j-(i-(size+1)));

            System.out.println();
        }
    }
}