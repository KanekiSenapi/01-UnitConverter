package pl.aogiri.challenges.unitconverter01.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pl.aogiri.challenges.unitconverter01.Units.UnitWeight;


public class UnitWeightTest {

    //Ton ->
    @Test
    public void TonKilogram(){
        final double excepted = 1.0E+3;

        final double actual = new UnitWeight(1,"t").build().toKilogram();
        
        Assertions.assertEquals(excepted,actual);
    }

    @Test
    public void TonDecagram(){
        final double excepted = 1.0E+5;

        final double actual = new UnitWeight(1,"t").build().toDecagram();

       Assertions.assertEquals(excepted,actual);
    }

    @Test
    public void TonGram(){
        final double excepted = 1.0E+6;

        final double actual = new UnitWeight(1,"t").build().toGram();

       Assertions.assertEquals(excepted,actual);
    }


    //Kilogram ->
    @Test
    public void KilogramTon(){
        final double excepted = 1.0E-3;

        final double actual = new UnitWeight(1,"kg").build().toTone();

       Assertions.assertEquals(excepted,actual);
    }

    @Test
    public void KilogramDecagram(){
        final double excepted = 1.0E+2;

        final double actual = new UnitWeight(1,"kg").build().toDecagram();

       Assertions.assertEquals(excepted,actual);
    }

    @Test
    public void KilogramGram(){
        final double excepted = 1.0E+3;

        final double actual = new UnitWeight(1,"kg").build().toGram();

       Assertions.assertEquals(excepted,actual);
    }

    //Decagram ->
    @Test
    public void DecagramTon(){
        final double excepted = 1.0E-5;

        final double actual = new UnitWeight(1,"dag").build().toTone();

        Assertions.assertEquals(excepted,actual);
    }

    @Test
    public void DecagramKilogram(){
        final double excepted = 1.0E-2;

        final double actual = new UnitWeight(1,"dag").build().toKilogram();

        Assertions.assertEquals(excepted,actual);
    }

    @Test
    public void DecagramGram(){
        final double excepted = 1.0E+1;

        final double actual = new UnitWeight(1,"dag").build().toGram();

        Assertions.assertEquals(excepted,actual);
    }

    //Gram ->
    @Test
    public void GramTon(){
        final double excepted = 1.0E-6;

        final double actual = new UnitWeight(1,"g").build().toTone();

        Assertions.assertEquals(excepted,actual);
    }

    @Test
    public void GramKilogram(){
        final double excepted = 1.0E-3;

        final double actual = new UnitWeight(1,"g").build().toKilogram();

        Assertions.assertEquals(excepted,actual);
    }

    @Test
    public void GramDecagram(){
        final double excepted = 1.0E-1;

        final double actual = new UnitWeight(1,"g").build().toDecagram();

        Assertions.assertEquals(excepted,actual);
    }


}
