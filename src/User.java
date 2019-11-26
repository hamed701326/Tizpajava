import java.util.Scanner;

public class User {
    private Specification specification;
    private Trip trip;
    private Distance distance;
    private Scanner scanner=new Scanner(System.in);
    public User() {
        System.out.print("First Name:");
        String firstName=scanner.next();
        System.out.print("Last Name:");
        String lastName=scanner.next();
        this.specification =new Specification(firstName,lastName);
        specification.setUserName();
        specification.setPassword();
    }

    public void  order(Trip trip, Distance distance){
        this.distance=distance;
        this.trip=trip;
    }
    public void getSpecification(){
        this.specification.toString();
    }
}
class Specification{
    private String firstName;
    private String lastName;
    private String userName;
    private String password;
    private Scanner scanner=new Scanner(System.in);
    public Specification(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName =lastName;
    }

    public void setUserName() {
        System.out.print("User Name: ");
        this.userName = userName;
    }

    public void setPassword() {
        System.out.print("Password: ");
        this.password = password;
    }

    @Override
    public String toString() {
        return "Specification{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
