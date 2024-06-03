class StarPattern3Ex2{
    public static void main(String[] args) {
        int size=args[0]!=null?Integer.parseInt(args[0]):10;
        String output="",stars="";
        for(int i=0;i<size;i++){
            stars+="*";
            output=(i==size-1)?stars+output:"\n"+stars+output;
        }
        System.out.println(output);
    }
}