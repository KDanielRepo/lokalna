public enum Rodzina {
    TATA("Tata"),
    DZIADEK_OD_TATY("Dziadek od Taty"),
    BABCIA_OD_TATY("Babcia od Taty"),
    MAMA("Mama"),
    DZIADEK_OD_MAMY("Dziadek od Mamy"),
    BABCIA_OD_MAMY("Babcia od Mamy");

    private String rodzina;

    Rodzina(String rodzina) {
        this.rodzina = rodzina;
    }

    @Override
    public String toString() {
        return rodzina;
    }
}
