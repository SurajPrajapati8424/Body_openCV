import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class Demo{
    static Scanner sc;
    static String psk1,psk2;
    public static void main(String[] args) throws Exception {
        System.out.println("Enter Password");
        sc = new Scanner(System.in);
        psk1 = sc.nextLine();
        System.out.println("Enter Password");
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        psk2 = br.readLine();
        System.out.println(psk1+" and "+psk2);
        if (psk1.toString().equals(psk2.toString())) {
            System.out.println("OKEY");
        }
        else{
            System.out.println("Maa chod denge,Bhaiya Ji");
        }
    }
}
