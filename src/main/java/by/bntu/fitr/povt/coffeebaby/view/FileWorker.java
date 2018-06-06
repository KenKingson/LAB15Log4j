package by.bntu.fitr.povt.coffeebaby.view;

import by.bntu.fitr.povt.coffeebaby.model.essence.Necklace;

public interface FileWorker {
    void write(Necklace necklace, String fileName);
    Necklace read(String fileName);
}
