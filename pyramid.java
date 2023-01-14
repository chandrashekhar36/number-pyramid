import java.util.*;
class pyramid
{
  public static void main(String args[])
  {
    Scanner scanner = new Scanner(System.in);
    int n;
    System.out.println("enter a pyramid size");
    n=(int)scanne.nextInt();
    for (int a=1; a<=n; a++)
    {
      for (int b=1; b<=(n-a)*2; b++)
      {
        System.out.print(" ");
      }
      for (int k=1; k<=a; k++)
      {
        System.out.println"   "+a);
      }
      System.out.print();
    }
  }
}
