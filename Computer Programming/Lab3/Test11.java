public class Test11{
    public static void main(String [] args){
        int n=100000,i;
        double s=1, e=0;
        for(i=1;i<=n;i++){
            s/=i;
            e+=s;
        }
        System.out.println(e+1);
    }
}
