package aa.pkg9.ej.pkg3.poo.pkg12;

class SMS extends Mensaje {

    private String texto;

    public SMS(String remitente, String destinatario, String nombreRemitente, String nombreDestinatario, String texto) {
        super(remitente, destinatario, nombreRemitente, nombreDestinatario);
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }

    @Override
    public void enviar() {
        System.out.println("Enviando SMS de " + getRemitente() + " a " + getDestinatario() + ": " + texto);
    }

    @Override
    public void ver() {
        System.out.println("SMS de " + (getNombreRemitente() != null ? getNombreRemitente() : getRemitente()) + " a "
                + (getNombreDestinatario() != null ? getNombreDestinatario() : getDestinatario()) + ": " + texto);
    }
}
