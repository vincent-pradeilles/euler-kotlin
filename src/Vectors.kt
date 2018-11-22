import kotlin.math.acos
import kotlin.math.sqrt
import kotlin.test.assertEquals

/* Dot Product */

infix fun Array<Number>.dotProduct(other: Array<Number>): Number {
    assertEquals(this.size, other.size, "arguments must have same count")

    var product = emptyArray<Double>()

    for ((index, _) in this.withIndex()) {
        val a = this[index].toDouble()
        val b = other[index].toDouble()

        product += (a * b)
    }

    return product.sum()
}

/* Cross Product */

data class Vector3D(val x: Number, val y: Number, val z: Number)

infix fun Vector3D.crossProduct(other: Vector3D): Vector3D {
    val a = this.y.toDouble()* other.z.toDouble() - this.z.toDouble() * other.y.toDouble()
    val b = this.z.toDouble() * other.x.toDouble() - this.x.toDouble() * other.z.toDouble()
    val c = this.x.toDouble() * other.y.toDouble() - this.y.toDouble() * other.x.toDouble()

    return Vector3D(a, b, c)
}

/* Norm */

val Array<Number>.norm: Number
    get() = sqrt(this.map { it.toDouble() * it.toDouble() }.sum())

/* Angle */

infix fun Array<Number>.angleWith(other: Array<Number>): Number {
    return acos((this dotProduct other).toDouble() / (this.norm.toDouble() * other.norm.toDouble()))
}
