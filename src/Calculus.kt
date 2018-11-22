import java.util.*
import kotlin.math.round

typealias RealFunction = (Double) -> Double

/* 1st Derivative */

val RealFunction.derivative: RealFunction
    get() = { x ->
        val h = 1e-3

        round((this(x + h) - this(x - h)) / (2 * h) / h) * h
    }

/* 2nd Derivative */

val RealFunction.secondDerivative: RealFunction
    get() = this.derivative.derivative

/* 3rd Derivative */

val RealFunction.thirdDerivative: RealFunction
    get() = this.derivative.derivative.derivative

/* Nth Derivative */

fun RealFunction.nthDerivative(n: Int): RealFunction {
    return (0 until n).fold(this) { f, _ -> f.derivative }
}

/* Definite Integral */

data class IntegrationRange(val a: Double, val b: Double)

infix fun RealFunction.integratedOver(range: IntegrationRange): Double {
    val n = (1e2 + 1).toInt()
    val h = (range.b - range.a) / n.toDouble()

    return (h / 3.0) * (1 until n).fold(this(range.a)) { a, b ->
            val coefficient = if (b % 2 == 0) 4.0 else 2.0
            a + coefficient * this(range.a + b.toDouble() * h)
    } + this(range.b)
}

/* Indefinite Integral / Antiderivative */

val RealFunction.integralFromZero: RealFunction
    get() = { x ->
        this integratedOver IntegrationRange(0.0, x)
    }
