import example.Lists

object Main extends App
    {
    println("sum of (1, 3, 2) is: " + Lists.sum(List(1, 3, 2)))
    println("max of (3, 7, 2) is: " + Lists.max(List(3, 7, 2)))
    println("sum of () is: " + Lists.sum(List()))
    println("max of () is: " + Lists.max(List()))
    }