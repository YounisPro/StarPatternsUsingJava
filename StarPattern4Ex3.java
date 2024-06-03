class StarPattern3Ex3{
    public static void main(String[] args) {
        int size=args[0]!=null?Integer.parseInt(args[0]):10;
        
        for(int i=0;i<size;i++){
            System.out.println((((long)Math.pow(10, size-(i+1)))+"").replace("1", "*").replace("0", "*"));
        }
    }
}