package calculadora;

public class Calculadora {

    public static void main(String[] args) {
        ventana inicio = new ventana();
        inicio.setTitle("calculadora basica");//titulo de la ventana
        inicio.setBounds(500, 100, 400, 600);//tamaño de la ventana
        inicio.setResizable(false);//dezabilitar la edicion del tamaño de la ventana
        inicio.insertarpanel();
        inicio.insertaretiquetas();
        inicio.insertartexto();
        inicio.insertarbotones();
    }

}
