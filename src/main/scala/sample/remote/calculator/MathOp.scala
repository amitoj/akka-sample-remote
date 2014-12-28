package sample.remote.calculator

trait MathOp

case class Add(number1: Int, number2:Int) extends MathOp

case class Subtract(number1: Int, number2:Int) extends MathOp

case class Multiply(number1: Int, number2:Int) extends MathOp

case class Divide(number1: Double, number2:Int) extends MathOp

trait MathResult

case class AddResult(number1: Int, number2:Int, result: Int) extends MathResult

case class SubtractResult(number1: Int, number2:Int, result: Int) extends MathResult

case class MultiplicationResult(number1: Int, number2:Int, result: Int) extends MathResult

case class DivisionResult(number1: Double, number2:Int, result: Double) extends MathResult

