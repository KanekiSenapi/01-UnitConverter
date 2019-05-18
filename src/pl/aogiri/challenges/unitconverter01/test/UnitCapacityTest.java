package pl.aogiri.challenges.unitconverter01.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pl.aogiri.challenges.unitconverter01.Units.UnitCapacity;


public class UnitCapacityTest {

    //Hectolitre ->
    @Test
    private void HectolitreLitre(){
        final double excepted = 1.0E+2;

        final double actual = new UnitCapacity(1,"hl").build().toLitre();

        Assertions.assertEquals(excepted,actual);
    }

    @Test
    private void HectolitreMillilitre(){
        final double excepted = 1.0E+5;

        final double actual = new UnitCapacity(1,"hl").build().toMillilitre();

        Assertions.assertEquals(excepted,actual);
    }

    //Litre ->
    @Test
    private void LitreHectolitre(){
        final double excepted = 1.0E-2;

        final double actual = new UnitCapacity(1,"l").build().toHectolitre();

        Assertions.assertEquals(excepted,actual);
    }

    @Test
    private void LitreMillilitre(){
        final double excepted = 1.0E+3;

        final double actual = new UnitCapacity(1,"l").build().toMillilitre();

        Assertions.assertEquals(excepted,actual);
    }

    //Litre ->
    @Test
    private void MillilitreHectolitre(){
        final double excepted = 1.0E-5;

        final double actual = new UnitCapacity(1,"ml").build().toHectolitre();

        Assertions.assertEquals(excepted,actual);
    }

    @Test
    private void MillilitreLitre(){
        final double excepted = 1.0E-3;

        final double actual = new UnitCapacity(1,"ml").build().toLitre();

        Assertions.assertEquals(excepted,actual);
    }

}
