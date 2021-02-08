package prototype1;
import java.util.Scanner;
public class method {
    int pilih1, pilih2, banyak, count = 0, kembalian, bayar, kurang;
    Scanner io = new Scanner(System.in);
    void method1(){
        System.out.println("Masukkan pilihan anda    : ");
        pilih1 = io.nextInt();
        
        System.out.println("Banyak yang ingin dibeli : ");
        banyak = io.nextInt();
        
        if (pilih1 == 1) {
            count += banyak * 14000;
        }
        else if (pilih1 == 2) {
            count += banyak * 13000;
        }
        else if (pilih1 == 3) {
            count += banyak * 15000;
        }
        System.out.println("Total yang harus dibayar : Rp "+count);
    }
    void method2(){
        System.out.print("Masukkan uang anda : ");
        bayar = io.nextInt();
    }
    void method3() {
        kembalian = bayar - count;
        kurang = count - bayar;
        if (bayar >= count) {
            System.out.println("Kembalian sebesar : Rp "+kembalian);
        }
        else if (bayar < count) {
            System.out.println("Kurang sebesar : Rp"+kurang);
        }
    }
}
