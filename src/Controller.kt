class Controller() {
    fun determinanMatrix(dataa: MutableList<Int>, listener: Callback) {
        var hasil : Int = ((dataa[0]*dataa[3]) - (dataa[2]*dataa[1]))
        listener.kirimBalik(hasil)
    }
}