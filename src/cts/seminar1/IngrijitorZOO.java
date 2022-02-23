package cts.seminar1;

public class IngrijitorZOO {
    private String name;

    public IngrijitorZOO(String name) {
        this.name = name;
    }

    public void hranesteAnimal(Animal animal, String hrana){
        animal.mananca(hrana);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
