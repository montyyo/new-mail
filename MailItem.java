
public class MailItem
{
    //origen del mensaje
    private String from;
    //destino del mensaje
    private String to;
    //contenido
    private String message;
    
    /**
     * constructor con 3 parametros para crear mensajes
     */
    public MailItem(String newFrom, String newTo, String newMessage)
    {
      from = newFrom;
      to = newTo;
      message = newMessage;
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
      System.out.println("Message:  " + message);
    }
}
