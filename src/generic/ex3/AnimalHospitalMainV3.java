package generic.ex3;

import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMainV3 {
    public static void main(String[] args) {
        AnimalHospitalV3<Dog> dogHospital = new AnimalHospitalV3<>(); // x002
        AnimalHospitalV3<Cat> catHospital = new AnimalHospitalV3<>();
        //AnimalHositalV3<Integer> integer = new AnimalHositalV3<Integer>();
        //AnimalHositalV3<Object> object = new AnimalHositalV3<>();

        Dog dog = new Dog("멍멍이1",100);
        Cat cat = new Cat("냐옹이1", 300);

        // 개 병원
        dogHospital.set(dog); // x002.set(x001);
        dogHospital.checkup(); // x002.checkup();

        // 고양이 병원
        catHospital.set(cat);
        catHospital.checkup();


        // 문제1: 개 병원에 고양이 전달
        // dogHospital.set(cat); // 다른 타입 입력: 컴파일 오류

        // 문제2: 개 타입 변환
        dogHospital.set(dog);
        Dog biggerDog = dogHospital.bigger(new Dog("멍멍이2", 200));
        System.out.println("biggerDog = " + biggerDog);
    }
}
