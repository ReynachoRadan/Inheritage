
public class Limas extends BangunRuang {
    @Override
    double volume(){
        double volume = (double)((s*s)*t*1/3);
        System.out.println("Volume Limas : "+volume);
        return volume;
    } 
}
