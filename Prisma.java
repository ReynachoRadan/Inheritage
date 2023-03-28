
public class Prisma extends BangunRuang {
    
    
    @Override
    double volume(){
        double LA = (s*t*1/2);       
        double volume = (double)(LA*TP);
        System.out.println("Volume Prisma : "+volume);
        return volume;
    } 
}
