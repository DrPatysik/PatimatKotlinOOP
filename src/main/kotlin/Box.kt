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
}