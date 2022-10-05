import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int c;
        Scanner inp=new Scanner(System.in);

        System.out.print("Lütfen sıcaklığı giriniz: ");
        c=inp.nextInt();

        if (c<5){
            System.out.println("Kayak yapmaya gidebilirsin.");
        }
        else if(c>=5 && c<15){
            System.out.println("Sinemaya gidebilrisin.");
        }
        else if (c>=15 && c<25){
            System.out.println("Pikniğe gidebilirsin.");
        }
        else{
            System.out.println("Yüzmeye gidebilirsin.");
        }

        System.out.println("Hava Sıcaklığı: "+ c);
    }
}
