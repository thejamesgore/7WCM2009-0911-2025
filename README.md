Hey there!

# Kotlin Exam Cheat Sheet (`kotlin.md`)

> A compact, exam-ready reference covering functions, types, control flow, arrays/strings, errors/testing, classes/OOP, and design patterns from your readings.

---

## 0) Syntax essentials

```kotlin
// Comments
// single-line
/* multi-line */

// Variables
val x: Int = 42          // immutable reference
var y: Int = 7           // mutable reference
y = 9

// String templates
println("x=$x, sum=${x + y}")

// Imports
import kotlin.math.PI
import kotlin.math.sqrt
```

---

## 1) Types & literals

- **Int** (32-bit), **Double**, **Boolean**, **Char** (`'A'`), **String** (`"abc"`), **Unit** (no useful value), **Array<T>**
- Conversions: `42.toDouble()`, `"123".toInt()`, `42.toString()`
- String escapes: `\"`, `\\`, `\n`, `\t`

**Common pitfalls**

- `3 / 2 == 1` (Int division). Use `3.toDouble() / 2`.
- `"1" + 2 == "12"` (string concatenation).

---

## 2) Expressions vs statements

- **Expression** → produces a value (`1 + 2`, `if (...) ... else ...`).
- **Statement** → does an action (`var y=1`, `println`, `return`, `throw`).
- Kotlin’s `if` and `when` can be **expressions**.

---

## 3) Functions

```kotlin
// Expression body
fun sq(n: Int): Int = n * n

// Block body
fun add(a: Int, b: Int): Int {
    return a + b
}

// Returns Unit (no value)
fun greet(): Unit = println("Hello")
```

> **Definition vs Call**: definition declares name/params/return/logic; call executes it with arguments.

---

## 4) Conditionals

```kotlin
fun grade(score: Int): String =
    if (score < 50) "Fail"
    else if (score < 75) "Pass"
    else "Excellent"

// Multi-branch
fun toPhonetic(c: Char): String =
    when (c) {
        'A' -> "Alpha"
        'B' -> "Bravo"
        else -> "[ERROR]"
    }
```

---

## 5) Loops & ranges

```kotlin
for (i: Int in 0..5) println(i)      // inclusive
for (i in 0 until 5) println(i)      // 0..4
for (c in "abcdef") println(c)

var i = 0
while (i < 3) { println(i); i++ }

outer@ for (i in 0..9) {
    for (j in 0..9) {
        if (i*j > 20) break@outer
        if (j % 2 == 0) continue
    }
}
```

---

## 6) Recursion vs iteration

```kotlin
// Recursion
fun factRec(n: Int): Int =
    if (n <= 1) 1 else n * factRec(n - 1)

// Loop
fun factLoop(n: Int): Int {
    require(n >= 0) { "n >= 0" }
    var res = 1
    for (i in 1..n) res *= i
    return res
}
```

---

## 7) Strings & arrays

```kotlin
val s = "Kotlin"
val ch: Char = s[1]            // 'o'
val sub = s.substring(1, 3)    // "ot"
val len = s.length

val a: Array<Int> = arrayOf(1,2,3)
println(a.size)                        // 3
println(a.contentDeepToString())       // [1, 2, 3]
println(a.contentDeepEquals(arrayOf(1,2,3))) // true

// Safe loops
for (i in s.indices) print(s[i])
for (i in a.indices) println(a[i])
```

**Utility examples**

```kotlin
fun reverse(s: String): String {
    var out = ""
    for (i in s.length - 1 downTo 0) out += s[i]
    return out
}

fun concat(a: Array<Int>, b: Array<Int>): Array<Int> {
    val res = Array(a.size + b.size) { 0 }
    for (i in a.indices) res[i] = a[i]
    for (j in b.indices) res[a.size + j] = b[j]
    return res
}

fun countOccurrences(word: String, ch: Char): Int {
    var count = 0
    for (c in word) if (c == ch) count++
    return count
}
```

---

## 8) Errors, exceptions, defensive programming

**Compile-time**: syntax/type errors (caught by compiler).
**Runtime**: happen while running (e.g., `/ by zero`, index out of bounds).
**Semantic/logic**: compiles & runs but wrong behavior.

```kotlin
// Return code pattern (recoverable)
fun safeDivide(a: Int, b: Int): Int =
    if (b == 0) -1 else a / b

// Exception pattern (unrecoverable or caller must handle)
fun divideOrThrow(a: Int, b: Int): Int {
    if (b == 0) throw ArithmeticException("Division by zero")
    return a / b
}

// Defensive preconditions
fun takePercentage(n: Int): Double {
    require(n in 0..100) { "n must be 0..100" } // throws IllegalArgumentException if false
    return n / 100.0
}

// try/catch
try {
    println(divideOrThrow(10, 0))
} catch (e: ArithmeticException) {
    println("Caught: ${e.message}")
}
```

---

## 9) Testing

### Using `kotlin.test`

```kotlin
import kotlin.test.*

// Subject
fun add(a: Int, b: Int): Int = a + b

fun main() {
    assertEquals(2, add(1,1))
    assertTrue(add(2,2) == 4)
    assertNotEquals(5, add(2,2))
    assertFailsWith<ArithmeticException> { divideOrThrow(1, 0) }
}
```

### Manual (no library)

