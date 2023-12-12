public class thisKeyword {
    String name;
    int age;

    public thisKeyword(String name, int age) { // constructre
        this.name = name;
        this.age = age;
    }

    public void displayinfo() {
        System.out.println("Name = " + name);
        System.out.println("Age = " + age);
    }

    public static void main(String args[]) {
        thisKeyword th = new thisKeyword("Abhi", 25); // object

        th.displayinfo();
    }
}
