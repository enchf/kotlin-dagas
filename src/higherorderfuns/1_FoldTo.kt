package higherorderfuns

fun main(args: Array<String>) = listOf(1,2,3,4).fold(listOf(0)) { a, i -> a.last().plus(i).let(a::plus) }.drop(1).let(::print)
