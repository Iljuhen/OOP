package sems.sem2;

public class main {
    public static void main(String[] args) {
        Zoo zoo1 = new Zoo();
        zoo1.addAnimal(new Cat("Vasya", 1, "gray"))
                .addAnimal(new Dog("Ignat", 10, "black"))
                .addAnimal(new Duck("Donuld", 3, "White"));
        for (Animal an : zoo1.getAnimals()) {
            System.out.println(an);
            System.out.println(an.say());

        }

        System.out.println("___Sound of the zoo__________");

        for (Speakabll speak : zoo1.getSpeakables()) {
            System.out.println(speak.say());
            
        }
        for (Runable runner : zoo1.getRunner()) {
            System.out.println("Ranners speed is " +runner.speedOfRun());
        }
        int max_speed = zoo1.getChampionOfRunners();
        System.out.println(String.format("Max of speed in the zoo, is %d",max_speed));

        for (Flyable flyer : zoo1.getFlyers()) {
            System.out.println("Flyers speed is " +flyer.speedOfFly());
        }
       
    }
    
}
