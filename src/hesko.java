import java.util.Scanner;

public class hesko {
    public static void main(String[] args) {
        Scanner scat = new Scanner(System.in);

        int n1, n2, decision;
        System.out.print("Ilk sayi : ");
        n1 = scat.nextInt();
        System.out.print("Ikinci sayi : ");
        n2 = scat.nextInt();

        System.out.println("1-Toplama \n2-Cikarma \n3-Carpma \n4-Bolme");
        decision = scat.nextInt();

        switch (decision) {
            case 1:
                System.out.print("Toplama : " + (n1 + n2));
                break;
            case 2:
                System.out.print("Cikarma : " + (n1 - n2));
                break;
            case 3:
                System.out.print("Carpma : " +(n1 * n2));
                break;

            case 4:
                if(n2!=0) {
                    System.out.print("Bolme : " + (n1 / n2));
                }else{
                    System.out.print("0'a bolunemez..");
                }

            break;
            default:
                System.out.print("Hatali Deger Girdiniz..");


        }


    }
}