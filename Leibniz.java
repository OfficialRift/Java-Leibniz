class piformula
{
    public static void main(String[] args)
    {
        double pi = 0;  
        double variablePart = 0;    

        for(int i = 1; i < 100001; i++)
        {
            variablePart += (Math.pow(-1, i+1) / ((2 * i) - 1));
            pi = 4 * variablePart;
            System.out.printf("Pi = " + pi + "\n");
        }
    }
}