package pl.aogiri.challenges.unitconverter01.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pl.aogiri.challenges.unitconverter01.Units.UnitSurface;



public class UnitSurfaceTest {

    //Kilometre ->
    @Test
    public void KilometreMetre(){
        final double excepted = 1.0E+6;

        final double actual = new UnitSurface(1,"km2").build().toMetre();

        Assertions.assertEquals(excepted,actual);
    }

    @Test
    public void KilometreDecimetre(){
        final double excepted = 1.0E+8;

        final double actual = new UnitSurface(1,"km2").build().toDecimetre();

        Assertions.assertEquals(excepted,actual);
    }

    @Test
    public void KilometreCentimetre(){
        final double excepted = 1.0E+10;

        final double actual = new UnitSurface(1,"km2").build().toCentimetre();

        Assertions.assertEquals(excepted,actual);
    }

    @Test
    public void KilometreMillimetre(){
        final double excepted = 1.0E+12;

        final double actual = new UnitSurface(1,"km2").build().toMillimetre();

        Assertions.assertEquals(excepted,actual);
    }


    //Metre ->
    @Test
    public void MetreKilometre(){
        final double excepted = 1.0E-6;

        final double actual = new UnitSurface(1,"m2").build().toKilometre();

        Assertions.assertEquals(excepted,actual);
    }

    @Test
    public void MetreDecimetre(){
        final double excepted = 1.0E+2;

        final double actual = new UnitSurface(1,"m2").build().toDecimetre();

        Assertions.assertEquals(excepted,actual);
    }

    @Test
    public void MetreCentimetre(){
        final double excepted = 1.0E+4;

        final double actual = new UnitSurface(1,"m2").build().toCentimetre();

        Assertions.assertEquals(excepted,actual);
    }

    @Test
    public void MetreMillimetre(){
        final double excepted = 1.0E+6;

        final double actual = new UnitSurface(1,"m2").build().toMillimetre();

        Assertions.assertEquals(excepted,actual);
    }


    //Decimetre ->
    @Test
    public void DecimetreKilometre(){
        final double excepted =  1.0E-8;

        final double actual = new UnitSurface(1,"dm2").build().toKilometre();

        Assertions.assertEquals(excepted,actual);
    }

    @Test
    public void DecimetreMetre(){
        final double excepted = 0.01D;

        final double actual = new UnitSurface(1,"dm2").build().toMetre();

        Assertions.assertEquals(excepted,actual);
    }

    @Test
    public void DecimetreCentimetre(){
        final double excepted = 100D;

        final double actual = new UnitSurface(1,"dm2").build().toCentimetre();

        Assertions.assertEquals(excepted,actual);
    }

    @Test
    public void DecimetreMillimetre(){
        final double excepted = 1.0E+4;

        final double actual = new UnitSurface(1,"dm2").build().toMillimetre();

        Assertions.assertEquals(excepted,actual);
    }

    //Centimetre ->
    @Test
    public void CentimetreKilometre(){
        final double excepted = 1.0E-10;

        final double actual = new UnitSurface(1,"cm2").build().toKilometre();

        Assertions.assertEquals(excepted,actual);
    }

    @Test
    public void CentimetreMetre(){
        final double excepted = 1.0E-4;

        final double actual = new UnitSurface(1,"cm2").build().toMetre();

        Assertions.assertEquals(excepted,actual);
    }

    @Test
    public void CentimetreDecimetre(){
        final double excepted = 1.0E-2;

        final double actual = new UnitSurface(1,"cm2").build().toDecimetre();

        Assertions.assertEquals(excepted,actual);
    }

    @Test
    public void CentimetreMillimetre(){
        final double excepted = 1.0E+2;

        final double actual = new UnitSurface(1,"cm2").build().toMillimetre();

        Assertions.assertEquals(excepted,actual);
    }

    //Millimetre ->
    @Test
    public void MillimetreKilometre(){
        final double excepted = 1.0E-12;

        final double actual = new UnitSurface(1,"mm2").build().toKilometre();

        Assertions.assertEquals(excepted,actual);
    }

    @Test
    public void MillimetreMetre(){
        final double excepted = 1.0E-6;

        final double actual = new UnitSurface(1,"mm2").build().toMetre();

        Assertions.assertEquals(excepted,actual);
    }

    @Test
    public void MillimetreDecimetre(){
        final double excepted = 1.0E-4;

        final double actual = new UnitSurface(1,"mm2").build().toDecimetre();

        Assertions.assertEquals(excepted,actual);
    }

    @Test
    public void MillimetreCentimetre(){
        final double excepted = 1.0E-2;

        final double actual = new UnitSurface(1,"mm2").build().toCentimetre();

        Assertions.assertEquals(excepted,actual);
    }


}
