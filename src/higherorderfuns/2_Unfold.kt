package higherorderfuns

fun Int.unfold(initial: List<Int> = listOf(), until: Int.() -> Boolean, block: Int.() -> Int): List<Int> =
        with(initial.plus(this)) { if (until()) this else block().unfold(this, until, block) }

fun main(args: Array<String>) = 22
        .unfold( until = { this == 1 }, block = { if (this % 2 == 0) this / 2 else 3 * this + 1 } )
        .let(::print)