import akka.actor.{ActorSystem, Props}
import akka.management.scaladsl.AkkaManagement
import com.typesafe.config.ConfigFactory
import akka.management.cluster.bootstrap.ClusterBootstrap

object ClusterApp {

  def main(args: Array[String]): Unit = {
    if (args.isEmpty) {
      startup(Seq("2551", "2552", "2553"))
    } else {
      startup(args)
    }
  }

  def startup(ports: Seq[String]): Unit = {
    ports.foreach { port =>
      // Override the configuration of the port
      val config = ConfigFactory.parseString(s"akka.remote.artery.canonical.port=$port")
        .withFallback(ConfigFactory.load())

      // Create an Akka system
      val system = ActorSystem("ClusterSystem", config)
      AkkaManagement(system).start()
      ClusterBootstrap(system).start()

      // Create the actors
      system.actorOf(Props[ServiceA], "serviceA")
      system.actorOf(Props[ServiceB], "serviceB")

      system.log.info(s"Node started at port $port")
    }
  }
}
