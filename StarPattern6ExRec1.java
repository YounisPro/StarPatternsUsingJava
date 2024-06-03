class StarPattern6Ex1{
    public static void main(String[] args) {
        int size=args[0]!=null?Integer.parseInt(args[0]):10;
        System.out.println(print("",size,""));
    }

    static String print(String str,int size,String output){
        if(size>=0){
            String p1=(((long)Math.pow(10,(size*2+1)-1))+"").replace("1", "*").replace("0", "*");
            String obj=print(str+" ",size-1,output)+str+" "+p1;
            output+=obj+"\n";
            return output;
        }else return "";
    }
}