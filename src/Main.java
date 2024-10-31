// Şimdi fonksiyonları(methodları) inceleyeceğiz.
// Fonksiyonlar çok kullanışlı yapılardır.
// Örneğin çok büyük projelerde main bloğu içerisinde aynı işlemi defalarca satırlara yazmak
// yerine fonksiyon ile bir kere o işlemi yaptıktan sonra main bloğunda çağırabiliriz.

public class Main {
    public static void main(String[] args) {
        // Örnek bir dizi ve kontrol edilecek sayı
        int[] myArray = {1, 2, 3, 4, 5};
        int myNumber = 3;

        // Fonksiyonu çağırarak sonucu kontrol et
        boolean result = containsNumber(myArray, myNumber);

        // Sonucu ekrana yazdır
        if(result) {
            System.out.println(myNumber + " dizide bulunuyor.");
        } else {
            System.out.println(myNumber + " dizide bulunmuyor.");
        }
    }

    // Belirli bir sayının dizide olup olmadığını kontrol eden fonksiyon
    public static boolean containsNumber(int[] array, int number) {
        for (int i : array) {
            if (i == number) {
                return true; // Sayı bulundu
            }
        }
        return false; // Sayı bulunamadı
    }
}
