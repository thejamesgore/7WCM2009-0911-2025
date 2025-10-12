package ppd.readings.reading3



/******************************************************************************
 * Here are the custom data types and functions for you to use in the Egg Mayo
 * example.  You can read and use this code (e.g., call the functions), but you
 * don't need to modify it.
 */

// Custom data types and values -- we'll cover this feature in a later reading
object Egg             { override fun toString() = "Egg" }
object CookedEgg       { override fun toString() = "Chopped hard-boiled egg" }
object Cress           { override fun toString() = "Watercress" }
object ChoppedCress    { override fun toString() = "Chopped watercress" }
object Mayo            { override fun toString() = "Mayonnaise" }
object EggMayoSandwich { override fun toString() = "Egg, mayonnaise and cress sandwich" }

// For now, you only need to know that we can use them as values and types
Egg    // A value "Egg" of type Egg
Cress  // A value "Cress" of type Cress
Mayo   // A value "Mayo" of type Mayo

// Hard-boil, peel and roughly chop the eggs.
fun prepareEgg(x: Egg): CookedEgg {
    return CookedEgg
}

// Wash, dry and roughly chop the cress.
fun prepareCress(x: Cress): ChoppedCress {
    return ChoppedCress
}

// Mix the chopped eggs and cress with some mayonnaise, and spread the filling
// between sliced bread.
fun makeEggMayo(x: ChoppedCress, y: CookedEgg, z: Mayo): EggMayoSandwich {
    return EggMayoSandwich
}
/* End provided data types and functions
 ***************************************/



/******************************************************************************
 * Ex. 1.1 💻   The custom data types and the following helper functions are
 * provided above. You should use them, but you don’t need to modify
 * them in any way.
 *
 * You can ignore the code of the custom data types (we’ll talk about these
 * features in a later reading).
 * You can also ignore the function bodies (remember, function calls are black
 * boxes!).
 *
 * // Helper functions
 * prepareCress(x: Cress): ChoppedCress = /*snip*/
 * prepareEgg(x: Egg): CookedEgg = /*snip*/
 * makeEggMayo(x: ChoppedCress, y: CookedEgg, z: Mayo): EggMayoSandwich = /*snip*/
 *
 * ▷ Using the provided types and functions (as above), write and run a function
 * call to makeEggMayo.
 * Compare your code against the recipe – is it faithful to the original
 * algorithm? Hint: not exactly – ▷ why?
 */

println(makeEggMayo(prepareCress(Cress), prepareEgg(Egg), Mayo))

/* End Ex. 1.1
 *************/



/******************************************************************************
 * Ex. 2.1 💻   ▷ In your worksheet, split up this code
 *
 * makeEggMayo(prepareCress(Cress), prepareEgg(Egg), Mayo)
 *
 * by introducing variable declarations for each of the intermediate values
 * that arise during the computation. Write each variable declaration on a
 * separate line above the final function call, following the original recipe.
 * Hint: you can check any information that you may need, such as type names,
 * in various ways. E.g., by mousing over the relevant expressions, running
 * some code fragments, or reading the source code
 */

val myCress: ChoppedCress = prepareCress(Cress)

val myEgg: CookedEgg  = prepareEgg(Egg)

val mySandwich: EggMayoSandwich  = makeEggMayo(myCress,myEgg,Mayo)

println(mySandwich)

/* End Ex. 2.1
 *************/



/******************************************************************************
 * Ex. 2.2 💻   Write and try to run the following in your worksheet.
 *
 * val y: String = "I am a val"
 * val z: String = "I am a var"
 * println("y=$y, z=$z")  // $y, $z access the variable values from inside a string (for printing)
 * z = "I've been overwritten"  // Assignment statement: overwrite the value of `z`
 * println("y=$y, z=$z")
 *
 * The above code doesn’t work. ▷ Why?   You can see IntelliJ’s feedback (mouse
 * over the highlighted error). ▷ Fix the error and check the output is as you
 * expect.
 */

val y: String = "I am a val"
var z: String = "I am a var"
println("y=$y, z=$z")  // $y, $z access the variable values from inside a string (for printing)
z = "I've been overwritten"  // Assignment statement: overwrite the value of `z`
println("y=$y, z=$z")


/* End Ex. 2.2
 *************/



