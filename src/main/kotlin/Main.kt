fun main(args: Array<String>) {
    val myBox: Box = Box(8.5, 6.6, 7.7)
    println(myBox.volume())
    val box1 = Box(5.5, 6.6, 5.7)
    println(box1.volume())
    myBox.compare(box1)
    Box.compare2Boxes(myBox,box1)

    val box2 = Box(3.2,4.3,6.4)
    val box3 = Box(3.2,4.3,6.4)
    Box.compare2Boxes(box2,myBox)

//    выбрать бОльшую коробку
    val twoBoxes = Box(4.3, 2.3, 3.3,
                    6.5, 4.5, 1.3)
    println(twoBoxes.volumeBiggerTwoBoxes(twoBoxes))

//    сравнение нескольких коробок ,2 способа, через vararg
    Box.compareSomeBoxes(Box(9.7,5.7,3.5),
                        Box(4.3,6.5,8.7),
                        Box(3.6,7.7,8.9))

    Box.compareSomeBoxesSecond(Box(1.2,2.2,3.3) ,
        Box(1.1,4.4,5.5),
        Box(1.5,6.7,8.5),
        Box(7.5,6.7,9.7),
        Box(1.7,1.8,2.9))

//    сумма сторон у 2х коробок
    val firstBox = Box(3.2,1.1,3.3)
   println( firstBox.sumSideBoxes(Box(2.3,3.2,4.3)))

}