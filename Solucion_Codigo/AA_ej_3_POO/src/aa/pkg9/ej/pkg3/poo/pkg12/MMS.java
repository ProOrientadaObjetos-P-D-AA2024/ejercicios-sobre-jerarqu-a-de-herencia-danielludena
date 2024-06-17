package aa.pkg9.ej.pkg3.poo.pkg12;

class MMS extends Mensaje {

    private String imagen;

    public MMS(String remitente, String destinatario, String nombreRemitente, String nombreDestinatario, String imagen) {
        super(remitente, destinatario, nombreRemitente, nombreDestinatario);
        this.imagen = imagen;
    }

    public String getImagen() {
        return imagen;
    }

    @Override
    public void enviar() {
        System.out.println("Enviando MMS de " + getRemitente() + " a " + getDestinatario() + ": " + imagen);
    }

    @Override
    public void ver() {
        System.out.println("MMS de " + (getNombreRemitente() != null ? getNombreRemitente() : getRemitente()) + " a "
                + (getNombreDestinatario() != null ? getNombreDestinatario() : getDestinatario()) + ": " + imagen);
    }
}
