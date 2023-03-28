
public class Kerucut extends BangunRuang{
    
    @Override
    double volume(){
        double volume = (double)(Math.PI * r * r * t * 1/3);
        System.out.println("Volume Kerucut : " + volume);
        return volume;
    }
}
