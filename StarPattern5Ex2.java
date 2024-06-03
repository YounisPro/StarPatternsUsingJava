class StarPattern5Ex1{
    public static void main(String[] args) {
        int size=args[0]!=null?Integer.parseInt(args[0]):10;
        String p1="",p2="";
        for(int i=0;i<size;i++){
            p1=((long)Math.pow(10,size-(i+1))+"").replace("1", " ").replace("0", " ");
            p2=((long)Math.pow(10,i)+"").replace("1", "* ").replace("0", "* ");
            System.out.println(p1+p2);
        }
    }
}