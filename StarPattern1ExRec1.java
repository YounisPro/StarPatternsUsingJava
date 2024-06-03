public class StarPattern1ExRec1 {
    public static void main(String[] args) {
        int size=args[0]!=null?Integer.parseInt(args[0]):10;
        println(0,size);
    }

    static void println(int i,int size){
        if(i<size){
            println(i, size-1);
        }
        print(i,size);
        System.out.println("* - "+("i: "+i+", size: "+size));
    }

    static void print(int j,int size){
        if(j<size){
            j++;
            print(j, size);
            System.out.print("*");
        }
    }
}