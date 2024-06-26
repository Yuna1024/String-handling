public class BT1 {

    private static boolean check(int n){
        String a = String.valueOf(n);
        StringBuilder sb = new StringBuilder(a);
        String b = sb.reverse().toString();
        return a.equals(b);
    }

    public static void main(String[] args) {
        System.out.println("Danh sach so dao nghich co 6 chu so: ");
        for (int i=100000;i<=999999;i++){
            if (check(i)){
                System.out.println(i);
            }
        }
    }
}
