class Strategy {
  public static void main(String[] args) {
      System.out.println("This is a redhead.");
      RedheadDuck redhead = new RedheadDuck();
      redhead.fly();

      System.out.println("This is a rubber duck.");
      RubberDuck rd = new RubberDuck();
      rd.fly();
  }
}

abstract class Duck {
  FlyBehavior fb;
  QuackBehavior qb;

  void fly() { fb.fly(); }
  void quack() { qb.quack(); }
  /* Other stable things */
}

class RedheadDuck extends Duck {
  RedheadDuck() {
      fb = new FlyWithWings();
      qb = new NormalQuack();
  }
}

class RubberDuck extends Duck {
  RubberDuck() {
      fb = new NoFly();
      qb = new SqueakQuack();
  }
}

interface QuackBehavior { public void quack(); }
class NormalQuack implements QuackBehavior {
  public void quack() { System.out.println("Quack quack"); }
}
class SqueakQuack implements QuackBehavior {
  public void quack() { System.out.println("Squeak squeak"); }
}

// add quack behaviors; NormalQuack and SqueakQuack
//class WoodenDuck  - cannot fly
              //    - cannot quack: add NoQuack

interface FlyBehavior {
  public void fly();
}

class FlyWithWings implements FlyBehavior {
  public void fly() {
      System.out.println("Flying!");
  }
}

class NoFly implements FlyBehavior {
  public void fly() {
      System.out.println("Not flying!");
  }
}

