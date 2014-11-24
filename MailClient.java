
public class MailClient
{
   //servidor
   private MailServer server;
   //usuario
   private String user;
   
   /**
    * constructor con dos parametros
    */
   public MailClient(MailServer newServer, String newUser)
   {
       server = newServer;
       user = newUser;
    
   }
   
   /**
    * metodo getNextMailItem para recuperar un correo
    */
   public MailItem getNextMailItem()
   {
       return server.getNextMailItem(user);
   }
   
   /**
    * metodo que imprime el correo del servidor
    */
   public void printNextMailItem()
   {
       MailItem newItem = server.getNextMailItem(user);
       if ( newItem !=null)
       {
           newItem.printDatos();
        
       }
       else
       {
            System.out.println("No hay mensajes nuevos en el buzón");
       }
   }
   
   /**
    * metodo que envia un email
    */
   public void sendMailItem(String newTo, String newMessage)
   {
     
     MailItem newmessage;
     newmessage = new MailItem(user, newTo,  newMessage);
     server.post(newmessage);
     

   }
         
}
