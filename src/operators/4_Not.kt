package operators

operator fun Unit.not() = null
operator fun Nothing.not() = "Nothing"
operator fun String.not() = {}

fun main(args: Array<String>) = weird().let(::print)

fun weird() = !(!(!"")()!!)!!