import java.util.*;
import java.io.*;

class StarPattern1Ex2{
    public static void main(String[] args) {
        int size=args[0]!=null?Integer.parseInt(args[0]):10;
        for(int i=0;i<size;i++){
            for(int j=0;j<=i;j++)
                System.out.print("*");
            System.out.println();
        }
    }
}