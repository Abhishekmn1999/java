public class AccountDetails {
    public static void main(String args[]) {
        class bank {
            String name;
            double balence;
            int age;

            public bank(String n, double bal, int age) {
                this.name = n;
                this.balence = bal;
                this.age = age;
            }

            public void displayinfo() {
                System.out.println("Name = " + name);
                System.out.println("amount = " + balence);
                System.out.println("age = " + age);
            }
        }
        bank cust1 = new bank("Abhi", 5000, 25);

        cust1.displayinfo();
    }
}
