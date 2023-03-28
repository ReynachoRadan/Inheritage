
public class Balok extends BangunRuang{
    @Override
    double volume(){
        double volume = (double)(p*l*t);
        System.out.println("Volume Balok : "+volume);
        return volume;
    }
}
