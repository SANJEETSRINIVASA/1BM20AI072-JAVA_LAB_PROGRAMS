class Car {
   private int model;
   private String make;
   private int speed;

   public Car(int model, String make, int speed) {
      this.model = model;
      this.make = make;
      this.speed = speed;
   }

   public int getModel() {
      return this.model;
   }

   public String getMake() {
      return this.make;
   }

   public int getSpeed() {
      return this.speed;
   }

   void accelerate() {
      this.speed += 5;
      System.out.println(this.speed);
   }

   void brake() {
      this.speed -= 5;
      System.out.println(this.speed);
   }
}

public class demo1b {
   static int i=1;    
   public static void main(String[] args) {
      Car c1 = new Car(1,"x",100);
      Car c2 = new Car(2,"y",120);
      Car c3 = new Car(3,"z",140);
      Car c4 = new Car(4,"p",160);
      Car c5 = new Car(5,"q",0);
      System.out.println(c1.getModel()+c1.getMake()+c1.getSpeed());
      while(i<=5){
         c1.accelerate();
         i++;
      }
      while(i!=0){
         c1.brake();
         i--;
      }
      System.out.println(c2.getModel()+c2.getMake()+c2.getSpeed());
      while(i<=5){
         c2.accelerate();
         i++;
      }
      while(i!=0){
         c2.brake();
         i--;
      } 
      System.out.println(c3.getModel()+c3.getMake()+c3.getSpeed());
      while(i<=5){
         c3.accelerate();
         i++;
      }
      while(i!=0){
         c3.brake();
         i--;
      } 
      System.out.println(c4.getModel()+c4.getMake()+c4.getSpeed());
      while(i<=5){
         c4.accelerate();
         i++;
      }
      while(i!=0){
         c4.brake();
         i--;
      } 
      System.out.println(c5.getModel()+c5.getMake()+c5.getSpeed());
      while(i<=5){
         c5.accelerate();
         i++;
      }
      while(i!=0){
         c5.brake();
         i--;
      } 
   }
}
