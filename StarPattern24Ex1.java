class StarPattern24Ex1{
    public static void main(String[] args) {
        int size=args[0]!=null?Integer.parseInt(args[0]):10;
        
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++)
                if(i==0 || i==size-1 || j==0 || j==size-1 || (i==size/3 && j>=size/3 && j<=(size/3)*2)
                || (i==(size/3)*2 && j>=size/3 && j<=(size/3)*2) || (i>size/3 && i<(size/3)*2 && (j==size/3 || j==(size/3)*2)))
                    System.out.print("*");
                else System.out.print(" ");
            System.out.println();
        }
    }
}

// **********
// *        *
// *        *
// *  ****  *
// *  *  *  *
// *  *  *  *
// *  ****  *
// *        *
// *        *
// **********