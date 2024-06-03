class StarPattern23Ex1{
    public static void main(String[] args) {
        int size=args[0]!=null?Integer.parseInt(args[0]):10;
        
        String p1="",bin="";
        for(int i=0;i<size;i++){
            bin+=i%2==0?1:0;
            p1+=bin+"\n";
        }
        System.out.print(p1);
    }
}