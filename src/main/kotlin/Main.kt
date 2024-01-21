fun main(args: Array<String>) {
    val myBox: Box = Box(5.5, 6.6, 7.7)
    println(myBox.volume())
    val box1 = Box(5.5, 6.6, 7.7)
    println(box1.volume())

    myBox.compare(box1)
}