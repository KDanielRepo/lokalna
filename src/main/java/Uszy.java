public enum Uszy {
    STANDARD("standarowe"),
    DUMBO("dumbo");
    private String uszy;

    Uszy(String uszki) {
        this.uszy = uszki;
    }

    @Override
    public String toString() {
        return uszy;
    }
}
