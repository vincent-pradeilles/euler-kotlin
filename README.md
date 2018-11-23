# Euler Kotlin

> This project is a partial port to Kotlin of the features available in the [Euler](https://github.com/mattt/Euler) created by [Mattt](https://github.com/mattt).
> The features that were not ported are already defined by the Kotlin standard library.

Euler Kotlin is library that implements most of the standard mathematical operation not already provided by the Kotlin standard library.

While Kotlin does not support custom operators, it does, however, provide two very powerful mechanisms that this library relies on: the ability to extend non-nominal types (e.g. typealiases) and the support of infix functions.

---

## Arithmetic

- `infix fun Int.divides(other: Int): Boolean` - [Divides](http://en.wikipedia.org/wiki/Divisor)
- `infix fun Int.doesNotDevide(other: Int): Boolean` - [Does Not Divide](http://en.wikipedia.org/wiki/Divisor)

## Calculus

- `val RealFunction.derivative: RealFunction` - [Derivative (1st, 2nd, 3rd, and Nth Order)](http://en.wikipedia.org/wiki/Derivative#Lagrange.27s_notation)
- `infix fun RealFunction.integratedOver(range: IntegrationRange): Double` - [Integral (Definite & Indefinite)](http://en.wikipedia.org/wiki/Integral)

## Functions

- `infix fun <T> Function<T>.composeWith(other: Function<T>): Function<T>` - [Composition](http://en.wikipedia.org/wiki/Function_composition)

## Vectors

- `infix fun Array<Number>.dotProduct(other: Array<Number>): Number` - [Dot Product](http://en.wikipedia.org/wiki/Dot_product)
- `infix fun Vector3D.crossProduct(other: Vector3D): Vector3D` - [Cross Product](http://en.wikipedia.org/wiki/Cross_product)
- `val Array<Number>.norm: Number` - [Vector Norm](http://en.wikipedia.org/wiki/Norm_%28mathematics%29)
- `infix fun Array<Number>.angleWith(other: Array<Number>): Number` - [Angle Between Vectors](http://en.wikipedia.org/wiki/Dot_product)

---

## License

MIT

## Contact

Vincent Pradeilles ([@v_pradeilles](https://twitter.com/v_pradeilles))