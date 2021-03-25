public enum RodzajSiersci {
    STANDARD("standard"),
    REX("rex"),
    LONG_HAIR("long hair"),
    SATIN("satin"),
    FUZZ("fuzz"), //rnurnu
    SPHINX("sphinx");

    private String sierscr;

    RodzajSiersci(String sierscr) {
        this.sierscr = sierscr;
    }

    @Override
    public String toString() {
        return sierscr;
    }
}
