class StarPattern7Ex1{
    public static void main(String[] args) {
        int size=args[0]!=null?Integer.parseInt(args[0]):10;
        
        for(int i=0;i<size;i++){
            for(int j=1;j<size*2;j++)
                if(j<size-i)
                    System.out.print(" ");
                else if(j<=size+i)
                    System.out.print(j<=size?j-(size-(i+1)):j-(size-(i-1)+(j-(size+1))*2));
            System.out.println();
        }
    }
}