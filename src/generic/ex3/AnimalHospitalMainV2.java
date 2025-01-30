package generic.ex3;

import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMainV2 {
    public static void main(String[] args) {
        AnimalHositalV2<Dog> dogHospital = new AnimalHositalV2<>();
        AnimalHositalV2<Cat> catHospital = new AnimalHositalV2<>();
        AnimalHositalV2<Integer> integerHospital = new AnimalHositalV2<>();
        AnimalHositalV2<Object> objectHositalV2 = new AnimalHositalV2<>();
    }
}
