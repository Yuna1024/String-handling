import java.util.Scanner;

public class BT7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao xau ky tu s1: ");
        String s1 = sc.nextLine();
        System.out.println("Nhap vao xau ky tu s2: ");
        String s2 = sc.nextLine();
        if (s1.contains(s2)){
            String s3 = s1.replace(s2,"");
            System.out.println("Xau s1 sau khi xoa s2: ");
            System.out.println(s3);
        }else System.out.println("Khong co s2 trong s1");
        sc.close();
    }
}
