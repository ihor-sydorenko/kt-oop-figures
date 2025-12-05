package mate.academy.model

class Circle(val radius: Int, color: Color) : Figure(color) {
    override fun draw() {
        println("Figure: circle, area: ${getArea()} sq. units, radius: $radius units, color: ${color.name}")
    }

    override fun getArea(): Double {
        return Math.PI * radius * radius
    }
}