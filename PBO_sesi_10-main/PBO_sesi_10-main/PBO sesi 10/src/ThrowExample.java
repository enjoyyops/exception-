public class ThrowExample {
    static void demo() {
        try {
            throw new NullPointerException("Coba Throw");
        } catch (NullPointerException t) {
            System.out.println("Terjadi di dalam method demo.");
            throw t; // melempar ulang exception
        }
    }
    public static void main(String[] args) {
        try {
            demo();
        } catch (NullPointerException e) {
            System.out.println("Ada pesan error: " + e);
        }
        System.out.println("Selesai");
    }
}