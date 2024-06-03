class StarPattern20Ex1{
    public static void main(String[] args) {
        int size=args[0]!=null?Integer.parseInt(args[0]):10;
        
        for(int i=0;i<size;i++){
            for(int j=0;j<(size*2);j++)
                if(j<size-(i+1) || j>size+i)
                    System.out.print(" ");
                else 
                    System.out.print((char)(((j<size?64+j-(size-i)+2:48+(j-size+1)))));
            System.out.println();
        }
    }
}