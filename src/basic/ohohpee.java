import basic.Pet;

void main() {
    // procedural
//    String petName = "Cooper";
//    String species = "Dog";
//    byte age = 6;
//    IO.println("basic.Pet is " + petName + " and is a " + species + " and is " + age);

    Pet p1 = new Pet("Chester", "cat", 1);
//    p1.name = "Chester";
//    p1.species = "cat";
//    p1.age = 1;

    Pet p2 = new Pet("Peggy", "dog", 4);
//    p2.name = "Peggy";
//    p2.species = "dog";
//    p2.age = 4;

    Pet p3 = new Pet("Dog");

    ArrayList<Pet> pets = new ArrayList<>();
    pets.add(p1);
    pets.add(p2);
    pets.add(p3);
    pets.forEach(Pet::details);
}