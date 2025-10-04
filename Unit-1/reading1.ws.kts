package ppd.readings.reading1


/******************************************************************************
 * Ex. 2.1 💻
 * - Create a new Kotlin project in IntelliJ from the source code directory
 *   provided for this reading.
 *   ...
 *   ▷ Open the reading1.ws.kts worksheet in your new project and locate this
 *   exercise.
 */

// Hopefully you've done the above and are reading this inside IntelliJ!

/*
 * - ▷ Write the above code in your worksheet, and run it by clicking the green
 *   arrow near the top-left. (IntelliJ will usually run it automatically for
 *   you, but click if it doesn't.)
 *   Make sure the displayed output is as you expect.
 */

// TODO

// fun sq(x: Int) = x * x
// sq(11) // 121


/* End Ex. 2.1
 *************/


/******************************************************************************
 * Ex. 2.2 💻  ▷ Add the return type to the definition in your worksheet and
 * check it works.
 */

fun sq2(x: Int): Int = x * x
sq2(11) // 121

/* End Ex. 2.2
 *************/


/******************************************************************************
 * Ex. 2.3 💻  ▷ Write the other square function application examples from the
 * earlier examples and exercises in your worksheet – write each one on a
 * separate line below the definition. Run your worksheet and check the outputs
 * are as you expect.
 */

fun sn1(a1: Int, an: Int, n: Int): Int = n * (a1 + an) / 2
sn1(3,15,7) // 63



/* End Ex. 2.3
 *************/


/******************************************************************************
 * Ex. 2.4 💻  We’ll introduce one further data type for this reading: Double –
 * it represents decimal numbers: e.g., -1.0, -0.1, -0.01, 0.0, 0.01, 0.1, 1.0.
 *
 * Warning: the Double data type has some inherent imprecision (we’ll talk more
 * about this next reading).
 * ▷ E.g., try 0.1 + 0.2 in your worksheet and check the result.
 * So don’t worry if your results when using Double are close but not exactly
 * correct.
 */


fun dub(a1: Double, a2: Double): Double = a1 + a2
dub(0.1, 0.2)



/* ▷ Write a new version of the square function that takes and returns a
 * Double. (Give it a different name than sq to prevent confusion.) Test your
 * function on a few values.
 * Note: multiplication for Double values is also written *, and you must
 * write, e.g., 1.0 instead of just 1 where a Double is expected.
 */

fun squareDub(a1: Double, a2: Double): Double = a1 * a2
squareDub(0.1, 0.2)

/* End Ex. 2.4
 *************/


/******************************************************************************
 * Ex. 2.5 💻  ▷ Code up the following calculations as functions, so that you
 * can use your computer to perform them in your worksheet. Run them using some
 * test inputs.
 *
 * - The area of a rectangle:
 */

fun areaOfRectangle(length: Double, width: Double): Double = length * width
areaOfRectangle(10.1,22.4)



/* - Calculate the number of seconds in a given number of years.
 */

fun secondsInYears(): Int = 365 * 24 * 60 * 60


/* Given two points; (x1, y1) and (x2, y2), the gradient of a straight line is
 * given by [see the reading].
 * Note: the division operator is written `/` in Kotlin.
 * Hint: use Double.
 */

fun gradient(x1: Int, x2: Int, y1: Int, y2: Int): Int = (y2 - y1)/(x2 - x1)


/* End Ex. 2.5
 *************/




/******************************************************************************
 * Ex. 3.1 💻
 * Here are some worksheet calculations.
 *
 * (32.0 - 32.0) * 5.0 / 9.0
 * (212.0 - 32.0) * 5.0 / 9.0
 * (-459.67 - 32.0) * 5.0 / 9.0
 *
 * - ▷ In your worksheet, write a function to generalise these calculations.
 */

fun abs(a: Double, b: Double): Double = a - b

/* - ▷ Test your function against the above cases.
 */

