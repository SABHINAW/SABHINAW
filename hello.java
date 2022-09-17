public class Program
{
    public static void main(String[] args) {
        int x = 16;
        int y = 3;
        y += ++x;
        System.out.println(y++);
    }
}