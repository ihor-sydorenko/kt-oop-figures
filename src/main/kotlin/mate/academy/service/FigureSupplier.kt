package mate.academy.service

import mate.academy.model.Circle
import mate.academy.model.Color
import mate.academy.model.Figure
import mate.academy.model.IsoscelesTrapezoid
import mate.academy.model.Rectangle
import mate.academy.model.RightTriangle
import mate.academy.model.Square
import kotlin.random.Random

const val DEFAULT_RADIUS = 10
const val FIGURES_COUNT = 5
const val MAX_RANDOM_NUMBER = 100
val DEFAULT_COLOR = Color.WHITE
val colorSupplier = ColorSupplier()

class FigureSupplier() {

    fun getRandomFigure(): Figure {
        val nextInt = Random.nextInt(FIGURES_COUNT)
        when (nextInt) {
            0 -> return getRandomSquare()
            1 -> return getRandomRectangle()
            2 -> return getRandomRightTriangle()
            3 -> return getRandomCircle()
        }
        return getRandomIsoscelesTrapezoid()
    }

    fun getDefaultFigure(): Figure = Circle(DEFAULT_RADIUS, DEFAULT_COLOR)

    private fun getRandomSquare(): Square {
        return Square(Random.nextInt(MAX_RANDOM_NUMBER), colorSupplier.getRandomColor())
    }

    private fun getRandomRectangle(): Rectangle {
        return Rectangle(
            Random.nextInt(MAX_RANDOM_NUMBER),
            Random.nextInt(MAX_RANDOM_NUMBER),
            colorSupplier.getRandomColor()
        )
    }

    private fun getRandomRightTriangle(): RightTriangle {
        return RightTriangle(
            Random.nextInt(MAX_RANDOM_NUMBER),
            Random.nextInt(MAX_RANDOM_NUMBER),
            colorSupplier.getRandomColor()
        )
    }

    private fun getRandomCircle(): Circle {
        return Circle(1, Color.WHITE)
    }

    private fun getRandomIsoscelesTrapezoid(): IsoscelesTrapezoid {
        return IsoscelesTrapezoid(
            Random.nextInt(MAX_RANDOM_NUMBER),
            Random.nextInt(MAX_RANDOM_NUMBER),
            Random.nextInt(MAX_RANDOM_NUMBER),
            colorSupplier.getRandomColor()

        )
    }
}
