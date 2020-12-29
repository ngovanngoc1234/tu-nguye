import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        DataCustomer dc = new DataCustomer();
        Scanner sc = new Scanner(System.in);
        int input = 7;
        do {
            System.out.println("1: Thêm");
            System.out.println("2: Hiển thị khach hang");
            System.out.println("3: hien thi gia tien ");
            System.out.println("0: Exit");
            input = Integer.parseInt(sc.nextLine());
            switch (input) {
                case 1:
                    dc.addCustomer();
                    break;
                case 2:
                    dc.showReceipt();
                    break;
                case 3:
                    dc.searchPrice();
                    break;
            }
        } while (input != 0);
    }
}