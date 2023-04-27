public class polis {
    private static int hälsa;
    private String name;
    private int hastighet;
    private int styrka;
    private int hjälp;

    public polis( String name,int hälsa, int hastighet, int styrka, int hjälp) {
        //super(name);
        this.hälsa = 101;
        this.hastighet = 101;
        this.styrka = 101;
        this.hjälp = 101;
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
