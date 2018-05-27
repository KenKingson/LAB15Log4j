/*package by.bntu.fitr.povt.coffeebaby.model;

import java.util.ArrayList;
import java.util.List;
import by.bntu.fitr.povt.coffeebaby.model.*;
import static org.junit.Assert.*;

public class JewelerTest {
    @org.junit.Test
    public void totalCaratWeigth() {
        SemipreciousStone kamen = new SemipreciousStone(2.5,1052,"diamond");
        PreciousStone kamen1 = new PreciousStone(0.2,5000,"ametyst");
        SemipreciousStone kamen2 = new SemipreciousStone(2,1324,"ruby");
        StonesCalc stonesCalc = new StonesCalc();

        Stone[] stones= {kamen,kamen1,kamen2};
        Necklace zepocha = new Necklace(stones);
        double expected = 4.7;
        assertEquals(expected,stonesCalc.totalCaratWeigth(zepocha),5);
    }

    @org.junit.Test
    public void totalPriceForNecklace() throws Exception {
        SemipreciousStone kamen = new SemipreciousStone(1,1052,"diamond");
        PreciousStone kamen1 = new PreciousStone(0.5,5000,"ametyst");
        SemipreciousStone kamen2 = new SemipreciousStone(2,1000,"ruby");
        Stone[] stones= {kamen,kamen1,kamen2};
        Necklace zepocha = new Necklace(stones);
        StonesCalc stonesCalc = new StonesCalc();
        double expected = 5552;
        assertEquals(expected,stonesCalc.totalPriceForNecklace(zepocha),1);

    }

}*/