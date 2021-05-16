import java.util.Random;

public class User {
    String name;
    int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        User mrówka = new User("Mrówka", 10);
        User sindi = new User("Sindi", 20);
        User żyraf = new User("Żyraf", 30);
        User belzebub = new User("Belzebub", 40);
        User[] users = {mrówka, sindi, żyraf, belzebub};
        int result = 0;
        for (int i = 0; i < users.length; i++) {
            result = result + users[i].age;
        }
        int average = result / users.length;

        for (int i = 0; i < users.length; i++) {
            if (users[i].age < average) {
                System.out.println(users[i].name);
            }
        }
    }
}










