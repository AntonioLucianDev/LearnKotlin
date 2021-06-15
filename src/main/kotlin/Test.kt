class Test {

    fun main(args: Array<String>) {
        println("Hello World!")
        loopArrayOfNumbers();
    }

    fun loopArrayOfNumbers() {
        val numbers = arrayOf(1, 2, 3, 4, 5);
        for (number in numbers) {
            println("Prova: $number");
        }
    }
}