abs(32.0, 32.0)
abs(212.0, - 32.0)
abs(-459.67, - 32.0)

/* - ▷ Write the inverse function, i.e., a function that reverses the above
 *   calculation.
 */

// TODO

/* - ▷ Test your inverse function in combination with the original.
 */

// TODO

/* End Ex. 3.1
 *************/


/******************************************************************************
 * Ex. 3.2 💻
 * 1. √... is the square root operation. For our current purposes, we’ll think
 *    of it as an “inverse” of the square operation for positive numbers, e.g.,
 *    √4 = 2, √9 = 3, √16 = 4, etc.
 *    Kotlin provides a function `kotlin.math.sqrt` for this operation.
 *    Note: this Kotlin function takes and returns a Double.
 *    ▷ In your worksheet, write and run:
 *    `kotlin.math.sqrt(121.0)  // Takes and returns a Double`
 */

// TODO

/*    How is sqrt coded – how does it work inside? The relevant answer for this
 *    exercise: we don’t know and it doesn’t matter. As a user of this
 *    function, we see it as a black box – we only care about its output.
 *
 * 2. Here is a right-angled triangle with sides
 *    [snip]
 *    The length of the hypotenuse c can be calculated from the lengths of the
 *    other two sides by √(a2 + b2).
 *    ▷ Code this calculation as a function `pythag` in your worksheet and
 *    test it.
 *    Hint: here are some convenient test values: a=3, b=4, c=5 and a=5, b=12,
 *    c=13.
 */

// TODO

/*    - ▷ If you did not already, write a modified version of your sq function
*       (from the earlier examples/exercises) that takes and returns a
*       Double.
*       Then (re)write your `pythag` function to use that to perform the
*       square operations
*/

// TODO

/* End Ex. 3.2
 *************/


/******************************************************************************
 * Ex. 4.1 💻  Say you’re taking a module that has two assessments, A1 and A2.
 * A formula for calculating for your final module grade is:
 * final grade = [% score for A1] x [weighting of A1] + [% score for A2] x [weighting of A2]
 *
 * Assume the "% scores" are between 0 and 100.
 * Assume the "weightings" are between 0 and 1, and add to 1 in total, e.g.,
 * 0.3 + 0.7 = 1.
 *
 * ▷ In your worksheet, write and test a function that takes the parameters and
 * performs the calculation as above.
 */

// TODO

/* ▷ Write another function to calculate the final module grade from your raw
 * marks and the maximum mark for each assessment (as opposed to %’s).
 * Hint: a good programmer avoids unnecessary work – try to reuse your existing
 * work from above.
 */

// TODO

/* End Ex. 4.1
 *************/


/******************************************************************************
 * Ex. 4.2 💻  The area of a triangle can be calculated 1/2 x a x b x sin C,
 * where C is the angle between the and sides (as in the diagram of the earlier
 * exercise).
 * Kotlin provides a function `kotlin.math.sin` for the sin operation, which
 * takes and returns a `Double`.
 * Note: this Kotlin function expects an angle value expressed as radians,
 * which are different to degrees. The calculation to convert an angle value in
 * degrees to radians is: `rad = def x π / 180`.
 * In Kotlin, the value of is given as a `Double` by `kotlin.math.PI`.
 * ▷ Your task is to write and test a function (or functions) to calculate the
 * area of a triangle, where is originally expressed in degrees.
 */

// TODO

/* - Hint: You may not know or remember much about sin or radians. Don’t worry
 *   – you don’t need to!
 * This is a programming exercise: everything you need for this task has been
 * covered in this reading and provided in the above information.
 * In fact, this exercise may even be better if you’re unfamiliar with the
 * maths – in real-world programming (like other engineering disciplines) we
 * often apply ideas and techniques without complete mastery of the underlying
 * theory. The first requirement is the correctness and quality of the coding.
 */

/* End Ex. 4.2
 *************/


