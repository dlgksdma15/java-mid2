package generic.ex3;

import generic.animal.Dog;

public class DogHospital {
    private Dog animal; // x001;

    public void set(Dog animal){
        this.animal = animal; // this.animal = x001;
    }

    public void checkup(){
        System.out.println("동물 이름: " + animal.getName()); // x001.getName();
        System.out.println("동물 크기: " + animal.getSize()); // x001.getSize();
        animal.sound(); // x001.sound();
    }

    public Dog bigger(Dog target){
        return animal.getSize() > target.getSize() ? animal : target;
    }
}
