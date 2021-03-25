public enum Oczy {
    CZARNE("czarne"),
    RÓŻOWE("różowe"),
    RUBINOWE("rubinowe"),
    CIEMNO_RUBINOWE("ciemno rubinowe"),
    MIESZANE("heterohromia/mieszane");
    private String oczy;

    Oczy(String oczki) {
        this.oczy = oczki;
    }

    @Override
    public String toString() {
        return oczy;
    }
}
