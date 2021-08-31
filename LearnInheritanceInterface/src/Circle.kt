class Circle:IFormula {
    var radius:Double=0.0
    constructor()
    constructor(radius:Double)
    {
        this.radius=radius
    }
    override fun area(): Double {
        return Math.PI*Math.pow(radius, 2.0);
    }
    override fun perimeter(): Double {
        return 2*Math.PI*radius
    }
}