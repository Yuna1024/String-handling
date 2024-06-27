import java.util.Arrays;
import java.util.Scanner;

public class BT6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        int checkFull= 0;
        int check = 0;
        do {
            System.out.println("Nhap vao 1 cau bat ki: ");
            s = sc.nextLine();
            String[] arrStr = s.split(" ");
            check = arrStr.length;
            for(String str : arrStr) {
                if (str.length() > check){
                    check=str.length();
                }
            }
            if (checkFull > 20){
                System.out.println("So luong tu trong cau khong duoc vuot qua 20");
            } else if (check > 10) {
                System.out.println("So tu trong cau khong duoc vuot qua 10 ky tu");
            }
        }while (checkFull > 20 || checkFull <0 || check >10);

        String[] arStr = s.split(" ");
        Arrays.sort(arStr);
        System.out.println("Sap xep theo ky tu alpha b la : ");
        for (String str : arStr){
            System.out.print(str+" ");
        }
        sc.close();
    }
}
