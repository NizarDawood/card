public class tjuv {
    private static int hälsa;
    private String name;
    private int hastighet;
    private int styrka;
    private int hjälp;

    public tjuv( String name,int hälsa, int hastighet, int styrka, int hjälp) {
      //  super(name);
        this.hälsa = 100;
        this.hastighet = 100;
        this.styrka = 100;
        this.hjälp = 100;
    }
    public int getStyrka() {
        return styrka;
    }

    public int getHjälp() {
        return hjälp;
    }

    public int getHastighet() {
        return hastighet;
    }

    public static int getHälsa() {
        return hälsa;
    }



}
