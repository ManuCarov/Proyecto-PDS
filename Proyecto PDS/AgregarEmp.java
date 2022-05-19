import java.util.Scanner;
public class AgregarEmp {
    public void agregar(int pantalla) {
        Scanner sc = new Scanner(System.in);
        ListaOfer listaOfer = new ListaOfer();
        while (pantalla >= 0){
            System.out.println("AGREGUE SU OFERTA DE TRABAJO");
            System.out.println("Nombre de la empresa:");
            String nombre = sc.nextLine();
            System.out.println("Ciudad y dirección:");
            String ubicacion = sc.nextLine();
            System.out.println("Título que requiera el empleador (El caso de no necesitar solo ponga 'ninguno'):");
            String requisito = sc.nextLine();
            System.out.println("Digite palabras claves sobre el empleo para facilitar la busqueda:");
            String palabras = sc.nextLine();
            System.out.println("Agregue una descripción sobre el trabajo que ofrece:");
            String descripcion = sc.nextLine();
            Ofertas oferta = new Ofertas(nombre, ubicacion, requisito, palabras, descripcion);
            listaOfer.agregarOfertas(oferta);
            break;
        }
        System.out.println("Su oferta se agrego correctamente. Proximamente alguien se contactara con usted");
        sc.close();
    }
}
