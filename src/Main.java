import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int yas = 24;
        double maas = 22500.75;
        float sicaklik = 35.6f;
        boolean aktifMi = true;
        char cinsiyet = 'K';
        String ad = "Berfin";
        final double PI = 3.14159;

        System.out.println("Yaş: " + yas);
        System.out.println("Maaş: " + maas);
        System.out.println("Sıcaklık: " + sicaklik);
        System.out.println("Aktif mi?: " + aktifMi);
        System.out.println("Cinsiyet: " + cinsiyet);
        System.out.println("Ad: " + ad);
        System.out.println("Pi sayısı: " + PI);


        Scanner input = new Scanner(System.in);
        System.out.print("Adınız: ");
        String isim = input.nextLine();
        System.out.println("Merhaba, " + isim + "!");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Birinci sayıyı girin: ");
        double sayi1 = scanner.nextDouble();

        System.out.print("İkinci sayıyı girin: ");
        double sayi2 = scanner.nextDouble();
        double toplam = sayi1 + sayi2;
        double fark = sayi1 - sayi2;
        double carpim = sayi1 * sayi2;
        if (sayi2 != 0) {
            double bolum = sayi1 / sayi2;
            System.out.println("Bölme sonucu: " + bolum);
        } else {
            System.out.println("Bölme işlemi için ikinci sayı sıfır olamaz!");
        }

        System.out.println("Toplama sonucu: " + toplam);
        System.out.println("Çıkarma sonucu: " + fark);
        System.out.println("Çarpma sonucu: " + carpim);


        System.out.print("Bir sayi girin: ");
        double sayi = scanner.nextDouble();

        if (sayi >= 0) {
            System.out.println("Girilen sayi pozitif");
        }
        if (sayi == 0) {
            System.out.println("Girilen sayi Sıfır");
        } else {
            System.out.println("Girilen sayi negatif");
        }


        System.out.print("Bir sayı girin: ");
        int sayi3 = scanner.nextInt();

        if (sayi3 % 2 == 0) {
            System.out.println("Çift sayı");
        } else {
            System.out.println("Tek sayı");
        }


        System.out.print("0 ile 100 arasında bir not girin: ");
        int not = scanner.nextInt();

        if (not < 0 || not > 100) {
            System.out.println("Geçersiz not!");
        } else {
            switch (not / 10) {
                case 10:
                case 9:
                    System.out.println("Harf notu: A");
                    break;
                case 8:
                    System.out.println("Harf notu: B");
                    break;
                case 7:
                    System.out.println("Harf notu: C");
                    break;
                case 6:
                    System.out.println("Harf notu: D");
                    break;
                default:
                    System.out.println("Harf notu: F");
            }
        }


        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        int i = 10;

        while (i >= 1) {
            System.out.println(i);
            i--;
        }


        int[] sayilar = {100, 200, 300, 400, 500};

        for (int a = 0; i < sayilar.length; a++) {
            System.out.println("Eleman " + a + ": " + sayilar[a]);
        }


        System.out.print("1. sayıyı girin: ");
        int sayi4 = scanner.nextInt();

        System.out.print("2. sayıyı girin: ");
        int sayi5 = scanner.nextInt();

        System.out.print("3. sayıyı girin: ");
        int sayi6 = scanner.nextInt();

        int enBuyuk;

        if (sayi4 >= sayi5 && sayi4 >= sayi6) {
            enBuyuk = sayi4;
        } else if (sayi5 >= sayi4 && sayi5 >= sayi6) {
            enBuyuk = sayi5;
        } else {
            enBuyuk = sayi6;
        }

        System.out.println("En büyük sayı: " + enBuyuk);


        System.out.print("Pozitif bir sayı girin: ");
        int n = scanner.nextInt();

        int total = 0;

        for (int b = 1; i <= n; b++) {
            total += b;
        }

        System.out.println("1'den " + n + "'e kadar sayıların toplamı: " + total);

        scanner.close();


    }
}
