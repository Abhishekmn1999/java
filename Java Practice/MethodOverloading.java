public class MethodOverloading {

// in a same class multiple method having a same same but diffrent paramenter

    public int add(int a,int b){  //add is a method name 
        return a+b;
    }

    public double add(double a,double b,double c){
        return a+b+c;
    }

    public static void main(String args[]){
        MethodOverloading met=new MethodOverloading();

        System.out.println("Addtion of two number = "+met.add(3,5));
        // System.out.println("Addtion of two number = "+met.add(3,5,8));
        System.out.println("Addtion of two number = "+met.add(3.5,2.8,9.4));
    }
}