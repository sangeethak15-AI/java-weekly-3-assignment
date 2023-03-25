public interface advarithmetic {
    int divisor_sum(int n);
}
class MyCalculator implements advarithmetic
{
    @Override
    public int divisor_sum(int n) {
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                sum+=i;
            }

        }
        return sum;
    }

    public static void main(String[] args) {
        MyCalculator obj=new MyCalculator();
        System.out.println("Result: "+obj.divisor_sum(7));
    }
}
