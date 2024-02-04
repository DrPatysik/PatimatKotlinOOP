class Box(var width: Double, var length: Double, var height: Double) {

    fun volume(): Double {
        return width * length * height
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
    }

}