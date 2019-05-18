package pl.aogiri.challenges.unitconverter01.Units;

public class UnitCapacity implements Unit{
    private double value;
    private String type;

    public UnitCapacity() {
    }

    public UnitCapacity(double value, String type) {
        this.value = value;
        this.type = type;
    }

    public void set(double value, String type){
        this.value = value;
        this.type = type;
    }

    public UnitCapacity build(){
        switch (type){
            case "hl":
                this.value *= 1.0E+2;
            case "l":
                this.value *= 1.0E+3;
            case "ml":
                break;
            default:
                throw new IllegalArgumentException();

        }
        this.type = "ml";
        return this;
    }

    public double toMillilitre(){
        return value;
    }

    public double toLitre(){
        return value/1.0E+3;
    }

    public double toHectolitre(){
        return value/1.0E+5;
    }

}
