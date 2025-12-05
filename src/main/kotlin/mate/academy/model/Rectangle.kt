package mate.academy.model

class Rectangle(
    val width: Int,
    val height: Int,
    color: Color
) : Figure(color) {
    override fun draw() {
        println("Figure: rectangle, area: ${getArea()} sq. units, "
                + "width: $width units, height: $height,  color: ${color.name}")
    }

    override fun getArea(): Double {
        return (height * width).toDouble()
    }
}
