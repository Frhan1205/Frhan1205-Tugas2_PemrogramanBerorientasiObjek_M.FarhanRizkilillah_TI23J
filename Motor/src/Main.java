class Motor {
    String merk;

    Motor(String merk) {
        this.merk = merk;
    }
    void tampilkanMerk() {
        System.out.println("Merk motor: " +this.merk);
    }
}
public class Main {
    public static void main(String[] args) {
        Motor m = new Motor("Honda");
        m.tampilkanMerk();
    }
}