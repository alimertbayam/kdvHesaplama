import java.util.Scanner;

public class KdvHesapla
    {
    public static void main(String[] args)
    {
        double ucret,kdv, kdvOran = 0.18,kdvliTutar;
        Scanner input = new Scanner (System.in);

        System.out.println("Ücret Miktarını Giriniz. :");
        ucret = input.nextInt();;

        kdv = ucret * kdvOran;
        kdvliTutar = ucret + kdv;

        kdvOran = (ucret > 1000) ? 0.08 : 0.18;

        System.out.println("KDV'siz Tutar : " + ucret);
        System.out.println("KDV Oranı : " + kdvOran);
        System.out.println("KDV Miktari : " + kdv);
        System.out.println("KDV'li Tutar : " + kdvliTutar);
    }
}
