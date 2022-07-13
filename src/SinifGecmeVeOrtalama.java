import java.util.Scanner;
public class SinifGecmeVeOrtalama {
    public static void main(String[] args) {
        int  Mat, Fizik, Turkce, Kimya, Muzik ,ToplamNot = 0, DersSayisi = 5;
        double Avarage;
        Scanner Not = new Scanner(System.in);

        System.out.print("Matematik Notunuzu Giriniz: ");
        Mat = Not.nextInt();

        System.out.print("Fizik Notunuzu Giriniz: ");
        Fizik = Not.nextInt();

        System.out.print("Türkçe Notunuzu Giriniz: ");
        Turkce = Not.nextInt();


        System.out.print("Kimya Notunuzu Giriniz: ");
        Kimya = Not.nextInt();


        System.out.print("Müzik Notunuzu Giriniz: ");
        Muzik = Not.nextInt();

        if ( Mat > 100 || Mat < 0 ){
            DersSayisi--;
        }else{
            ToplamNot += Mat;
        }

        if ( Fizik > 100 || Fizik < 0 ){
            DersSayisi--;
        }else{
            ToplamNot += Fizik;
        }

        if ( Turkce > 100 || Turkce < 0 ){
            DersSayisi--;
        }else{
            ToplamNot += Turkce;
        }

        if ( Kimya > 100 || Kimya < 0 ){
            DersSayisi--;
        }else{
            ToplamNot += Kimya;
        }

        if ( Muzik > 100 || Muzik < 0 ){
            DersSayisi--;
        }else{
            ToplamNot += Muzik;
        }
        Avarage = ToplamNot / DersSayisi;
        if (Avarage >= 55 ){
            System.out.println("Tebrikler Sınıfı Başarıyla Geçtiniz!");
        }else{
            System.out.println("Üzgünüz, Seneye Yine Bekleriz ^_^ ");
        }
        System.out.println("Ortalamanız: "+Avarage);

                }


    }


