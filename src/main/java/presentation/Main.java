package presentation;

import Dao.IDao;
import Dao.IDaoImpl1;
import metier.Metier;
import metier.MetierImp1;

public class Main {


    public static void main(String[] args)
    {
        IDao iDao = new IDaoImpl1();
        Metier metier = new MetierImp1(iDao);

        metier.calcule();
    }
}
