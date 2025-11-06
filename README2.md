# 🧠 Kotlin Programming & Program Design Cheat Sheet

_(Object Orientation & Data Structures – 7WCM0058)_

---

## ⚙️ 1. CLASSES & OBJECTS

### Class Definition

```kotlin
class User(val id: Int, var name: String)
```

- `class` = defines a new type
- `val` = immutable property, `var` = mutable
- Constructor params define object state

**Create object:**

```kotlin
val u = User(1, "Alice")
```

**Access properties:**

```kotlin
u.name
u.id
```

### Method Definition

```kotlin
class Coord(val x: Int, val y: Int) {
    fun add(c: Coord): Coord = Coord(this.x + c.x, this.y + c.y)
    fun invert(): Coord = Coord(this.y, this.x)
    override fun toString(): String = "Coord($x, $y)"
}
```

- `this` → refers to the target object
- Call methods: `val c3 = c1.add(c2)`
- Override `toString()` for readable output

### Init Block

Executed at object creation – great for validation:

```kotlin
init {
    require(id > 0) { "Invalid ID" }
}
```

---

## 🧩 2. OBJECT-ORIENTED PROGRAMMING (OOP)

| Concept         | Meaning                                                |
| --------------- | ------------------------------------------------------ |
| **Class**       | Template for objects                                   |
| **Object**      | Instance with state (properties) + behaviour (methods) |
| **this**        | Refers to the current object                           |
| **Constructor** | Creates an object                                      |
| **Aliasing**    | Two refs → same object                                 |
| **State**       | Properties’ current values                             |
| **Behaviour**   | Methods that operate on state                          |

### Mutable vs Immutable

```kotlin
class Cell(var z: Int)   // mutable
class Point(val x: Int)  // immutable
```

- **Mutable:** state can change (`var`)
- **Immutable:** fixed after construction (`val`)

---

## 🔗 3. REFERENCES & ALIASING

```kotlin
val a = Coord(1, 2)
val b = a     // alias: same object
```

- Changes through `b` visible via `a`
- Objects live on heap, variables hold references

---

## 🔒 4. ENCAPSULATION & COHESION

- **Encapsulation:** bundle data + methods; hide internals.
- **High cohesion:** related features grouped together.
- **Low coupling:** few dependencies between components.

### Visibility Modifiers

```kotlin
private val secret = 42
```

- `private` hides details from external code.

---

## 🧬 5. INTERFACES & INHERITANCE

### Interface

```kotlin
interface Drawable {
    fun draw(g: GraphicsContext)
}
```

- Defines abstract behaviour, no constructor.
- No object instantiation (interface ≠ class).

### Implementation

```kotlin
class Circle(val r: Double): Drawable {
    override fun draw(g: GraphicsContext) { /* ... */ }
}
```

### Interface Inheritance

```kotlin
interface ResetableIntGenerator: IntGenerator {
    fun reset()
}
```

### Class Inheritance

```kotlin
open class Animal(val name: String)
class Dog(name: String): Animal(name)
```

- `open` makes class inheritable.
- One superclass allowed; multiple interfaces OK.
- `super.method()` calls superclass version.

### Multiple Inheritance Resolution

```kotlin
class C: A, B {
    override fun m() = super<A>.m()
}
```

---

## 🧱 6. SUBTYPING & POLYMORPHISM

| Rule         | Meaning                |
| ------------ | ---------------------- |
| **Subtype**  | “is-a” relationship    |
| **A : B**    | A is a B               |
| **Any**      | Supertype of all types |
| **Upcast**   | Always allowed         |
| **Downcast** | Requires `is` check    |

```kotlin
val x: Drawable = Circle(5.0)     // Upcast
if (x is Circle) x.draw(g)        // Safe downcast
```

### Polymorphism

Same variable/function works for many subtypes:

```kotlin
fun drawAll(shapes: List<Drawable>) {
    for (s in shapes) s.draw(g)
}
```

---

## 🧊 7. DATA CLASSES

For pure data holders:

```kotlin
data class Coord(val x: Double, val y: Double)
```

- Auto `toString()`, `equals()`, `hashCode()`, `copy()`
- Equality based on property values

---

## 🧪 8. UNIT TESTING (JUnit)

```kotlin
@Test
fun testAdd() {
    val c1 = Coord(1.0, 2.0)
    val c2 = Coord(3.0, 4.0)
    val expected = Coord(4.0, 6.0)
    assertEquals(expected.x, c1.add(c2).x)
}
```

- `@Test` marks a unit test.
- `assertEquals(expected, actual)`

---

## 🗂️ 9. COLLECTIONS (Lists, Sets, Maps)

### Lists

```kotlin
val list = mutableListOf("a", "b", "c")
list.add("d")
list.removeAt(0)
println(list[1])
```

- Ordered, allows duplicates
- `.size`, `.add()`, `.removeAt()`, `.contains()`
- `for (x in list) println(x)`
- Immutable: `listOf(...)`

---

### Sets

```kotlin
val s = mutableSetOf("a", "b", "b")
println(s)   // [a, b]
```

- Unordered, unique items
- `.add()`, `.remove()`, `in`, `==` (order-insensitive)

---

### Maps

```kotlin
val map = mutableMapOf("a" to 1, "b" to 2)
map["c"] = 3
println(map["a"])     // 1
map.remove("b")
```

- Key–value pairs
- Keys unique; values may repeat
- Access: `map[key]`
- `.keys`, `.values`, `.size`

---

### Conversions

| From → To    | Method                |
| ------------ | --------------------- |
| List → Set   | `list.toMutableSet()` |
| Set → List   | `set.toMutableList()` |
| List → Array | `list.toTypedArray()` |
| Array → List | `arr.toMutableList()` |

---

## 🏗️ 10. CUSTOM DATA STRUCTURES (Example)

### Interface

```kotlin
interface MutableStringList {
    val size: Int
    fun add(x: String)
    fun get(i: Int): String
}
```

### Implementation

```kotlin
class StringArrayList: MutableStringList {
    private var arr = arrayOf<String>()
    override var size = 0
        private set

    override fun add(x: String) {
        arr += x
        size++
    }

    override fun get(i: Int): String {
        if (i !in 0 until size) throw IndexOutOfBoundsException()
        return arr[i]
    }

    override fun toString() = arr.contentToString()
}
```

---

## 🧾 11. INVARIANTS & DEFENSIVE PROGRAMMING

- **Invariant:** condition that must always hold.
- Example: `balance >= 0` in a wallet.
- Enforce via `init` blocks & validation.
- Prevent invalid state by throwing exceptions early.

```kotlin
class Wallet(var balance: Int) {
    init { require(balance >= 0) }
    fun deposit(x: Int) { require(x >= 0); balance += x }
    fun withdraw(x: Int) {
        require(x <= balance)
        balance -= x
    }
}
```

---

## 🧮 12. IMMUTABILITY & DEFENSIVE COPYING

- Immutable structures prevent aliasing errors.
- **Defensive copy:** return a new object instead of modifying the existing one.

---

## 🧩 13. NULL SAFETY

```kotlin
val x: Int? = null   // may hold null
if (x != null) println(x + 1)
```

- Use `?` to allow null
- **Safe call:** `x?.toDouble()`
- **Elvis operator:** `x ?: 0`
