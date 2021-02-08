package prototype1;
import java.util.Scanner;
public class Prototype1 {
    public Prototype1(String nama, int harga){
        System.out.println(nama+" : "+harga);
    }
    public static void main(String[] args) {
        method as = new method();
        int pilih2;
        Scanner io = new Scanner(System.in);
        
        do {
        Prototype1 cons1 = new Prototype1("1. Matahari",14000);
        Prototype1 cons2 = new Prototype1("2. Melati",13000);
        Prototype1 cons3 = new Prototype1("3. Mawar",15000);
        
        as.method1();
        as.method2();
        as.method3();
        
            System.out.println("Lanjutkan ?"+"\n"+"1. Ya"+"\n"+"2. Tidak");
            pilih2 = io.nextInt();
        } while (pilih2 == 1);
    }
    
}
