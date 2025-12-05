package mate.academy.model

class IsoscelesTrapezoid(
    val baseOne: Int,
    val baseTwo: Int,
    val height: Int,
    color: Color
) : Figure(color) {
    override fun draw() {
        println("Figure: isoscelesTrapezoid, area: ${getArea()} sq. units, "
                + "baseOne: $baseOne units, baseTwo: $baseTwo, "
                + "height: $height units, color: ${color.name}")
    }

    override fun getArea(): Double {
        return MAGICNUMBER * (baseOne + baseTwo) * height
    }
}
