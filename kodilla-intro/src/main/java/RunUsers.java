public class RunUsers {
    public static void main(String[] args) {

        User[] users = new User[3];
        users[0] = new User("Jan", 20);
        users[1] = new User("Piotr", 15);
        users[2] = new User("Tomek", 34);

        int sum = 0;

        for (int i = 0; i < users.length; i++) {
            sum += users[i].age;
        }

        double avg = sum / users.length;

        for (int i = 0; i < users.length; i++) {
            if (users[i].age > avg) {
                System.out.println(users[i].firstName + " " + users[i].age);
            }
        }
    }
}
