import java.util.Scanner;
public class Buscador {
    public void inicio(int in) {
        Scanner sc = new Scanner(System.in);
        AgregarEmp agregarEmp = new AgregarEmp();
        while (in >= 0){
            System.out.println("Le gustaria buscar empleo '1' o crear oferta de trabajo '2'?");
            int num = sc.nextInt();
            if (num == 2){
                agregarEmp.agregar(0);
            }

            else{
                System.out.println("Digite cualquier palabra clave");
            }
        }
        sc.close();
    }
}
