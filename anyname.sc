1+1

case class BusinessRule(name:String)

new BusinessRule("data item type conversion")

class RegularClass(name:String)

new RegularClass("data item")

BusinessRule("new value")

BusinessRule.apply("new value")

object RuleComposer {
  def myMethod(name: String) = {
    BusinessRule(name)
  }
}

object RuleComposer1 {
  def myMethod(name: String) = {
    name
  }
}

class RuleComposer {
  def myMethod(name: String) = {
    name
  }
}
RuleComposer.myMethod("Hello")

import RuleComposer._

myMethod("Hello Again after git")

//Excercise: Create a command line application that prints out all the command line arguments

List()
Array()
Seq()
Set()
