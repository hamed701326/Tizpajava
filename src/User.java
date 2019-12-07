import trip.Distance;
import trip.Trip;

import java.util.Scanner;

public class User {
    private Specification specification;
    private Trip trip;
    private Distance distance;
    private Scanner scanner=new Scanner(System.in);
    public  User(){}
    public User(String name) {
        this.specification =new Specification(name);
    }

    public void  order(Trip trip, Distance distance,int condition){
        trip.setDistance(distance.getCosFactor());
        trip.setTypeCondition(condition);
        System.out.println("Trip Price: "+trip.getPrice());

    }
    public void getSpecification(){
        this.specification.toString();
    }
}
class Specification{
    private String name;
    private String userName;
    private String password;
    private Scanner scanner=new Scanner(System.in);
    public Specification(String name) {
        this.name=name;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Specification{" +
                "Name='" + name + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
