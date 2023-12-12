// class car {
//     String model;
//     int year;
//     String color;

//     // constructor
//     public car(String m, int y, int c) {
//         // this.m = model;
//         // this.y = year;
//         // this.c = color;

//         this.model=model;
//         this.year=year;
//         this.color=color;
        
//     }

//     public void displayinfo() {
//         System.out.println("Model" + model);
//         System.out.println("year" + year);
//         System.out.println("color" + color);
//     }
// }

// public class const1 {
//     public static void main(String args[]) {
//         car car1 = new car("benz", 2023, "Red");
//         car car2 = new car("audi", 2025, "blue");

//         car1.displayinfo();
//         car2.displayinfo();
//     }
// }

class car{
    String model;
    int year;
    String color;

    public car(String m,int y,String c){
        this.model=m;
        this.year=y;
        this.color=c;
    }

    public void displayinfo(){
        System.out.println("Model "+model);
        System.out.println("year "+year);
        System.out.println("color "+color);
    }
}

public class const1{
    public static void main(String args[]){
        car car1=new car("benz",2023,"Red");
        car car2=new car("audi",2013,"Blue");
        
        car1.displayinfo();
        car2.displayinfo();
    }
}