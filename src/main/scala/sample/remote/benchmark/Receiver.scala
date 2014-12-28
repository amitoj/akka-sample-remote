package sample.remote.benchmark

import akka.actor.{Props, ActorSystem, Actor}
import com.typesafe.config.ConfigFactory

object Receiver {
  def main(args: Array[String]): Unit = {
    val system = ActorSystem("Sys", ConfigFactory.load("remotelookup"))
    system.actorOf(Props[Receiver], "rcv")
  }
}

class Receiver extends Actor {
  import Sender._

  def receive = {
    case m: Echo => sender() ! m
    case Shutdown => context.system.shutdown()
    case _ =>
  }
}
