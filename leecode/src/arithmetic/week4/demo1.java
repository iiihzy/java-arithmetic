package arithmetic.week4;

public class demo1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append(1).append(2).append(3);
        sb.replace(0, 2, "4");
        System.out.println(sb);
    }
}
