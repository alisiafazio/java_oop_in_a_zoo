public class Giraffe extends Animal {

    public Giraffe(String name) {
        // don't forget to correct the call to the superclass initializer!
        super(name, "leaves");
    }

    public void eat(String food) {
        // complete your eat function here!
        if (favoriteFood.equals(food)) {
            System.out.println("YUM!!! " + name + " wants more " + food);
            sleep();
        } else {
            System.out.println("YUCK!!! " + name + " will not eat " + food);
            System.out.println(name + " eats " + favoriteFood);
        }
    }
}