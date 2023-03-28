public class Bola extends BangunRuang{
    
    @Override
    double volume(){
        double volume = (double)(Math.PI * r * r * r * 4/3);
        System.out.println("Volume Bola : " + volume);
        return volume;
    }
}
