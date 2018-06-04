package by.bntu.fitr.povt.coffeebaby.controller;


import by.bntu.fitr.povt.coffeebaby.model.*;

import by.bntu.fitr.povt.coffeebaby.model.fileWork.BinaryFileWorker;
import by.bntu.fitr.povt.coffeebaby.model.fileWork.TxtFileWorker;
import by.bntu.fitr.povt.coffeebaby.model.sorting.*;
import by.bntu.fitr.povt.coffeebaby.view.*;



import java.util.ArrayList;
import java.util.Collections;


public class Controller {
    public static void main(String[] args) {
        StoneMaster stoneMaster = new StoneMaster();
        int choice, countOfStones, index, weight;
        ArrayList container = new ArrayList();
        View.output("Please, input number of stones in your necklace: ");
        countOfStones = Inputer.inputInt();
        SortClient sortClient = new SortClient();
        Necklace necklace = new Necklace(new ArrayList<Stone>());
        Mine mine = Mine.getMine();
        mine.extractionStone();
        necklace = stoneMaster.createNecklace(necklace, countOfStones);
        StonesCalc stonesCalc = new StonesCalc();
        String fileName = "C:\\test.bin";
        while(true)
        {
            View.output("\nMenu:\n"
                    + "1.Output necklace\n"
                    +"2.Sorting stones by weight\n"
                    +"3.Sorting stones by price\n"
                    +"4.See one stone(by number in necklace)\n"
                    +"5.Exit\n"
                    +"6.Выборка до цены\n"
                    +"7.Сортировка через comparable");
            choice = Inputer.inputInt();
            switch(choice){
                case 1:{
                    View.output(necklace+"");
                    break;
                }


                case 2:{
                    stonesCalc.sortStonesByWeigth(necklace);
                    View.output(necklace+"");
                    break;
                }

                case 3:{
                    stonesCalc.sortStonesByPrice(necklace);
                    View.output(necklace+"");
                    break;
                }
                case 4:{
                    System.out.println("Номер камня: ");
                    index = Inputer.inputInt();
                    System.out.println(necklace.getStone(index));
                }
                break;

                case 5:{
                    System.exit(0);
                }
                break;
                case 6:{
                    System.out.println("До какого ценника: ");
                    weight = Inputer.inputInt();
                    container = FindByWeight.lookUpTo(necklace,weight,countOfStones);
                    View.output(container + "");
                }

                break;
                case 7:{
                    Collections.sort(necklace.getNecklace());
                    View.output(necklace+"");
                }
                break;
                case 8: {
                    BinaryFileWorker.write(necklace,"text.bin");
                }
                break;
                case 9:{
                    View.output(BinaryFileWorker.read("text.bin")+"");
                }
                break;
                default:
                    View.output("Error: Incorrect choice.");
            }

        }
    }

}
