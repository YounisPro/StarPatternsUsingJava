class StarPattern33Ex1{
    public static void main(String[] args) {
        int size=args[0]!=null?Integer.parseInt(args[0]):10;
        
        
        for(int i=0;i<size;i++){
            for(int j=0;j<size*2-1;j++){
                if(j<size-i || j>=size+i-1)
                    System.out.print((char)(65+j));
                else
                    System.out.print(" ");
                    
            }
            System.out.println();
        }
    }
}
/*
ABCDEFG
ABC EFG
AB   FG
A     G
*/