import java.util.ArrayList;
import java.util.Scanner;

public class Customer {
    private String name;
    private int numHome;
    private int Id;

    public Customer() {
    }

    public Customer(String name, int numHome, int id) {
        this.name = name;
        this.numHome = numHome;
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumHome() {
        return numHome;
    }

    public void setNumHome(int numHome) {
        this.numHome = numHome;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", numHome=" + numHome +
                ", Id=" + Id +
                '}';
    }
}
