package by.bntu.fitr.povt.coffeebaby.view;

import by.bntu.fitr.povt.coffeebaby.model.essence.Necklace;
import by.bntu.fitr.povt.coffeebaby.model.essence.PreciousStone;
import by.bntu.fitr.povt.coffeebaby.model.essence.SemipreciousStone;
import by.bntu.fitr.povt.coffeebaby.model.essence.Stone;

import java.io.*;
import java.util.ArrayList;

public class TxtFileWork implements FileWorker{
    public void write(Necklace necklace, String fileName) {
        //create decorator, base on FileOutputStream
        try (BufferedWriter stream = new BufferedWriter(new FileWriter(fileName))){
            StringBuilder stringBuilder = new StringBuilder();
            for (Stone stone : necklace) {
                if (stone instanceof SemipreciousStone) {
                    stringBuilder.append(((SemipreciousStone) stone).getType()+ " ");

                }
                else if (stone instanceof PreciousStone) {
                    stringBuilder.append(((PreciousStone) stone).getType()+ " ");

                }

                stringBuilder.append(stone.getWeigth() + " " + stone.getPrice() + " ");
                stringBuilder.append("\n");

            }

            stream.write(stringBuilder.toString());
            stringBuilder.setLength(0);
        }
        catch(FileNotFoundException ex){
            ConsoleWriter.output("File not found error");
        }
        catch (IOException ex) {
            ConsoleWriter.output("IO error");
        }


    }


    public Necklace read(String fileName) {
        Necklace readNecklace = new Necklace(new ArrayList<Stone>());
        try (BufferedReader stream = new BufferedReader(new FileReader(fileName))) {
            String info;
            while ((info = stream.readLine())!=null){
            String[] strings = info.split(" ");
            Stone stone = null;
            switch(strings[0]){
                case "CITRINE": stone = new PreciousStone(Double.valueOf((strings[2])),
                        Double.valueOf(strings[1]),strings[0]);
                    break;
                case "OPAL" : stone = new SemipreciousStone(Double.valueOf((strings[2])),
                        Double.valueOf(strings[1]),strings[0]);
                    break;
            }
            readNecklace.addStone(stone);
        }
    }

        catch (FileNotFoundException ex){
            ex.printStackTrace();
        }
        catch(IOException ex){
            ex.printStackTrace();
        }
        return readNecklace;

    }
}
