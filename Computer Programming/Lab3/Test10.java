public class Test10{
    public static void main(String [] args){
        double LtoR=0, RtoL=0, i;
        int n=50000;
        for(i=1;i<=n;i++)
            LtoR+=1/i;
        for(i=n;i>=1;i--)
            RtoL+=1/i;
        System.out.println("Left to right : " + LtoR);
        System.out.println("Right to left : " + RtoL);
    }
}
