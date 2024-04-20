package others;

public class Person {

    public enum Sex {
        MALE, FEMALE
    }

    String name;
    int age;
    Sex gender;
    String emailAddress;

    public int getAge() {
        return age;
    }

    public Sex getGender() {
        return gender;
    }

    public void printPerson() {
        System.out.println("My name is " + name + ", I am " + gender + " and " + age);
    }

    public static void main(String[] args) {
        
    }
}