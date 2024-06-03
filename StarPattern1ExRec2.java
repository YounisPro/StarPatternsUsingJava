public class StarPattern1ExRec2 {
    public static void main(String[] args) {
        int size=args[0]!=null?Integer.parseInt(args[0]):10;
        System.out.println(print(size,"",""));
    }

    static String print(int size,String str,String output){
        if(size>0){
            String strO=str+"*"+print(size-1,"*"+str,output);
            output+=str.isEmpty()?strO:"\n"+strO;
            return output;
        }else
            return "";
    }
}

