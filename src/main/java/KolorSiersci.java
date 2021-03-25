public enum KolorSiersci {
    BLACK("black"),             //aa B-C-D-G-M-P-R-
    AGOUTI("agouti"),           //A-B-C-D-G-M-P-R-
    CHOCOLATE("chocolate"),     //aa bb C-D-G-M-P-R-
    BURMESE("burmese"),         //aa B-chc D-G-M-P-R-
    FAWN("fawn"),               //A-B-C-D-G-M-P-rr
    CHAMPAGNE("champagne"),     //aa B-C-D-G-M-ppR-
    CINNAMON("cinnamon"),       //A-B-C-D-G-mm P-R-
    BEIGE("beige"),             //aa B-C-D-G-M-P-rr
    BLUE("blue"),               //aa B-C-D-gg M-P-R-
    SILVER("silver"),           //aa B-C-D-gg M-pp R-
    PLATINUM("platinum"),       //aa bbC-D-gg M-P-R-
    WHITE("white");      //any cc any

    private String kolor;

    KolorSiersci(String siersck) {
        this.kolor = siersck;
    }

    @Override
    public String toString() {
        return kolor;
    }
}
