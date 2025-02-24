package presentation;

import Dao.IDao;
import Dao.IDaoImpl1;
import metier.Metier;
import metier.MetierImp1;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static private List<String> calsses = new ArrayList<>();
    public static void main(String[] args)
    {
        try
        {
            Scanner scanner = new Scanner(new File("config.txt"));
            while(scanner.hasNext())
            {
                calsses.add(scanner.nextLine());
            }


            Class Dao = Class.forName(calsses.get(0));
            Class Metier1 = Class.forName(calsses.get(1));

            IDao dao = (IDao) Dao.getConstructor().newInstance();
            Metier metier = (MetierImp1) Metier1.getConstructor(IDao.class).newInstance(dao);

            metier.calcule();

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
