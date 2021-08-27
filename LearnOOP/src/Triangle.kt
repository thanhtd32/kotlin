class Triangle {
    var slide1:Double=1.0
    var slide2:Double=1.0
    var slide3:Double=1.0
    constructor()
    constructor(slide1:Double,slide2:Double,slide3:Double)
    {
        this.slide1=slide1
        this.slide2=slide2
        this.slide3=slide3
    }
    fun perimeter():Double
    {
        return slide1+slide2+slide3
    }
    fun area():Double
    {
        var p=perimeter()/2
        return Math.sqrt(p*(p-slide1)*(p-slide2)*(p-slide3))
    }
}