/******************************************************************************
 * Ex. 2.3 💻  Write some function with a parameter in your worksheet. Include
 * an assignment to the parameter in the function definition. ▷ What does this
 * small test tell us?
 */


fun someFunc(x: Int = 12) = println(x)
// someFunc()


/* End Ex. 2.2
 *************/



/******************************************************************************
 * Ex. 3.1 💻  ▷ Reuse the provided types, values and helper functions to
 * complete this function definition in the statement sequence style, following
 * the original recipe. Do not change the existing parameters (i.e., none) or
 * return type.
 */


fun makeEggMayoSandwich(): EggMayoSandwich {
    return mySandwich
}
makeEggMayoSandwich()

var que = 'A'
var huh = "123".toInt(5)
println(huh)

/* End Ex. 3.1
 *************/


/******************************************************************************
 * Ex. 3.2 💻  ▷ Rewrite the max function from the previous reading in the
 * statement sequence style, in two different ways
 */

// TODO

/* End Ex. 3.2
 *************/



/******************************************************************************
 * Ex. 3.3 💻  ▷ Write a function that takes a string and an integer, and
 * returns true if the integer is a valid index of the string, and false
 * otherwise. Write one version using if...else if...else and another version
 * using only if...else.
 */


fun threePoint(string: String, int: Int): Boolean{
    val len = string.length
    if(0 <= int && int < len){
        return true
    }else {
    return false
}}

threePoint("number", 6)


/* End Ex. 3.3
 *************/



/******************************************************************************
 * Ex. 3.4 💻  ▷ Write a function that takes a string and an integer, and
 * Use your worksheet to help answer the following if needed.
 *
 * 1. ▷ Are these equivalent? Explain.
 *
 *    [see the reading]
 *
 * ▷ Are these equivalent? Explain.
 *
 *    [see the reading]
 */

fun testWhile(): Int {
    var num = 0
    while(num < 10){
        println(num)
        num++
    }
    return num
}
// testWhile()

/* End Ex. 3.4
 *************/



/******************************************************************************
 * Ex. 3.5 💻  ▷ Write a function that takes a string and an integer, and
 *
 * var i: Int = 0
 * while (i < 10) {
 * println(i)
 * i = i + 1  // Assignment to an "outer" variable (a side effect on the environment)
 * }
 *
 * ▷ Identify each instance of an expression or a statement in the above code.
 * ▷ What is the overall output? Work it out by hand, then check your answer in your worksheet.
 */



// TODO

/* ▷ Can we change the var to a val? Why?
 */

/* End Ex. 3.5
 *************/



/******************************************************************************
 * Ex. 3.6 💻  ▷ What is the output of the above for loop if we replace the
 * comment (A) by println(i)? Note: IntelliJ replaces line breaks with ;
 * characters when displaying loop output in the worksheet.
 */

// for (i: Int in 0..10) {
//     println(i)
// }



/* End Ex. 3.6
 *************/



/******************************************************************************
 * Ex. 3.7 💻  ▷ Write a function that takes two integers and uses loop to sum
 * all the integers between those values (inclusive) – write one version using a
 * while loop, and another version using a for loop.
 */


fun threeSevenWhile(x: Int, y: Int): Int {
    var sum: Int = 0
    var i = x
    while(i <= y){
        sum += i
        i++
    }
    println(sum)
    return sum
}


fun threeSevenFor(x: Int, y: Int): Int {
    var sum: Int = 0
    for(i in x..y){
        sum += i
    }
    return sum
}

// threeSevenFor(2, 5)


/* End Ex. 3.7
 *************/



/******************************************************************************
 * Ex. 3.8 💻  for loops work nicely with strings. E.g.,
 *
 * for (c: Char in "abcdef") {  // Prints each char on a new line
 * println(c)
 * }
 *
 * ▷ Write an equivalent while loop (with extra code as needed).
 */

// TODO

/* End Ex. 3.8
 *************/





/******************************************************************************
 * Ex. 3.9 💻  ▷ Rewrite the fact function in the previous reading using a loop
 * statement instead of recursion. Use your worksheet to test the answer.
 * Hint: you may find it helpful to look at the original definition of
 * factorial:
 * n! = n x (n-1) x ... x 2 x 1
 * Hint: consider declaring a var variable outside the loop to hold a
 * “temporary” result that you update in each loop iteration by an assignment.
 */

// TODO

/* End Ex. 3.9
 *************/



