public enum Colour {
    RED("красный"), GREEN("зелёный"), BLUE("голубой"),
    YELLOW("жёлтый"), WHITE("белый"), BLACK("чёрный"),
    PURPLE("фиолетовый"), TURQUOISE("бирюзовый"), BEIGE("бежевый");

    private String translation;

    Colour(final String translation) {
        this.translation = translation;
    }

    public String getTranslation() {
        return translation;
    }
}
