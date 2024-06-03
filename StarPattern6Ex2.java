class StarPattern6Ex1{
    public static void main(String[] args) {
        int size=args[0]!=null?Integer.parseInt(args[0]):10;
        for(int i=0;i<size;i++){
            String p1=(((long)Math.pow(10, size-(i+1)))+"").replace("1", "-").replace("0","-");
            String p2=(((long)Math.pow(10, (i*2+1)-1))+"").replace("1", "*").replace("0","*");
            System.out.println(p1+p2);
        }
    }
}