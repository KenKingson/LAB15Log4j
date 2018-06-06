package by.bntu.fitr.povt.coffeebaby.view;

import by.bntu.fitr.povt.coffeebaby.model.essence.Necklace;
import by.bntu.fitr.povt.coffeebaby.model.essence.PreciousStone;
import by.bntu.fitr.povt.coffeebaby.model.essence.Stone;

import java.io.*;
import java.util.ArrayList;

public class BinaryFileWork implements FileWorker {
    public void write(Necklace necklace, String fileName){
        DataOutputStream stream = null;
        try{
           stream = new DataOutputStream(
                    new BufferedOutputStream(
                            new FileOutputStream(fileName)));
            for(Stone stone : necklace){
                stream.writeDouble(stone.getWeigth());
                stream.writeDouble(stone.getPrice());

            }
        }catch(IOException ex){
            ConsoleWriter.output(ex+"");
        }
        finally{
            if(stream != null){
                try {
                    stream.close();
                }catch (IOException ex){
                    System.out.println("Error");
                }
            }
        }
    }


    public Necklace read(String fileName){

        Necklace readNecklace = null;
        try {DataInputStream stream = new DataInputStream(new BufferedInputStream(new FileInputStream(fileName)));

            readNecklace = new Necklace(new ArrayList<Stone>());
            while (stream.available() != 0) {
                PreciousStone preciousStone = new PreciousStone();
                preciousStone.setType("Briliant");
                preciousStone.setPrice(stream.readDouble());
                preciousStone.setWeigth(stream.readDouble());
                readNecklace.addStone(preciousStone);
            }



        }catch(IOException ex){
            ConsoleWriter.output(ex+"");
        }
        return readNecklace;
        }
    }

