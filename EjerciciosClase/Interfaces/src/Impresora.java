public class Impresora implements Imprimible{
    String pagina = "Soy una página que se va a imprimir a continuación";

    public void Imprime() {
        System.out.println(pagina);
    }
}
