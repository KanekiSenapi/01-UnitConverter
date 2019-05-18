package pl.aogiri.challenges.unitconverter01.Units;

public class UnitSurface implements Unit{
    private double value;
    private String type;

    public UnitSurface() {
    }

    public UnitSurface(double value, String type) {
        this.value = value;
        this.type = type;
    }

    public void set(double value, String type){
        this.value = value;
        this.type = type;
    }

    public UnitSurface build(){
        switch (type){
            case "km2":
                this.value *= 1000000D;
            case "m2":
                this.value *= 100D;
            case "dm2":
                this.value *= 100D;
            case "cm2":
                this.value *= 100D;
                break;
            case "mm2":
                break;
            default:
                throw new IllegalArgumentException();

        }
        this.type = "mm2";
        return this;
    }

    public double toMillimetre(){
        return value;
    }

    public double toCentimetre(){
        return value/100D;
    }

    public double toDecimetre(){
        return value/10000D;
    }

    public double toMetre(){
        return value/1000000D;
    }

    public double toKilometre(){
        return value/1000000000000D;
    }

}
