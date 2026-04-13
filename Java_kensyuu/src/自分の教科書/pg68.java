package 自分の教科書;

public class pg68 {

    int instanceVar;

    public pg68(int magicNumber) {
        this.instanceVar = magicNumber;
    }

    public void displayMagicNumber() {
        System.out.println("Magic number is: " + instanceVar);
    }

    public static void main(String[] args) {
        pg68 alice = new pg68(7);
        pg68 bob = new pg68(13);
        pg68 charlie = new pg68(22);

        System.out.println("In a mystical land, three friends discovered their magic number...");

        System.out.print("Alice's ");
        alice.displayMagicNumber();

        System.out.print("Bob's ");
        bob.displayMagicNumber();

        System.out.print("Charlie's ");
        charlie.displayMagicNumber();

        System.out.println("With their unique magic numbers, they set out on an adventure "
                + "to uncover the secrets of the mystical land!");
    }
}