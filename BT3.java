import java.util.Scanner;

public class BT3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao xau ky tu s: ");
        String s = sc.nextLine();


        char[] array = s.toCharArray();
        StringBuilder result = new StringBuilder();

        for (int i=0;i<array.length;i++){
            if (i==0){
                result.append(Character.toUpperCase(array[i]));
            }
            else result.append(Character.toLowerCase(array[i]));
        }
        System.out.println(result.toString().trim());
        sc.close();
    }
}
