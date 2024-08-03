import akka.actor.Actor
import akka.actor.ActorLogging

class ServiceB extends Actor with ActorLogging {
  override def receive: Receive = {
    case message: String =>
      log.info(s"Service B received message: $message")
  }
}
