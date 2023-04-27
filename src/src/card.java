public class card {
    public String name;
    public int hälsa;
    public int hastighet;
    public int styrka;
    public int hjälp;


    public static void main(String[] args) {
        while (true) {

            if (tjuv.getHälsa() <= 0) {
                System.out.println("Polisen vinner");
                break;
            } else if (polis.getHälsa() <= 0) {
                System.out.println("Tjuven vinner");
                break;
            }
        }
    }
}