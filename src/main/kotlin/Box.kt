class Box(var width: Double, var length: Double, var height: Double) {
    private var width1 = 0.0
    private var length1 = 0.0
    private var height1 = 0.0
    constructor(width: Double, length: Double, height: Double,
                _width1: Double, _length1: Double, _height1: Double ):
                this(width,length,height)
    {width1 = _width1; height1 = _height1; length1 = _length1 }


    fun volume(): Double {
        return width * length * height
    }
   private fun volume1(): Double {
        return width1 * length1 * height1
    }
    fun compare(box: Box) {
        val thisVolume = volume()
        val boxVolume = box.volume()
        if (thisVolume > boxVolume) {
            println("Our box is bigger")
        }
        else if(thisVolume < boxVolume) {
            println("Our box is less")
        }
        else{
            println("Boxes are the same")
        }
    }
    companion object {
        fun compare2Boxes(box1:Box,box2:Box){
            if(box1.volume() > box2.volume()){
                println("Box #1 is bigger,than box #2")
            }
            else if( box1.volume() < box2.volume()){
                println("Box #2 is bigger,than box #1")
            }
            else{ println("Both boxes  are the same")}
        }
        fun compareSomeBoxes(vararg boxes:Box) {
            var boxesArrList:MutableList<Double> = mutableListOf()
            for(box in boxes) {
                boxesArrList.add(box.volume()) }

             for(i in boxes ) {
                 if (boxesArrList.max() == i.volume()) {
                     println("Box with parameters ${i.width},${i.length},${i.height} is biggest")
                 }

             }     }

        fun compareSomeBoxesSecond(vararg boxes:Box) {
            var c = 0.0
            for (box in boxes) {
                var a = box.volume()
                var b = 0.0

                if (a > b) {
                    c = a
                } else {
                    c = b
                }
            }

            for( b in boxes) {
               if( c == b.volume()) {
                   println("Biggest box have width-${b.width},length-${b.length},height-${b.height}")
               }
            }
        }
    }



    fun volumeBiggerTwoBoxes(box: Box):Double {
        return volume1() + volume() + 2.0
    }
}