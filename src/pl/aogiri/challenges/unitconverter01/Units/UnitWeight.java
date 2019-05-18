package pl.aogiri.challenges.unitconverter01.Units;

public class UnitWeight implements Unit{
    private double value;
    private String type;

    public UnitWeight() {
    }

    public UnitWeight(double value, String type) {
        this.value = value;
        this.type = type;
    }

    public void set(double value, String type){
        this.value = value;
        this.type = type;
    }

    public UnitWeight build(){
        switch (type){
            case "t":
                this.value *= 1000;
            case "kg":
                this.value *= 100;
            case "dag":
                this.value *= 10;
            case "g":
                break;
            default:
                throw new IllegalArgumentException();

        }
        this.type = "mm";
        return this;
    }

    public double toTone(){
        return value/1000000;
    }

    public double toKilogram(){
        return value/1000D;
    }

    public double toDecagram(){
        return value/10D;
    }

    public double toGram(){
        return value;
    }


}
