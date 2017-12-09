package higherorderfuns

fun Int.unfold(until: Int.() -> Int = { 1 },
               block: Int.() -> Int = { dec() }): List<Int> =
        listOf<Int>().let {
            fun f(l: List<Int>, a: Int): List<Int> =
                if (until() == a) l.plus(a)
                else f(l.plus(a), a.block())
            f(it, this)
        }

fun main(args: Array<String>) = 22.unfold { 11 }.let(::print)