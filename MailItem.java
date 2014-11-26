
public class MailItem
{
    //origen del mensaje
    private String from;
    //destino del mensaje
    private String to;
    //contenido
    private String message;
    //asuntos
    private String subject;
    /**
     * constructor con 3 parametros para crear mensajes
     */
    public MailItem(String from, String to, String message, String subject)
    {
      this.from = from;
      this.to = to;
      this.subject = subject;
      this.message = message;
    }
    
    /**
     * metodo getter para el origen
     */ 
    public String getFrom()
    {
      return from;
    }
    
    /**
     * metodo getter para el destino
     */ 
    public String getTo()
    {
      return to;
    }
    
    /**
     * metodo getter para el mensaje
     */ 
    public String getMessage()
    {
      return message;
    }
    
    public void printDatos()
    {
      System.out.println("From:  " + from);
      System.out.println("To:  " + to);
      System.out.println("Subject:  " + subject);
      System.out.println("Message:  " + message);
    }
}
