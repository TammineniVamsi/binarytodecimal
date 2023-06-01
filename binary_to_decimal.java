public class decimaltobinary{
    public static int bintodec(int binary){
        int pow=0;
        int dec=0;
        int lastdgt;
        while(binary>0){
            lastdgt=binary%10;
            dec=dec+(lastdgt*(int)Math.pow(2,pow));
            binary=binary/10;
            pow++;
        }
        return dec;
        

    }
    public static void main(String args[]){
        int binary=1010;
        System.out.println(bintodec(binary));
    }
}
