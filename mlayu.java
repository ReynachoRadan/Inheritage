
import java.util.Scanner;


public class mlayu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Pilihan Yang Mau Dihitung
            BangunRuang y = new BangunRuang();
            y.printhitung();
        //Bangun yang ada disini    
            Balok kayu = new Balok();
            kubus dadu = new kubus();
            Tabung gas = new Tabung();
            Kerucut topi = new Kerucut();
            Bola sepak = new Bola();
            Prisma kaca = new Prisma();
            Limas piramid = new Limas();
            int z = sc.nextInt();
        if (z==1) 
        {
        //Volume Tabung
            System.out.print("Masukkan Jari Jari : ");
            int a = sc.nextInt();
                gas.r=a;
            System.out.print("Masukkan Tinggi Tabung : ");    
            int b = sc.nextInt();
                gas.t=b;
                    gas.volume();
        }
        else if(z==2)
        {
        //Volume Kerucut
            System.out.print("Masukkan Jari Jari : ");
            int c = sc.nextInt();
                topi.r=c;
            System.out.print("Masukkan Tinggi Kerucut : ");    
            int d = sc.nextInt();
                topi.t=d;
                    topi.volume();
        }
        else if (z==3)
        {
        //Volume Bola    
            System.out.print("Masukkan Jari Jari : ");
            int e = sc.nextInt();
                sepak.r=e;
                    sepak.volume();
        }
        else if(z==4)
        {
        //Volume Kubus
            System.out.print("Masukkan Panjang sisi : ");
            int f = sc.nextInt();
                dadu.s=f;
                    dadu.volume();
        }
        else if(z==5)
        {
        //Volume Balok
            System.out.print("Masukkan Panjang Balok : ");
            int g = sc.nextInt();
                kayu.p=g;
            System.out.print("Masukkan Lebar Balok : ");
            int h = sc.nextInt();
                kayu.l=h;
            System.out.print("Masukkan Tinggi Balok : "); 
            int i = sc.nextInt();
                kayu.t=i;
                    kayu.volume();
        }
        else if(z==6)
        {
        //Volume Prisma
            System.out.print("Masukkan Panjang Alas : ");
            int j = sc.nextInt();
                kaca.s=j;
            System.out.print("Masukkan Tinggi : ");
            int k = sc.nextInt();
                kaca.t=k;
            System.out.print("Masukkan Tinggi Prisma : ");
            int l = sc.nextInt();
                kaca.TP=l;
                    kaca.volume();
        }
        else if(z==7)
        {
        //Volume Limas
            System.out.print("Masukkan Panjang sisi alas : ");
            int m = sc.nextInt();
                piramid.s=m;
            System.out.print("Masukkan Tinggi Limas : ");
            int n = sc.nextInt();
                piramid.t=n;
                    piramid.volume();
        }
        else
        {
            System.out.println("Error Input.......");
        }
    }
}
