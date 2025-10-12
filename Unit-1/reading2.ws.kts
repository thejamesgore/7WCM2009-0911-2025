package ppd.readings.reading2


/******************************************************************************
 * Ex. 1.1 💻   ▷ Use your worksheet to check the values of Int.MIN_VALUE and
 * Int.MAX_VALUE for yourself.
 */

Int.MIN_VALUE
Int.MAX_VALUE

/* End Ex. 1.1
 *************/


/******************************************************************************
 * Ex. 1.2 💻  ▷ In your worksheet, write a single call to println to produce
 * exactly this output (minus the colouring):
 *
 * Escape sequences include tab "\t", line break "\n",
 * double quotes "\"" and backslash itself "\\".
 *
 * Tip: to see the full output in IntelliJ, click the “Side panel" output mode
 * at the top-right of your worksheet editor, and then mouse over the compacted
 * output to see the tooltip.
 * Hint: this question is just for practice – the answer is not a nice way to
 * write this code.
 */


println("Escape sequences include tab \"\\t\", line break \"\\n\", double quotes \"\\\"\" and backslash itself \"\\\\\".")

fun anotherMain(): Unit = println("Hello, Kotlin world!")

/* End Ex. 1.2
 *************/

/******************************************************************************
 * Ex. 1.3 💻
 * 1. ▷ Write the first version of the `main` function in your worksheet. Mouse
 *    over the function name to see the tooltip: check the return type is
 *    indeed `Unit`. Add Unit as an explicit return type; check the program
 *    still works as before.
 */

// fun main()

/*
 * 2. ▷ Considering either of the above versions of `main`, what do you think
 *    the return type of the `println` function is, and why? Again, you can
 *    mouse over the function name to check your answer.
 */

// TODO

/* End Ex. 1.3
 *************/

// fun checkString(): Double = 1.0 + 2.0 + 3.0

// checkString()

/******************************************************************************
 * Ex. 1.4 💻
 * ▷ Identify the type of each of the following. Hint: there may be some trick
 * entries…
 *
 * " "     -314     A String.     "Not a String."     -3.14     "0.0"
 *             314.0     "314".0     0.0     true     x
 */

fun checkTypes(){
    val string = " "
    val integer = -314
    val aString = "A String."
    val notAString = "Not a tring."
    val double = -3.14
    val numString = "0.0"
    val aDouble = 314.0
    // val anotherString = "314".0
    val anotherDouble = 0.0
    val bool = true
    val anotherval = "x"
}

/* End Ex. 1.4
 *************/


/******************************************************************************
 * Ex. 2.1 💻  ▷ Run the above code snippets in your worksheet to check your
 * answers.
 *
 * Were you precisely right? The second case in particular – did you get the
 * exact output?
 * As you can see, + stands for addition when working with numbers, but
 * concatenation when working with strings.
 */



/* End Ex. 2.1
 *************/


/******************************************************************************
 * Ex. 2.2 ✏️  ▷ First work out by hand the result of each of the following.
 *
 *        1 + 2 + 3 == 6          (1 + 1) >= 2          true || false
 * !(true || false) && (1 > 0)         "a" + "a" < "b"          "abc" != " abc"
 *
 * 💻   ▷ Then write them in your worksheet to check your answers.
 */

// 1 + 2 +3 == 6 // true
// (1 + 1) >= 2 / true

// !(true || false) && (1 > 0) // false



/* End Ex. 2.3
 *************/


/******************************************************************************
 * Ex. 2.3 💻   ▷ Rewrite the code snippet `x != y` in two equivalent (in terms
 * of computation results) but different ways without using the `!=` operation.
 * Use the worksheet to test your answers
 */

// 1 != 2
// "a" != "b"

/* End Ex. 2.3
 *************/


/******************************************************************************
 * Ex. 2.4 ✏️ 💻   ▷ Fill out this grid with an example conversion operation
 * for each applicable combination. That is, some combinations are not
 * applicable – use your worksheet to check as needed.
 *
 * [see the reading]
 */


x.toInt()
x.toDouble()
x.toString()
x.toBoolean()

/* End Ex. 2.4
 *************/


/******************************************************************************
 * Ex. 2.5  💻
 *
 * 1. We’ve had some good times with our `sq` example, but Kotlin actually has
 * a built-in operation for calculating x^y.  Assume `x` and `y` are both of
 * type `Double`.
 *
 * x.pow(y)  // `x` raised to the power of `y`
 *
 * As you’d expect, it returns a `Double`.
 * ▷ Try this operation on some values in your worksheet.
 * If IntelliJ doesn't do it automatically when you use this operation, add
 * this line to the top of your worksheet, immediately under the package
 * declaration:
 * `import kotlin.math.pow`
 */

// TODO

/*
 * Recall that `Int.MAX_VALUE` is the maximum value of an `Int`, which is given
 * by 2^31 - 1.
 * ▷ Use your worksheet to check that the former is indeed equal to the
 * latter.
 */

/* End Ex. 2.5
 *************/


