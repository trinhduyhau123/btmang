import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("The application searches for values in an array");
        String[] students = {"Hau", "Hieu", "Tien", "Tam"};
        System.out.println("Nhập tên học sinh cần tìm: ");
        Scanner scanner = new Scanner(System.in);
        String ten = scanner.next();
        boolean check = true;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(ten)) {
                System.out.println(ten + " o vi tri " + i);
                check  = true;
                break;
            } else {
                check = false;
            }
        }
        if(check == false){
            System.out.println("NOT FOUND");
        }
    }
}
