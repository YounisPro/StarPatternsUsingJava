import java.util.*;

class StarPattern2ExRec1{
    public static void main(String[] args) {        
        int size=args[0]!=null?Integer.parseInt(args[0]):10;
        System.out.println(print("",size,""));
    }

    static String print(String str,int size,String output){
        if(size>0){
            String obj=print(" "+str,size-1,output)+" "+str+((long)(Math.pow(10, size-1))+"").replace("1","*").replaceAll("0", "*");
            output+=str.isEmpty()?obj:obj+"\n";
            return output;
        }else
            return "";
    }
}