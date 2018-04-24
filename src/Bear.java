public class Bear extends Animal{

    public Bear(String name) {
        // put your constructor content here
        super(name,"fish");
    }
    public void sleep() {
        // complete your sleep function here, noting the change from global to instance variables
        System.out.println(this.name + " hibernates for 4 months");
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
