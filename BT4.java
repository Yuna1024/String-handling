import java.util.Scanner;

public class BT4 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Nhap vao xau ky tu s: ");
        String s = sc.nextLine();

        String[] arSt = s.split(" ");

        String longSt = " ";

        int index =0;
        for (int i=0;i<arSt.length;i++){
            String str = arSt[i];
            if (str.length() > longSt.length()){
                longSt = str;
                index=i;
            }
        }
        System.out.println("Tu dai nhat la "+ longSt +"nam o vi tri thu "+(index+1));
    }
}
