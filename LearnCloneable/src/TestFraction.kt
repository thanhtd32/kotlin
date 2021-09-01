fun main(args: Array<String>) {
    var fractionA=Fraction(1,5)
    println("Numerator of A="+fractionA.Numerator)
    println("Denominator of A="+fractionA.Denominator)
    var fractionB=Fraction(3,7)
    println("Numerator of B="+fractionB.Numerator)
    println("Denominator of B="+fractionB.Denominator)
    fractionA=fractionB
    println("-----Alias------")
    println("Numerator of A="+fractionA.Numerator)
    println("Denominator of A="+fractionA.Denominator)
    fractionA.Numerator=2
    fractionA.Denominator=9
    println("Numerator of B="+fractionB.Numerator)
    println("Denominator of B="+fractionB.Denominator)
    var fractionC=fractionA.copy()
    fractionC.Numerator=114
    fractionC.Denominator=113
    println("Numerator of C="+fractionC.Numerator)
    println("Denominator of C="+fractionC.Denominator)
    println("Numerator of A="+fractionA.Numerator)
    println("Denominator of A="+fractionA.Denominator)
}