/******************************************************************************
 * Ex. 4.2 💻  ▷ Code up this control flow graph as a function in your
 * worksheet, and try few test calls for some small input values.
 * [see the reading]
 * Note: for for loops, we write true to mean there remains a value in the range
 * to visit, and false otherwise.
 * ▷ Describe what this function does in a sentence or two.
 */

// TODO

/* End Ex. 4.2
 *************/



/******************************************************************************
 * Ex. 5.1 💻  Using assignment to update a counter-like Int variable is a very
 * common task. E.g.,
 *
 * i = i + 1                            j = j - 1
 *
 * Consequently, there are explicit notations for increment and decrement, e.g.,
 *
 * i++  // Same as i = i + 1            j-- // Same as j = j - 1
 *
 * However, this notation is also more flexible than the basic assignment. E.g.,
 * we can write
 *
 * var i: Int = 0  // N.B. var
 * val j: Int = i++
 * println("i=$i, j=$j")  // Prints "i=1, j=0"
 *
 * ▷ Based on the above (or otherwise), describe the meaning of the increment
 * notation i++ in terms of (some of) the concepts of “expression”, “statement”,
 * “result” and “side effect”?
 */

// TODO

/* End Ex. 5.1
 *************/



/******************************************************************************
 * Ex. 5.2 💻
 *
 * 1. ▷ Write a function to calculate the modulo operation manually,
 * without using *, / or* %, in the imperative style. You may assume the
 * numbers are non-negative Ints.
 * Hint: you can think of modulo as “repeated subtraction and seeing what’s
 * left”.
 */

// TODO

/* 2. ✏️ ▷ Draw a control flow diagram for your function in the style
 *    demonstrated in the previous section.
 *
 * 3. (Optional.) ▷ Write another version of your function in the functional
 *    style.
 */

// TODO

/* End Ex. 5.2
 *************/



/******************************************************************************
 * Ex. 5.3 💻
 *
 * ▷ Write a function that takes a string and prints out each word in the
 *   string on a new line. Write it in the imperative style, using only String
 *   operations seen so far in this module.
 *
 * - For this exercise, assume a word is any sequence of non-space characters,
 *   and words are separated by one or more spaces.
 * - One easy way: remember that Kotlin has separate println (adds a newline on
 *   the end) and print (no newline – prints only what you give it) functions.
 *   Also remember when printing in a worksheet to end with a newline (or else
 *   IntelliJ may not display the output correctly).
 *   Or devise your own solution!
 *
 * Reminders:
 *
 * - str[i] access the character at index i (starting at 0) of the string str,
 *   and str.substring(i, j) gives the substring from index i (inclusive) to
 *   index j (exclusive).
 * - For worksheet output IntelliJ displays newlines as ';' characters (to fit
 *   the output on one line).
 */

// TODO

/* End Ex. 5.3
 *************/



/******************************************************************************
 * Ex. 5.4 💻   Here are two useful statements when working with loops:
 * break@label and continue@label.
 *
 * // A couple of nested loops (just an example)
 * outer@for (i: Int in 0..9) {  // We can add labels to loops using `@`
 *     inner@for (j: Int in 0..9) {
 *         /*snip*/
 *         break@outer  // Exit the "outer" loop -- could also specify "inner"
 *         /*snip*/
 *         continue@outer  // Skip ahead to the next iteration of "outer" -- could also specify "inner"
 *         /*snip*/
 *     }
 * }
 *
 * We can omit writing the label when break or continue refer to the innermost
 * loop; that would be inner in the above example.
 *
 * - ▷ Write a loop that prints each character in a String up until the first
 *   space. Hint: try the break statement.
 */

// TODO

/* - ▷ Write a loop that prints each character in a String except for spaces.
 *   Hint: try the continue statement.
 */

// TODO

/* - ✏️ ▷ Draw the control flow diagrams for your above answers.
 */

/* End Ex. 5.4
 *************/



/******************************************************************************
 * Ex. 5.5 💻
 *
 * - ▷ Write a function that takes two strings, and returns a string containing
 *   only characters that occur in both. Write it in the imperative style,
 *   using only String operations seen so far in this module.
 *   Hint:* the question is not very specific – there is more than one
 *   reasonable answer.
 */

// TODO

/* ✏️ ▷ Draw the control flow diagram for your function.
 */

/* End Ex. 5.5
 *************/
