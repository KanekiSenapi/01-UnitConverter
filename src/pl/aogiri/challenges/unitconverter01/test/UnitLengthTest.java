package pl.aogiri.challenges.unitconverter01.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pl.aogiri.challenges.unitconverter01.Units.UnitLength;


public class UnitLengthTest {

    //Kilometre ->
    @Test
    public void KilometreMetre(){
        final double excepted = 1000D;

        final double actual = new UnitLength(1,"km").build().toMetre();
        
        Assertions.assertEquals(excepted,actual);
    }

    @Test
    public void KilometreDecimetre(){
        final double excepted = 10000;

        final double actual = new UnitLength(1,"km").build().toDecimetre();

       Assertions.assertEquals(excepted,actual);
    }

    @Test
    public void KilometreCentimetre(){
        final double excepted = 100000;

        final double actual = new UnitLength(1,"km").build().toCentimetre();

       Assertions.assertEquals(excepted,actual);
    }

    @Test
    public void KilometreMillimetre(){
        final double excepted = 1000000;

        final double actual = new UnitLength(1,"km").build().toMillimetre();

       Assertions.assertEquals(excepted,actual);
    }


    //Metre ->
    @Test
    public void MetreKilometre(){
        final double excepted = 0.001D;

        final double actual = new UnitLength(1,"m").build().toKilometre();

       Assertions.assertEquals(excepted,actual);
    }

    @Test
    public void MetreDecimetre(){
        final double excepted = 10D;

        final double actual = new UnitLength(1,"m").build().toDecimetre();

       Assertions.assertEquals(excepted,actual);
    }

    @Test
    public void MetreCentimetre(){
        final double excepted = 100D;

        final double actual = new UnitLength(1,"m").build().toCentimetre();

       Assertions.assertEquals(excepted,actual);
    }

    @Test
    public void MetreMillimetre(){
        final double excepted = 1000D;

        final double actual = new UnitLength(1,"m").build().toMillimetre();

       Assertions.assertEquals(excepted,actual);
    }


    //Decimetre ->
    @Test
    public void DecimetreKilometre(){
        final double excepted =  0.0001D;

        final double actual = new UnitLength(1,"dm").build().toKilometre();

       Assertions.assertEquals(excepted,actual);
    }

    @Test
    public void DecimetreMetre(){
        final double excepted = 0.1D;

        final double actual = new UnitLength(1,"dm").build().toMetre();

       Assertions.assertEquals(excepted,actual);
    }

    @Test
    public void DecimetreCentimetre(){
        final double excepted = 10D;

        final double actual = new UnitLength(1,"dm").build().toCentimetre();

       Assertions.assertEquals(excepted,actual);
    }

    @Test
    public void DecimetreMillimetre(){
        final double excepted = 100D;

        final double actual = new UnitLength(1,"dm").build().toMillimetre();

       Assertions.assertEquals(excepted,actual);
    }

    //Centimetre ->
    @Test
    public void CentimetreKilometre(){
        final double excepted = 1.0E-5;

        final double actual = new UnitLength(1,"cm").build().toKilometre();

       Assertions.assertEquals(excepted,actual);
    }

    @Test
    public void CentimetreMetre(){
        final double excepted = 0.01D;

        final double actual = new UnitLength(1,"cm").build().toMetre();

       Assertions.assertEquals(excepted,actual);
    }

    @Test
    public void CentimetreDecimetre(){
        final double excepted = 0.1D;

        final double actual = new UnitLength(1,"cm").build().toDecimetre();

       Assertions.assertEquals(excepted,actual);
    }

    @Test
    public void CentimetreMillimetre(){
        final double excepted = 10D;

        final double actual = new UnitLength(1,"cm").build().toMillimetre();

       Assertions.assertEquals(excepted,actual);
    }

    //Millimetre ->
    @Test
    public void MillimetreKilometre(){
        final double excepted = 1.0E-6;

        final double actual = new UnitLength(1,"mm").build().toKilometre();

       Assertions.assertEquals(excepted,actual);
    }

    @Test
    public void MillimetreMetre(){
        final double excepted = 0.001D;

        final double actual = new UnitLength(1,"mm").build().toMetre();

       Assertions.assertEquals(excepted,actual);
    }

    @Test
    public void MillimetreDecimetre(){
        final double excepted = 0.01D;

        final double actual = new UnitLength(1,"mm").build().toDecimetre();

       Assertions.assertEquals(excepted,actual);
    }

    @Test
    public void MillimetreCentimetre(){
        final double excepted = 0.1D;

        final double actual = new UnitLength(1,"mm").build().toCentimetre();

       Assertions.assertEquals(excepted,actual);
    }


}
