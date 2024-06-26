import java.util.Scanner;

public class BT2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao sau ky tu s: ");
        String s = sc.nextLine();

        char[] array = s.toCharArray();
        StringBuilder result = new StringBuilder();

        System.out.print("Xen ke ki tu hoa va thuong la: ");
        for (int i=0;i<array.length;i++){
            if (i%2==0){
                result.append(Character.toUpperCase(array[i]));
            }else result.append(Character.toLowerCase(array[i]));
        }
        System.out.println(result.toString());
        sc.close();
    }
}
