class StarPattern2Ex1{
    public static void main(String[] args) {
        int size=args[0]!=null?Integer.parseInt(args[0]):10;
        for(int i=0;i<size;i++){
            String p1=" ",p2="*";
            String s1=((long)(Math.pow(10, size-(i+1)))+"").replace("1",p1).replaceAll("0", p1);
            String s2=((long)(Math.pow(10, i))+"").replace("1",p2).replaceAll("0", p2);
            System.out.println(s1+s2);
        }
    }
}