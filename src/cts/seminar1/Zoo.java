package cts.seminar1;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private String name;
    private IngrijitorZOO ingrijitorZOO;
    private List<Animal> animale;

    public Zoo(String name, IngrijitorZOO ingrijitorZOO) {
        this.name = name;
        this.ingrijitorZOO = ingrijitorZOO;
        this.animale = new ArrayList<Animal>();
    }

    public void addAnimal(Animal animal){
        animale.add(animal);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public IngrijitorZOO getIngrijitorZOO() {
        return ingrijitorZOO;
    }

    public void setIngrijitorZOO(IngrijitorZOO ingrijitorZOO) {
        this.ingrijitorZOO = ingrijitorZOO;
    }

    public void hranesteAnimale(String hrana){
        for( Animal animal: animale){
            ingrijitorZOO.hranesteAnimal(animal,hrana);
        }
    }
}
