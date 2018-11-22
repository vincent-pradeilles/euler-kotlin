
/* Composition */

typealias Function<T> = (T) -> T

infix fun <T> Function<T>.composeWith(other: Function<T>): Function<T> {
    return { x ->
        other(this(x))
    }
}
