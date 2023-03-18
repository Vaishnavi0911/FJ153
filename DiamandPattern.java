public class DiamandPattern
{
  public static void main( String [] str)
  {
    int n=5;
    for(int i=1; i<=n; i++)
    {
      for(int j=1; j<=(n-i); j++)
      {
        System.out.println(" ");
      }
      for(int j=1;j<=(2n-i); j++)
      {
       System.out.println(" @");
      }
      System.out.println(" ");
    }
}