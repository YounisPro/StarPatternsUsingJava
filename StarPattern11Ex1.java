class StarPattern11Ex1{
    public static void main(String[] args) {
        int size=args[0]!=null?Integer.parseInt(args[0]):10;
        
        String p1="",p2="",stars="";
        for(int i=0;i<size;i++){
            stars+="*";
            p1=p1+stars+"\n";
            if(i!=size-1) p2=stars+(p2.isEmpty()?p2:"\n"+p2);
        }
        System.out.println(p1+p2);
    }
}