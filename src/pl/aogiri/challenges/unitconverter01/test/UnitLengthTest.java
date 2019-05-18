package pl.aogiri.challenges.unitconverter01.test;

import org.junit.Assert;
import org.junit.Test;
import pl.aogiri.challenges.unitconverter01.UnitLength;


public class UnitLengthTest {

    //Kilometre ->
    @Test
    public void KilometreMetre(){
        final double excepted = 1000D;

        final double actual = new UnitLength(1,"km").build().toMetre();

        Assert.assertEquals(excepted, actual, 0D);
    }

    @Test
    public void KilometreDecimetre(){
        final double excepted = 10000;

        final double actual = new UnitLength(1,"km").build().toDecimetre();

        Assert.assertEquals(excepted, actual, 0D);
    }

    @Test
    public void KilometreCentimetre(){
        final double excepted = 100000;

        final double actual = new UnitLength(1,"km").build().toCentimetre();

        Assert.assertEquals(excepted, actual, 0D);
    }

    @Test
    public void KilometreMillimetre(){
        final double excepted = 1000000;

        final double actual = new UnitLength(1,"km").build().toMillimetre();

        Assert.assertEquals(excepted, actual, 0D);
    }


    //Metre ->
    @Test
    public void MetreKilometre(){
        final double excepted = 0.001D;

        final double actual = new UnitLength(1,"m").build().toKilometre();

        Assert.assertEquals(excepted, actual, 0D);
    }

    @Test
    public void MetreDecimetre(){
        final double excepted = 10D;

        final double actual = new UnitLength(1,"m").build().toDecimetre();

        Assert.assertEquals(excepted, actual, 0D);
    }

    @Test
    public void MetreCentimetre(){
        final double excepted = 100D;

        final double actual = new UnitLength(1,"m").build().toCentimetre();

        Assert.assertEquals(excepted, actual, 0D);
    }

    @Test
    public void MetreMillimetre(){
        final double excepted = 1000D;

        final double actual = new UnitLength(1,"m").build().toMillimetre();

        Assert.assertEquals(excepted, actual, 0D);
    }


    //Decimetre ->
    @Test
    public void DecimetreKilometre(){
        final double excepted =  0.0001D;

        final double actual = new UnitLength(1,"dm").build().toKilometre();

        Assert.assertEquals(excepted, actual, 0D);
    }

    @Test
    public void DecimetreMetre(){
        final double excepted = 0.1D;

        final double actual = new UnitLength(1,"dm").build().toMetre();

        Assert.assertEquals(excepted, actual, 0D);
    }

    @Test
    public void DecimetreCentimetre(){
        final double excepted = 10D;

        final double actual = new UnitLength(1,"dm").build().toCentimetre();

        Assert.assertEquals(excepted, actual, 0D);
    }

    @Test
    public void DecimetreMillimetre(){
        final double excepted = 100D;

        final double actual = new UnitLength(1,"dm").build().toMillimetre();

        Assert.assertEquals(excepted, actual, 0D);
    }

    //Centimetre ->
    @Test
    public void CentimetreKilometre(){
        final double excepted = 1.0E-5;

        final double actual = new UnitLength(1,"cm").build().toKilometre();

        Assert.assertEquals(excepted, actual, 0D);
    }

    @Test
    public void CentimetreMetre(){
        final double excepted = 0.01D;

        final double actual = new UnitLength(1,"cm").build().toMetre();

        Assert.assertEquals(excepted, actual, 0D);
    }

    @Test
    public void CentimetreDecimetre(){
        final double excepted = 0.1D;

        final double actual = new UnitLength(1,"cm").build().toDecimetre();

        Assert.assertEquals(excepted, actual, 0D);
    }

    @Test
    public void CentimetreMillimetre(){
        final double excepted = 10D;

        final double actual = new UnitLength(1,"cm").build().toMillimetre();

        Assert.assertEquals(excepted, actual, 0D);
    }

    //Millimetre ->
    @Test
    public void MillimetreKilometre(){
        final double excepted = 1.0E-6;

        final double actual = new UnitLength(1,"mm").build().toKilometre();

        Assert.assertEquals(excepted, actual, 0D);
    }

    @Test
    public void MillimetreMetre(){
        final double excepted = 0.001D;

        final double actual = new UnitLength(1,"mm").build().toMetre();

        Assert.assertEquals(excepted, actual, 0D);
    }

    @Test
    public void MillimetreDecimetre(){
        final double excepted = 0.01D;

        final double actual = new UnitLength(1,"mm").build().toDecimetre();

        Assert.assertEquals(excepted, actual, 0D);
    }

    @Test
    public void MillimetreCentimetre(){
        final double excepted = 0.1D;

        final double actual = new UnitLength(1,"mm").build().toCentimetre();

        Assert.assertEquals(excepted, actual, 0D);
    }


}
