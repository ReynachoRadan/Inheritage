
public class BangunRuang {
     int r,t,s,p,l,LA,TP;
    double volume(){
        System.out.println("Menghitung Volume Bangun Ruang");
        return 0;
    }
     void printhitung()
        {   
            String[] bangun = {"","Tabung","Kerucut","Bola","Kubus","Balok","Prisma","Limas"};
            System.out.println("Pilih Bangun yang Ingin Dihitung : ");
            for (int i = 1; i < bangun.length; i++) {
                System.out.println(i+" : "+bangun[i]);
            }
            System.out.print("Input : ");
        }
}
