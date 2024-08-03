import akka.actor.Actor
import akka.actor.ActorLogging

class ServiceA extends Actor with ActorLogging {
  override def receive: Receive = {
    case message: String =>
      log.info(s"Service A received message: $message")
  }
}
