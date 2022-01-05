class piformula
{
    public static void main(String[] args) {
        double pi = 0;
        double den = 1;

        for(int i = 0; i < 1000000000; i++)
        {
            if(i % 2 == 0)
            {
                pi = pi + (1/den);
            }
            else
            {
                pi = pi - (1/den);
            }
            den = den +2;
        }
        pi = pi * 4;
        System.out.println(pi);
    }
}