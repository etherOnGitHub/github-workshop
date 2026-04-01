package basic;

public class Pet {
    private String name;
    private String species;
    private int age;

    //constructor
    public Pet(String name, String species, int age) {
        this.name = name;
        this.species = species;
        this.age = age;
    }

    public Pet(String species) {
        this.species = species;
        this.age = 0;
        this.name = "";
    }

    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }

    public int getAge() {
        return age;
    }

    void details() {
        IO.println(name + species + age);
    }
//    void incrementAge() {
//        age++;
//    }
}
