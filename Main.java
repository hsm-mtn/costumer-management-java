import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Comparator<Costumer> com = new Comparator<Costumer>() {
            public int compare(Costumer i, Costumer j ){
                return i.getName().compareTo(j.getName());
            }
        };

        List<Costumer> cos = new ArrayList<Costumer>();

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter the number of costumers :");
            int nb = sc.nextInt();

            for(int n = 1; n<=nb; n++){
                System.out.println("enter the info for the costumer number "+n);
                System.out.println("the identification number of the costumer is :");
                int getId = sc.nextInt();
                sc.nextLine();

                System.out.println("enter the name of the costumer :");
                String getName = sc.nextLine();

                System.out.println("enter the  product to buy :");
                String getProduct = sc.nextLine();

                System.out.println("enter the quantity of the product :");
                int getQuantity = sc.nextInt();
                sc.nextLine();

                cos.add(new Costumer(getId, getName, getProduct, getQuantity));

            }
        }

        System.out.println("your costumers and their info are :");

        Collections.sort(cos, com);

        for(Costumer c : cos){
            System.out.println(c);
        }
        
        
    }
}
