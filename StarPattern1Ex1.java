import java.util.*;
import java.io.*;

class StarPattern1Ex1{
    public static void main(String[] args) {
        PrintStream out=System.out;
        
        int size=args[0]!=null?Integer.parseInt(args[0]):10;
        String output="",str="";
        for(int i=0;i<size;i++){
            str+="*";
            output+=str+"\n";
        }
        System.out.println(output);
    }
}