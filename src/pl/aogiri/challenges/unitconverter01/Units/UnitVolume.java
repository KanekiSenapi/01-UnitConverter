package pl.aogiri.challenges.unitconverter01.Units;

public class UnitVolume implements Unit{
    private double value;
    private String type;

    public UnitVolume() {
    }

    public UnitVolume(double value, String type) {
        this.value = value;
        this.type = type;
    }

    public void set(double value, String type){
        this.value = value;
        this.type = type;
    }

    public UnitVolume build(){
        switch (type){
            case "km3":
                this.value *= 1.0E+9;
            case "m3":
                this.value *= 1.0E+3;
            case "dm3":
                this.value *= 1.0E+3;
            case "cm3":
                this.value *= 1.0E+3;
                break;
            case "mm3":
                break;
            default:
                throw new IllegalArgumentException();

        }
        this.type = "mm3";
        return this;
    }

    public double toMillimetre(){
        return value;
    }

    public double toCentimetre(){
        return value/1.0E+3;
    }

    public double toDecimetre(){
        return value/1.0E+6;
    }

    public double toMetre(){
        return value/1.0E+9;
    }

    public double toKilometre(){
        return value/1.0E+18;
    }

}
