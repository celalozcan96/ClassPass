package ClassPass;

import java.util.Scanner;

//Dersler : Matematik, Fizik, Türkçe, Kimya, Müzik

//Geçme Notu : 55

//Ödev
//Eğer girilen ders notları 0 veya 100 arasında değil ise ortalamaya katılmasın.

public class classPassProgram {
    public static void main(String[] args) {
        int math,turkish,physic,chemistry,music;

        Scanner inp = new Scanner(System.in);

        System.out.print("Matematik Notunuzu Giriniz :");
        math = inp.nextInt();
        System.out.print("Türkçe Norunuzu Giriniz :");
        turkish = inp.nextInt();
        System.out.print("Fizik Notunuzu Giriniz :");
        physic = inp.nextInt();
        System.out.print("Kimya Notunuzu Giriniz :");
        chemistry = inp.nextInt();
        System.out.print("Müzik Notunuzu Giriniz :");
        music = inp.nextInt();

        if(math<0 || 100<math){
            math = 0;
        }
        if(turkish<0 || 100<turkish){
            turkish = 0;
        }
        if(physic<0 || 100<physic){
            physic = 0;
        }
        if(chemistry<0 || 100<chemistry){
            chemistry = 0;
        }
        if(music<0 || 100<music){
            music = 0;
        }

        double average = (math + turkish + physic + chemistry + music)/5;

        if(average>=55){
            System.out.println("Sınıfı Geçtiniz.Tebrikler!");

        }else{
            System.out.println("Sınıfta Kaldınızı!");
        }
        System.out.println("Not ortalamanız :" + average);
        
    }
    
}
