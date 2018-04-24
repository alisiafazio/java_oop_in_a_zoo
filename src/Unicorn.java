public class Unicorn extends Animal {

    public Unicorn(String name) {
        // don't forget to correct the call to the superclass initializer!
        super(name, "marshmallows");
    }

    public void sleep() {
        // your overridden sleep code...
        System.out.println(this.name + " sleeps in a cloud");
    }
    public void eat(String food) {
        // complete your eat function here!
        System.out.println(name + " eats " + food);
        if(favoriteFood.equals(food)){
            System.out.println("YUM!!! " + name +" wants more " + food);
        }else{
            sleep();
        }
    }
}
