
public class Main {

    public static void main(String[] args) {
        HuTao person1 = new HuTao();
        System.out.println("haters rating: " + person1.getrating());

        HuTao person2 = new HuTao(10);
        System.out.println("fans rating: " + person2.getrating());

    }

}
