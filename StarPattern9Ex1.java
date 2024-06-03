class StarPattern9Ex1{
    public static void main(String[] args) {
        int size=args[0]!=null?Integer.parseInt(args[0]):10;
        
        for(int i=0;i<size;i++){
            for(int j=1;j<size*2;j++)
                if(j<=size-i || j>=size+i)
                    System.out.print((char)(64+(j<size+1?j:j-(j-size)*2)));
                else if(j<size+i)
                    System.out.print(" ");
            System.out.println();
        }
    }
}