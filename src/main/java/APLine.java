public class APLine
{
  /* your code here */
  private int a; private int b; private int c; private double slope; 
  public void setSlope( int a, int b ) {
    slope  = (double) a / (double) b ; }
  public double getslope() { return slope; } 
  public APLine ( int a, int b, int c) { 
                 this.a; this.b; this.c; }
  public boolean isOnLine(int x, int y){ 
    return ( (a*y + b*y + c)==0);
  } 
  
}
