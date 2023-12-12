class Animal{
    void sound(){
        System.out.println("some sound");
    }
}
    class dog extends Animal{
        @Override
        void sound(){
            System.out.println("Barking");
        }
    }


public class MethodOverrideing {
    public static void main(String args[]){

        Animal ani=new Animal();
        ani.sound();
        dog Dog=new dog();
        Dog.sound();
    }
}
