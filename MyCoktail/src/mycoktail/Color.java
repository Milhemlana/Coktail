
package mycoktail;
public class Color {
   private double r;
   private double g;
   private double b;
   public Color(){}
   public Color(double r,double g,double b){
       this.r=r;
       this.g=g;
       this.b=b;
   }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getG() {
        return g;
    }

    public void setG(double g) {
        this.g = g;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }
   public void getTotalColor(double r,double g,double b){
       double Red=0,Green=0,Blue=0;
       Red+=this.r;
       Green+=this.g;
       Blue+=this.b;
   }
}




