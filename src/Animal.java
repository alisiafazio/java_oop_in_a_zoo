class Animal {
    // Put your instance variables here
    String name;
    String favoriteFood;
    static int population = 0;
    public Animal(String name, String favoriteFood) {
        // put your initializer content here
        this.name = name;
        this.favoriteFood = favoriteFood;
        population += 1;
    }

    public void sleep() {
        // complete your sleep function here
        System.out.println(this.name + " sleeps for 8 hours");
    }

    public void eat(String food) {
        // complete your eat function here
        System.out.println(name + " eats " + food);
        if(favoriteFood.equals(food)){
            System.out.println("YUM!!! " + name +" wants more " + food);
        }else{
            System.out.println(name + " sleeps for 8 hours ");
        }
    }
}

