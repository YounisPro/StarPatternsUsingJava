import java.util.*;
import java.io.*;

class StarPattern2Ex1{
    public static void main(String[] args) {
        PrintStream out=System.out;
        
        int size=args[0]!=null?Integer.parseInt(args[0]):10;
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++)
                if(j<size-(i+1))
                    System.out.print(" ");
                else System.out.print("*");
        
            System.out.println();
        }
    }
}