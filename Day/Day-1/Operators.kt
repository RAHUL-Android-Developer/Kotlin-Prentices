fun main(args: Array<String>) {
     

    var a=10 
    var b=5;
    // Arithmetic Operators – 
    println("Addition ${a+b}")
    println("Addition : "+(a.plus(b)))
    println("Multiply : "+a.times(b))
    println("Divide : "+a.div(b))
    println("Remender : "+a.rem(b))

    // Relational Operators – 
    
        var c = 30
        var d = 40
    
        // Checking if c is greater than d
        println("c > d = " + (c > d))
    
        // Checking if c is less than d using compareTo method
        println("c < d = " + (c.compareTo(d) < 0))
    
        // Checking if c is greater than or equal to d
        println("c >= d = " + (c >= d))
    
        // Checking if c is less than or equal to d using compareTo method
        println("c <= d = " + (c.compareTo(d) <= 0))
    
        // Checking if c is equal to d
        println("c == d = " + (c == d))
    
        // Checking if c is not equal to d
        println("c != d = " + (!(c?.equals(d) ?: (d === null))))
    
    
// Unary Operators – 

var e=10
var flag = true
println("First print then increment: "+ e++)
println("First increment then print: "+ ++e)
println("First print then decrement: "+ e--)
println("First decrement then print: "+ --e)


// Logical Operators – 
var x = 100
var y = 25
var z = 10
var result = false
if(x > y && x > z)
 println(x)
if(x < y || x > z)
 println(y)
if( result.not())
println("Logical operators")

// Bitwise Operators – 
// Operators	Meaning         	        Expression
// shl	        signed shift left	        a.shl(b)
// shr	        signed shift right	        a.shr(b)
// ushr	        unsigned shift right        a.ushr()
// and	        bitwise and	                a.and(b)
// or	        bitwise or	                a.or()
// xor	        bitwise xor	                a.xor()
// inv	        bitwise inverse	            a.inv()


    println("5 signed shift left by 1 bit: " + 5.shl(1))   
    println("10 signed shift right by 2 bits: : " + 10.shr(2))
    println("12 unsigned shift right by 2 bits:  " + 12.ushr(2))
    println("36 bitwise and 22: " + 36.and(22))
    println("36 bitwise or 22: " + 36.or(22))
    println("36 bitwise xor 22: " + 36.xor(22))
    println("14 bitwise inverse is: " + 14.inv())  
}