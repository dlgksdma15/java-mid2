package generic.ex2;

public class Box<T> {
    private T value; // private Animal value;

    public void set(T value) { // set(Animal value){
        this.value = value;  // this.value = value;
    }

    public T get(){ // public Dog get(){
        return value; // return value;
    }
}
