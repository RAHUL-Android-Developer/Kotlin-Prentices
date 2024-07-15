fun main(args: Array<String>) {
  
   
    checkType("Hello")
    checkType(42)

}
fun checkType(obj: Any) {
    when (obj) {
        is String -> println("obj is a String")
        is Int -> println("obj is an Int")
        else -> println("obj is of unknown type")
    }
}