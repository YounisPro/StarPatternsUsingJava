class StarPattern3Ex1{
    public static void main(String[] args) {
        int size=args[0]!=null?Integer.parseInt(args[0]):10;
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                if (j<i)
                    System.out.print(" ");
                else if(j<size)
                    System.out.print("*");
            }
            System.out.println();
        }
    }
}