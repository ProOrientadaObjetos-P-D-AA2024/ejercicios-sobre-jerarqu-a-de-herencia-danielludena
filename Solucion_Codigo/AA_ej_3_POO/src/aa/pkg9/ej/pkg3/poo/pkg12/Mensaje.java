package aa.pkg9.ej.pkg3.poo.pkg12;

class Mensaje {

    private String remitente;
    private String destinatario;
    private String nombreRemitente;
    private String nombreDestinatario;

    public Mensaje(String remitente, String destinatario, String nombreRemitente, String nombreDestinatario) {
        this.remitente = remitente;
        this.destinatario = destinatario;
        this.nombreRemitente = nombreRemitente;
        this.nombreDestinatario = nombreDestinatario;
    }

    public String getRemitente() {
        return remitente;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public String getNombreRemitente() {
        return nombreRemitente;
    }

    public String getNombreDestinatario() {
        return nombreDestinatario;
    }

    public void enviar() {
    }

    public void ver() {
    }
}
