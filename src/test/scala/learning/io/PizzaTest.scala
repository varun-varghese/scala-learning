package learning.io

import collection.mutable.Stack
import org.scalatest.{FunSuite, BeforeAndAfter}

import learning.io.Pizza

class PizzaTest extends FunSuite with BeforeAndAfter {
  
  var pizza: Pizza = _
  
  before {
    pizza = new Pizza
  }
  
  test("new pizza has zero toppings") {
    assert(pizza.getToppings.size == 0)
  }
  
}