fun main(args: Array<String>) {
    println("PI number="+Math.PI)
    println("Absolute value of -4="+Math.abs(-4))
    println("number "+Math.max(9,2)+" is greater number")
    println("Square root of 25="+Math.sqrt(25.0))
    println("3 power of 4 ="+Math.pow(3.0,4.0))
    var angle=45
    var rad=Math.PI*angle/180
    println("sin($angle)="+Math.sin(rad))
    println("cos($angle)="+Math.cos(rad))
    println("tan($angle)="+Math.tan(rad))
    println("cotan($angle)="+Math.cos(rad)/Math.sin(rad))
}
