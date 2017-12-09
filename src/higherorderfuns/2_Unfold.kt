package higherorderfuns

fun Int.unfold(block: (Int) -> Int) = generateSequence(this, block)

fun Int.collatz(): List<Int> = unfold { if (it % 2 == 0) it / 2 else it * 3 + 1 }.takeWhile { it != 1 }.toList()

fun main(args: Array<String>) = 22.collatz().let(::print)