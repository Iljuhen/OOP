package sems.sem2;

public class main {
    public static void main(String[] args) {
        Zoo zoo1 = new Zoo();
        zoo1.addAnimal(new Cat("Vasya", 1, "gray"))
                .addAnimal(new Dog("Ignat", 10, "black"));
        for (Animal an : zoo1.getAnimals()) {
            System.out.println(an);
            System.out.println(an.say());

        }

    }
}
