public class Bee extends Animal {

    public Bee(String name) {
        // put your constructor content here
        super(name,"pollen");
    }
    public void sleep() {
        // complete your sleep function here, noting the change from global to instance variables
        System.out.println(this.name + " never sleeps");
    }

    public void eat(String food) {
        // complete your eat function here!
        if(favoriteFood.equals(food)){
            System.out.println("YUM!!! " + name+ " wants more pollen");
            sleep();
        }else{
            System.out.println("YUCK!!! " + name + " will not eat " + food);
            System.out.println(name + " eats " + favoriteFood);
        }
    }
}
