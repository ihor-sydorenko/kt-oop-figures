package mate.academy

import mate.academy.model.Figure
import mate.academy.service.FigureSupplier

const val ARRAY_SIZE = 6
val figureSupplier = FigureSupplier()

fun main() {
    val arrayOfFigures = arrayOfNulls<Figure>(ARRAY_SIZE)
    for (i in 0..arrayOfFigures.size - 1) {
        if (i < arrayOfFigures.size / 2) {
            arrayOfFigures[i] = figureSupplier.getRandomFigure()
        } else {
            arrayOfFigures[i] = figureSupplier.getDefaultFigure()
        }
    }
    arrayOfFigures.forEach { it?.draw() }
}