```kotlin
fun expectEq(expected: Any, actual: Any, label: String) {
    if (expected == actual) println("✅ $label")
    else println("❌ $label (expected=$expected, actual=$actual)")
}

fun testAll() {
    expectEq(2, add(1,1), "add 1+1")
    try { divideOrThrow(1,0); println("❌ expected exception") }
    catch (e: ArithmeticException) { println("✅ caught ${e.message}") }
}
```

**Regression testing**: re-run prior tests after changes.

---

## 10) Program design recipe (Reading 4)

1. **Problem analysis → data definitions** (what info? how represented?)
2. **Signature & purpose** (name/params/return + doc comment)
3. **Examples** (inputs/expected outputs)
4. **Template** (structure: cases, if/when, loops)
5. **Definition** (fill in logic)
6. **Testing** (run examples; add edge cases; fix bugs)

---

## 11) Batch & interactive programs

```kotlin
// Batch: input via args
fun main(args: Array<String>) {
    println("Args count = ${args.size}")
    if (args.isNotEmpty()) println("First = ${args[0]}")
}

// Interactive (console)
fun readlnStrict(): String {
    val line = readLine() ?: throw Exception("Unexpected null")
    return line
}
```

---

## 12) Classes & OOP

### Class, properties, methods, `this`, `toString`, `init`

```kotlin
class Rectangle(val width: Int, val height: Int) {

    // Methods (behavior)
    fun area(): Int = width * height
    fun scale(factor: Int): Rectangle = Rectangle(width * factor, height * factor)

    // Validation / initialization runs after construction
    init {
        require(width > 0 && height > 0) { "width/height must be > 0" }
    }

    // Readable representation (overrides Any.toString())
    override fun toString(): String = "Rectangle(${width}x${height})"
}

fun demoRectangle() {
    val r = Rectangle(3, 4)
    println(r)              // Rectangle(3x4)
    println(r.area())       // 12
    println(r.scale(2))     // Rectangle(6x8)
}
```

### Mutability & aliasing (references)

```kotlin
class Counter(var value: Int) { fun inc() { value++ } }

val a = Counter(0)
val b = a          // alias: both refer to same object
b.inc()
println(a.value)   // 1  (mutating through b changes a's object)
```

### `this`

```kotlin
class Acc(val id: Int, var balance: Double) {
    fun add(amount: Double) {
        this.balance += amount // explicit 'this' clarifies it's the property
    }
}
```

### BankAccount sample (defensive)

```kotlin
class BankAccount(var balance: Double) {
    init { require(balance >= 0) { "Initial balance cannot be negative" } }

    fun deposit(amount: Double) {
        require(amount > 0) { "Deposit must be positive" }
        balance += amount
    }
    fun withdraw(amount: Double) {
        require(amount > 0) { "Withdrawal must be positive" }
        if (amount > balance) throw IllegalArgumentException("Insufficient funds")
        balance -= amount
    }
    override fun toString(): String = "BankAccount(balance=$balance)"
}
```

**Remember**

- `override` replaces an inherited method (e.g., `toString()` from `Any`).
- `init` runs after constructor params are assigned; great for validation.
- `val` property = immutable; `var` property = mutable.

---

## 13) Concept glossary (quick answers)

- **Function definition**: declares function name/params/return & logic.
- **Function call**: executes function with concrete arguments.
- **Side effect**: any external change besides the return value (printing, I/O, mutating external state).
- **Defensive programming**: validate assumptions (`require`), handle bad inputs.
- **Compile-time error**: caught by compiler (syntax/type mismatch).
- **Runtime exception**: error during execution (divide by zero, index out of bounds).
- **Semantic error (logic bug)**: compiles & runs, but wrong behavior.
- **Abstraction**: hide details; expose simple interface (functions/classes).
- **`this`**: current object inside a class method.
- **`Unit`**: “no useful value” return type.

---

## 14) Patterns & templates (copy/paste)

**If/else**

```kotlin
val msg = if (cond) "A" else "B"
```

**Loop sum range (inclusive)**

```kotlin
fun sumRange(a: Int, b: Int): Int {
    val lo = minOf(a,b); val hi = maxOf(a,b)
    var acc = 0
    for (i in lo..hi) acc += i
    return acc
}
```

**Try/catch test**

```kotlin
try { risky() } catch (e: Exception) { println("Caught: ${e.message}") }
```

**Count in String**

```kotlin
fun count(s: String, ch: Char): Int { var c=0; for (x in s) if (x==ch) c++; return c }
```

**Main with args**

```kotlin
fun main(args: Array<String>) {
    if (args.isEmpty()) println("No args")
    else println("First: ${args[0]}")
}
```

---

## 15) Quick pitfall checklist

- Off-by-one: `0 until n` vs `0..n`
- Indexing past end: last valid index is `size - 1`
- Int division vs Double
- Forgetting to return or wrong return type
- Not writing explicit return types when required by module rules
- Overriding without `override` keyword (won’t replace inherited method)

---

### Mini self-test (60 seconds)

1. Write `fun max(a:Int,b:Int):Int` with `if` expression.
2. Loop print chars of `"abc"` using indices.
3. Explain `require` vs `throw`.
4. Class with `val w:Int, h:Int`, method `area()`.
5. One example each: compile-time, runtime, logic error.

---
