package sems.sem2;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

    private ArrayList<Animal> animals;

    private Radio radio = new Radio();

    public Zoo() {
        animals = new ArrayList<Animal>();
    }

    public Zoo addAnimal(Animal a) {
        animals.add(a);
        return this;
    }

    public List<Speakabll> getSpeakables() {
        List<Speakabll> answer = new ArrayList<Speakabll>();
        for (Animal an : animals) {
            answer.add(an);
        }
        answer.add(radio);
        return answer;
    }

    public List<Runable> getRunner() {
        List<Runable> result = new ArrayList<Runable>();
        for (Animal an : animals) {
            if (an instanceof Runable) {
                result.add((Runable) an);
            }

        }
        return result;
    }

    public List<Flyable> getFlyers() {
        List<Flyable> result = new ArrayList<Flyable>();
        for (Animal an : animals) {
            if (an instanceof Flyable) {
                result.add((Flyable) an);
            }

        }
        return result;
    }

    public int getChampionOfRunners() {
        int max_speed = 0;
        for (Runable runner : getRunner()) {
            if (max_speed < runner.speedOfRun()) {
                max_speed = runner.speedOfRun();

            }
        }
        return max_speed;

    }



    public ArrayList<Animal> getAnimals() {
        return animals;
    }

}
