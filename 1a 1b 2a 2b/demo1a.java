class Retailitem {
   private String desc;
   private int units;
   private double price;

   Retailitem(String x,int y,double z) {
      this.desc = x;
      this.units = y;
      this.price = z;
   }

   public void setx1(int x1) {
      this.units = x1;
   }

   public void setx2(int x2) {
      this.price = x2;
   }

   public String getD() {
      return this.desc;
   }

   public int getx1() {
      return this.units;
   }

   public double getx2() {
      return this.price;
   }
}

public class demo1a {
   public static void main(String[] args) {
      Retailitem r1 = new Retailitem("x", 1, 900);
      Retailitem r2 = new Retailitem("y", 2, 96785);
      Retailitem r3 = new Retailitem("z", 3, 0);      
      System.out.println(r1.getD()+r1.getx1()+r1.getx2());
      r1.setx1(0);
      r1.setx2(0);
      System.out.println(r1.getD()+r1.getx1()+r1.getx2());
      System.out.println(r2.getD()+r2.getx1()+r2.getx2());
      r2.setx1(0);
      r2.setx2(0);
      System.out.println(r2.getD()+r2.getx1()+r2.getx2());
      System.out.println(r3.getD()+r3.getx1()+r3.getx2());
      r3.setx1(0);
      r3.setx2(0);
      System.out.println(r3.getD()+r3.getx1()+r3.getx2());
   }
}
