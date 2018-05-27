/*package by.bntu.fitr.povt.coffeebaby.model;

import org.junit.Test;

import static org.junit.Assert.*;

public class StonesCalcTest {
    @Test
    public void sortStonesByWeigth() {
        SemipreciousStone kamen = new SemipreciousStone(2.5,1052,"diamond");
        PreciousStone kamen1 = new PreciousStone(0.2,5000,"ametyst");
        SemipreciousStone kamen2 = new SemipreciousStone(2,1324,"ruby");
        Stone[] stones= {kamen,kamen1,kamen2};
        Necklace zepocha = new Necklace(stones);
        Stone[] stones1 = {kamen1,kamen2,kamen};
        StonesCalc sort = new StonesCalc();
        sort.sortStonesByWeigth(zepocha);
        assertArrayEquals(stones1,stones);
    }

    @Test
    public void sortStonesByPrice() {
        SemipreciousStone kamen = new SemipreciousStone(2.5,1052,"diamond");
        PreciousStone kamen1 = new PreciousStone(0.2,5000,"ametyst");
        SemipreciousStone kamen2 = new SemipreciousStone(2,1324,"ruby");
        Stone[] stones= {kamen,kamen1,kamen2};
        Necklace zepocha = new Necklace(stones);

        Stone[] stones1 = {kamen,kamen2,kamen1};
        StonesCalc sort = new StonesCalc();
        sort.sortStonesByPrice(zepocha);
        assertArrayEquals(stones1,stones);
    }

}*/