package oops;

class Animal {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class Dog extends Animal {
    private String breed;

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}

class Amimaltest {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.setName("Buddy");
        myDog.setAge(3);
        myDog.setBreed("Labrador Retriever");

        System.out.println("Name: " + myDog.getName());
        System.out.println("Age: " + myDog.getAge());
        System.out.println("Breed: " + myDog.getBreed());

        // Modifying the variables
        myDog.setName("Max");
        myDog.setAge(5);
        myDog.setBreed("Golden Retriever");

        System.out.println("\nModified values:");
        System.out.println("Name: " + myDog.getName());
        System.out.println("Age: " + myDog.getAge());
        System.out.println("Breed: " + myDog.getBreed());
    }
}
