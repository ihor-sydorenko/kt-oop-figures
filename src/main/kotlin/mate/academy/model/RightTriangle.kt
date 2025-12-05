package mate.academy.model

class RightTriangle(
    val firstLeg: Int,
    val secondLeg: Int,
    color: Color
) : Figure(color) {
    override fun draw() {
        println("Figure: rightTriangle, area: ${getArea()} sq. units, "
                + "firstLeg: $firstLeg units, secondLeg: $secondLeg, color: ${color.name}")
    }

    override fun getArea(): Double {
        return MAGICNUMBER * firstLeg * secondLeg
    }
}
