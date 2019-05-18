package pl.aogiri.challenges.unitconverter01.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pl.aogiri.challenges.unitconverter01.Units.UnitVolume;
import pl.aogiri.challenges.unitconverter01.Units.UnitVolume;


public class UnitVolumeTest {

    //Kilometre ->
    @Test
    public void KilometreMetre(){
        final double excepted = 1.0E+9;

        final double actual = new UnitVolume(1,"km3").build().toMetre();

        Assertions.assertEquals(excepted,actual);
    }

    @Test
    public void KilometreDecimetre(){
        final double excepted = 1.0E+12;

        final double actual = new UnitVolume(1,"km3").build().toDecimetre();

        Assertions.assertEquals(excepted,actual);
    }

    @Test
    public void KilometreCentimetre(){
        final double excepted = 1.0E+15;

        final double actual = new UnitVolume(1,"km3").build().toCentimetre();

        Assertions.assertEquals(excepted,actual);
    }

    @Test
    public void KilometreMillimetre(){
        final double excepted = 1.0E+18;

        final double actual = new UnitVolume(1,"km3").build().toMillimetre();

        Assertions.assertEquals(excepted,actual);
    }


    //Metre ->
    @Test
    public void MetreKilometre(){
        final double excepted = 1.0E-9;

        final double actual = new UnitVolume(1,"m3").build().toKilometre();

        Assertions.assertEquals(excepted,actual);
    }

    @Test
    public void MetreDecimetre(){
        final double excepted = 1.0E+3;

        final double actual = new UnitVolume(1,"m3").build().toDecimetre();

        Assertions.assertEquals(excepted,actual);
    }

    @Test
    public void MetreCentimetre(){
        final double excepted = 1.0E+6;

        final double actual = new UnitVolume(1,"m3").build().toCentimetre();

        Assertions.assertEquals(excepted,actual);
    }

    @Test
    public void MetreMillimetre(){
        final double excepted = 1.0E+9;

        final double actual = new UnitVolume(1,"m3").build().toMillimetre();

        Assertions.assertEquals(excepted,actual);
    }


    //Decimetre ->
    @Test
    public void DecimetreKilometre(){
        final double excepted =  1.0E-12;

        final double actual = new UnitVolume(1,"dm3").build().toKilometre();

        Assertions.assertEquals(excepted,actual);
    }

    @Test
    public void DecimetreMetre(){
        final double excepted = 1.0E-3;

        final double actual = new UnitVolume(1,"dm3").build().toMetre();

        Assertions.assertEquals(excepted,actual);
    }

    @Test
    public void DecimetreCentimetre(){
        final double excepted = 1.0E+3;

        final double actual = new UnitVolume(1,"dm3").build().toCentimetre();

        Assertions.assertEquals(excepted,actual);
    }

    @Test
    public void DecimetreMillimetre(){
        final double excepted = 1.0E+6;

        final double actual = new UnitVolume(1,"dm3").build().toMillimetre();

        Assertions.assertEquals(excepted,actual);
    }

    //Centimetre ->
    @Test
    public void CentimetreKilometre(){
        final double excepted = 1.0E-15;

        final double actual = new UnitVolume(1,"cm3").build().toKilometre();

        Assertions.assertEquals(excepted,actual);
    }

    @Test
    public void CentimetreMetre(){
        final double excepted = 1.0E-6;

        final double actual = new UnitVolume(1,"cm3").build().toMetre();

        Assertions.assertEquals(excepted,actual);
    }

    @Test
    public void CentimetreDecimetre(){
        final double excepted = 1.0E-3;

        final double actual = new UnitVolume(1,"cm3").build().toDecimetre();

        Assertions.assertEquals(excepted,actual);
    }

    @Test
    public void CentimetreMillimetre(){
        final double excepted = 1.0E+3;

        final double actual = new UnitVolume(1,"cm3").build().toMillimetre();

        Assertions.assertEquals(excepted,actual);
    }

    //Millimetre ->
    @Test
    public void MillimetreKilometre(){
        final double excepted = 1.0E-18;

        final double actual = new UnitVolume(1,"mm3").build().toKilometre();

        Assertions.assertEquals(excepted,actual);
    }

    @Test
    public void MillimetreMetre(){
        final double excepted = 1.0E-9;

        final double actual = new UnitVolume(1,"mm3").build().toMetre();

        Assertions.assertEquals(excepted,actual);
    }

    @Test
    public void MillimetreDecimetre(){
        final double excepted = 1.0E-6;

        final double actual = new UnitVolume(1,"mm3").build().toDecimetre();

        Assertions.assertEquals(excepted,actual);
    }

    @Test
    public void MillimetreCentimetre(){
        final double excepted = 1.0E-3;

        final double actual = new UnitVolume(1,"mm3").build().toCentimetre();

        Assertions.assertEquals(excepted,actual);
    }


}
