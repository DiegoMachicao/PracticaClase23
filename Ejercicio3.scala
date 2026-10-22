trait Transporte{
    def costo(distancia: Double): Double
}

class Taxi(
    val precio: Double
 ) extends Transporte {
    def costo(distancia: Double): Double = precio * distancia/100
}

class Bus(
    val color: String
) extends Transporte {
    def costo(distancia: Double): Double = if distancia >= 100 then 3 else 2
}

def calcularViaje(transporte: Transporte, distancia: Double): Double  = {
    transporte.costo(distancia)
}

object Ejercicio3{
    def main(args: Array[String]): Unit = {
        val taxi = new Taxi(3)
        val bus = new Bus("amarillo")
        println(calcularViaje(taxi, 70))
        println(calcularViaje(bus, 120))
    }
}