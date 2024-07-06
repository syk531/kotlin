class MyClass {
    companion object {
        const val CONSTANT = "CONSTANT_VALUE"
        fun utilityFunction() {
            println("Utility function")
        }
    }
}

fun main() {
    println(MyClass.CONSTANT)  // CONSTANT_VALUE
    MyClass.utilityFunction()  // Utility function
}