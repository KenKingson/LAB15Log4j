package by.bntu.fitr.povt.coffeebaby.model;

public class StoneMaster {

    public Necklace createNecklace(Necklace necklace, int count) {
        Mine mine = Mine.getMine();
        for(int i = 0; i < count;i++) {
            necklace.addStone(mine.extractionStone());
        }

        return necklace;
    }
}
