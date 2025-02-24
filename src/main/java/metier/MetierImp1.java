package metier;

import Dao.IDao;

public class MetierImp1 implements Metier{
    final private IDao iDao;

    public MetierImp1(IDao dao){
        this.iDao = dao;
    }
    @Override
    public void calcule() {
        iDao.getData();
    }


}
