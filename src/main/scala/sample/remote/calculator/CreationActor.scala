package sample.remote.calculator

import akka.actor.{Props, Actor}

class CreationActor extends Actor {

  def receive: Receive = {
    case op: MathOp =>
      val calculator = context.actorOf(Props[CalculatorActor])
      calculator ! op
    case result: MathResult => result match {
      case MultiplicationResult(n1, n2, r) =>
        println("Multiplication Result: %d * %d = %d".format(n1, n2, r))
        context.stop(sender())
      case DivisionResult(n1, n2, r) =>
        println("Division Result: %d / %d = %d".format(n1, n2, r))
        context.stop(sender())
    }

  }
}
