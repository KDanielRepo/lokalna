public enum Znaczenia {
    BRAK("brak"),                   //HH
    HOODED("typ hooded"),           //hh
    BERKSHIRE("typ berkshire");     //Hh
    private String znak;

    Znaczenia(String znaczek) {
        this.znak = znaczek;
    }

    @Override
    public String toString() {
        return znak;
    }
}
