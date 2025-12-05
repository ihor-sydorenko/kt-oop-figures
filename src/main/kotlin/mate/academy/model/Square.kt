package mate.academy.model

import kotlin.math.pow

class Square(val side: Int, color: Color) : Figure(color) {
    override fun draw() {
        println("Figure: square, area: ${getArea()} sq. units, side: $side units, color: ${color.name}")
    }

    override fun getArea(): Double {
        return (side * side).toDouble()
    }
}
