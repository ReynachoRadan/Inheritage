
public class Tabung extends BangunRuang{
    
    @Override
    double volume(){
        double volume = (double)(Math.PI * r * r * t);
        System.out.println("Volume Tabung : " + volume);
        return volume;
    }
}
