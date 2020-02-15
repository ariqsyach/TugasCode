class Main {
    companion object: Callback {
        @JvmStatic
        fun main(args: Array<String>) {
            var index = 0
            var dataa = mutableListOf<Int>()
            do {
                println("Masukkan Index ke $index :")
                var input = readLine()!!.toInt()

                dataa.add(input)
                index++
            } while (index < 4)
            println(dataa)

            var controller = Controller()
            controller.determinanMatrix(dataa,this)
        }

        override fun kirimBalik(hasil: Int) {
            print("Hasil Dari Determinan Adalah : $hasil")
        }
    }
}
