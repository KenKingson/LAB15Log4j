package by.bntu.fitr.povt.coffeebaby.model;


import java.util.Random;


public class Mine {
    private static Mine uniqueInstance;

    public static Mine getMine() {
        if (uniqueInstance == null) {
            uniqueInstance = new Mine();
        }
        return uniqueInstance;
    }


    private Mine() {
    }


    public enum semipreciousType {
       CITRINE;
    }
// AMETHYST, AQUAMARINE, CORAL, TOPAZ, QUARZ,
    public enum preciousType {
       OPAL;
    }
//DIAMOND, RUBY, SAPPHIRE, EMERLAND,

    public static Stone extractionStone() {

        Random random = new Random();
        short multilierForPriceSemiPrSt = 1000;
        byte multiplierForWeightPrSt = 5, multiplierForWeightSemiPrSt = 2;
        int stoneType = random.nextInt(2), multiplierForPricePresSt = 100000;

        if (stoneType == 1) {
            return new SemipreciousStone(random.nextDouble() * multiplierForWeightSemiPrSt, random.nextDouble() * multilierForPriceSemiPrSt,
                    (semipreciousType.values()[random.nextInt(semipreciousType.values().length)]) + "");

        } else {
            return new PreciousStone(Math.random() * multiplierForWeightPrSt, Math.random() * multiplierForPricePresSt,
                    preciousType.values()[random.nextInt(preciousType.values().length)] + "");
        }
    }
}
