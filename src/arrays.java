void main() {
    // init array of numbers
    int[] numbers = new int[10];
    for (int i = 0; i < numbers.length ; i++){
        numbers[i] = i + 1;
        IO.println(numbers[i]);
    }

    int[] numbers2 = new int[]{1,2,3,4,5,6,7,8,9,10}; // old way
    int[] numbers3 = {1,2,3,4,5,6,7,8,9,10}; // declaration is assumed

    String[] names = {"mabel", "daisy", "viper", "bob"};
    String[] names2Copy = names.clone();

    names2Copy[2] = "Dave";
    Arrays.sort(names2Copy);

    for (int i = 0; i < names.length; i++){
        IO.println("1. " + names[i]);
        IO.println("2. " + names2Copy[i]);
    }

    for (String name : names2Copy) {
        IO.println(name);
    }

    ArrayList<String> pets =  new ArrayList<>();
    pets.add("Dave");
    pets.add("Daisy");
    pets.add("Bob");
    pets.add("Bumbo");
    pets.add("Dingleberry");

    IO.println(pets);

    pets.removeLast();
    pets.removeFirst();
    pets.add(2,"67");

    IO.println(pets);
}