/******************************************************************************
 * Ex. 3.1 ✏️   Identify which of the above expressions are well-formed and
 * badly-formed.
 * ▷ Do this first by hand.
 *
 * - ▷ For each well-formed expression, state the type of the expression and
 *   calculate the result.
 * - ▷ For each badly-formed expression, state why this is the case.
 *
 * 💻   ▷ Then check your answers using your worksheet.
 * You should be able to explain the badly-formed cases based on what we’ve
 * covered and your intuition – it’s fine if the exact error messages (e.g.,
 * mouse over to see the tooltip) returned by IntelliJ are not completely clear
 * at this point
 */

// TODO

/* End Ex. 3.1
 *************/


/******************************************************************************
 * Ex. 3.2 💻   Compare the following Kotlin code against the earlier
 * definition of max.
 * ▷ Does this code match the definition? Write the function in your worksheet
 * and try some test calls.
 *
 *
 * // Assuming `Int`s for simplicity
 * fun max(x: Int, y: Int): Int = if (x > y) x else y
 */

// TODO

/* End Ex. 3.2
 *************/


/******************************************************************************
 * Ex. 3.3 💻  ▷ Code this up as a Kotlin function in your worksheet, and try a
 * couple of test calls. Again, assume to be of type Int for simplicity.
 *
 * [see the reading]
 */

// TODO

/* End Ex. 3.3
 *************/


/******************************************************************************
 * Ex. 3.4 💻  ▷ If you haven’t already, write the above fact function in your
 * worksheet.
 * Run a few test calls. Work through how the computation proceeds for some
 * small values of n, starting from 0. Some points you may find helpful:
 */

// TODO

/* End Ex. 3.4
 *************/


/******************************************************************************
 * Ex. 3.5 💻  The Fibonacci sequence is given by adding the two previous
 * integers to get the next. E.g., starting from 0 and 1:
 * 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ...
 *
 * ▷ Code up this recursive function in your worksheet. It returns the n’th
 * number in the sequence, starting at index 0 (i.e., we count the first number
 * as the 0’th number).
 *
 * [see the reading]
 *
 * - If you’re stuck at first, try to simply transcribe the mathematical
 *   notation as Kotlin code, even if you’re not sure what’s going on yet. Get
 *   it working, then figure out how it works.
 */

// TODO

/*
 * ▷ Identify the base case(s) and the recursive case(s). Run a few test calls.
 * Work through how the recursive computation proceeds for some small values
 * of n.
 */

// TODO

/* End Ex. 3.5
 *************/


/******************************************************************************
 * Ex. 4.1 💻   Here are a couple more `String` operations, and one more basic
 * type. Assume an expression `e` of type `String`.
 *
 * Type 	Example values (as written in Kotlin)
 * Char     'H', 'e', ' ', '!', '1'
 *
 * - Indexing. e[i] accesses the character at index (i.e., position) i in the
 *   string.
 *   - i is an Int.
 *   - The start index is 0, i.e., the position of the first (left-most)
 *     character.
 *   - Characters are values of type Char. In code, we write Char values inside
 *     single quotes, as shown above. They support the usual basic operations,
 *     such as == and <.
 * - Length. e.length gives the number of characters in the string as an Int.
 *   - e.isEmpty() returns true if e.length is 0, else false.
 * - Substring. e.substring(start, end) returns the substring from the start
 *   index (inclusive), to the end index (exclusive).
 *
 * 1. ▷ Try these operations out using a few of your own quick examples.
 */

// TODO

/*
 * 2. Assume some string of length greater than 2.
 *
 *    1. ▷ Write an expression that gives this string excluding the last
 *       character.
 */

// TODO

/*    2. ▷ Write an expression that gives this string excluding the first
 *       character.
 */

// TODO

/*    3. ▷ Write an expression using* substring *that gives the same string.
 */

// TODO

/* 3. ▷ Write a function that takes a string and returns the* last *character,
 *    if any.
 */

// TODO

/* 4. We’re not allowed to write ' ' == " " – it’s not that they are unequal,
 *    we’re not allowed to write this at all. ▷ Why not?
 */

// TODO

/* End Ex. 4.1
 *************/


/******************************************************************************
 * Ex. 4.2 💻  ▷ Write and test a function that checks if a certain character
 * occurs in a string.
 */

// TODO

/* End Ex. 4.2
 *************/


/******************************************************************************
 * Ex. 4.3 💻  ▷ Write and test a function that reverses a string.
 * Hint: try to follow a similar pattern to the previous exercise
 */

// TODO

/* End Ex. 4.3
 *************/


/******************************************************************************
 * Ex. 4.4 💻  (Optional.)   Here’s one more interesting type.
 *
 * Type 	  Example values (as written in Kotlin)
 * Nothing    n/a
 *
 * That’s right – there are no values of this type.
 * ▷ Using what we’ve learned so far, write a function with return type
 * `Nothing`.
 */

// TODO

/* End Ex. 4.4
 *************/
