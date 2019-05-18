package pl.aogiri.challenges.unitconverter01;

public class UnitLength {
    private double value;
    private String type;

    public UnitLength() {
    }

    public UnitLength(double value, String type) {
        this.value = value;
        this.type = type;
    }

    public void set(double value, String type){
        this.value = value;
        this.type = type;
    }

    public UnitLength build(){
        switch (type){
            case "km":
                this.value *= 1000;
            case "m":
                this.value *= 10;
            case "dm":
                this.value *= 10;
            case "cm":
                this.value *= 10;
                break;
            case "mm":
                break;
            default:
                throw new IllegalArgumentException();

        }
        this.type = "mm";
        return this;
    }

    public double toMillimetre(){
        return value;
    }

    public double toCentimetre(){
        return value/10D;
    }

    public double toDecimetre(){
        return value/100D;
    }

    public double toMetre(){
        return value/1000D;
    }

    public double toKilometre(){
        return value/1000000D;
    }

}
