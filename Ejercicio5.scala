trait Notificacion{
    def notificar(): String
}

class Email(
    val remitente: String
) extends Notificacion {
    def notificar(): String = s"Mensaje de ${this.remitente}"
}

class SMS(
    val destinatario: String
) extends Notificacion {
    def notificar(): String = s"Mensaje para ${this.destinatario}"
}

class NotificacionPush(
    val aplicacion: String
) extends Notificacion {
    def notificar(): String = s"Notificacion de ${this.aplicacion}"
}

def mandarNotificacion(notificacion: Notificacion): String = {
    notificacion.notificar()
}

object Ejercicio5{
    def main(args: Array[String]): Unit = {
        val email = new Email("Yo")
        val sms = new SMS("Tu")
        val push = new NotificacionPush("YouTube")
        println(mandarNotificacion(email))
        println(mandarNotificacion(sms))
        println(mandarNotificacion(push))
    }
}