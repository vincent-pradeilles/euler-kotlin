
/* Divides */

infix fun Int.divides(other: Int): Boolean {
    return this == other || this % other == 0
}

/* Does Not Divide */

infix fun Int.doesNotDevide(other: Int): Boolean {
    return !(this divides other)
}
