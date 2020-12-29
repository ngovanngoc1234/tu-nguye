import java.util.ArrayList;
import java.util.Scanner;

public class Receipt {
    private Customer customer;
    private int newIndex, oldIndex;

    public Receipt() {
    }

    public Receipt(Customer customer, int newIndex, int oldIndex) {
        this.customer = customer;
        this.newIndex = newIndex;
        this.oldIndex = oldIndex;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public int getNewIndex() {
        return newIndex;
    }

    public void setNewIndex(int newIndex) {
        this.newIndex = newIndex;
    }

    public int getOldIndex() {
        return oldIndex;
    }

    public void setOldIndex(int oldIndex) {
        this.oldIndex = oldIndex;
    }


    @Override
    public String toString() {
        return "Receipt{" +
                "customer=" + customer +
                ", newIndex=" + newIndex +
                ", oldIndex=" + oldIndex +
                '}';
    }


    public static void totalMoney(int id, ArrayList<Receipt> receipts) {
        int n = 0;
        for (int i = 0; i < receipts.size(); i++) {
            if (id == receipts.get(i).getCustomer().getId()) {
                n++;
                System.out.println((receipts.get(i).getNewIndex() - receipts.get(i).getOldIndex()) * 750);
            }
        }
        if (n == 0) {
            System.out.println("khong tim thay");
        }
    }
}