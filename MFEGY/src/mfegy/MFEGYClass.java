package mfegy;

public class MFEGYClass {

  private double EgyuthatoA;
 public double A;
 public double B;
 public double C;
 public double D;
 public int gyokszama;
 public double X1;
 public double X2;
 
 
   public double getA() {
       if ( EgyuthatoA==0) {
          System.out.println(" Az 'a' együttható nem lehet nulla!");
       }
       else{
       return A;
       }
      return A;
        
    }

    public void setA(double A) {
        this.A = A;
    }

    public double getB() {
        return B;
    }

    public void setB(double B) {
        this.B = B;
    }

    public double getC() {
        return C;
    }

    public void setC(double C) {
        this.C = C;
    }

    public double getD() {
        D=B*B-4*A*C;
        return D;
    }

    public int getGyokszama() {
        if ( D<0) {
            gyokszama=0;
        }
        else if (D==0) {
            gyokszama=1;
        }
        else if (D>0) {
            gyokszama=2;
        }
        return gyokszama;
    }

    public double getX1() {
        X1=(-B+Math.sqrt(D)/(2*A));
        return X1;
    }

    public double getX2() {
        X2=(-B-Math.sqrt(D))/(2*A);
        return X2;
    }
 
}

