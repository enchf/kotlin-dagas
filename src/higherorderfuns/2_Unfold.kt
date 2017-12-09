package higherorderfuns

fun Int.unfold(initial: List<Int> = listOf(), until: Int.() -> Boolean, block: Int.() -> Int): List<Int> =
        with(initial.plus(this)) { if (until()) this else block().unfold(this, until, block) }

fun main(args: Array<String>) = 22
        .unfold( until = { equals(1) }, block = { if (rem(2) == 0) div(2) else times(3).plus(1) } )
        .let(::print)