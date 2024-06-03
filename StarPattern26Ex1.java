class StarPattern26Ex1{
    public static void main(String[] args) {
        int size=args[0]!=null?Integer.parseInt(args[0]):10;
        
        String p1="",stars="";
        for(int i=0;i<size;i++){
            stars=((char)(65+i))+stars;
            p1+=(p1.isEmpty()?stars:"\n"+stars);
        }
        System.out.println(p1);
    }
}
/*
 *A
 *BA
 *CBA
 *DCBA
 */           