package aa.pkg9.ej.pkg3.poo.pkg12;

public class AA9Ej3POO12 {

    public static void main(String[] args) {
        
        SMS mensaje = new SMS("1234567890", "0987654321", "Jose", "Andres", "Como has pasado");
        MMS imagen = new MMS("1234567890", "0987654321", "Jose", "Andres", "A_546327.jpg");

        mensaje.enviar();
        mensaje.ver();

        imagen.enviar();
        imagen.ver();
    }
}
