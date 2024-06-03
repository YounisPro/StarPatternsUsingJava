class StarPattern3Ex3{
    public static void main(String[] args) {
        int size=args[0]!=null?Integer.parseInt(args[0]):10;
        
        System.out.println(print("",size,""));
    }

    static String print(String str,int size,String output){
        if(size>0){
            String obj= print(str+"*",size-1,output)+str+"*";
            output+=obj+"\n"+output;
            return output;
        }else 
            return "";
    }
}