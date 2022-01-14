class piformula
{
    public static void main(String[] args)
    {
        double pi = 0;      

            for(int i = 0; i < 1000000; i++)
            {
            double variablePart = 0;
            for(int j = 1; j <= i; j++)
            {
                variablePart += (Math.pow(-1, j+1) / ((2 * j) - 1));
            }

            pi = 4 * variablePart;
            System.out.printf("Pi = " + pi + "\n");
        }
    }
}