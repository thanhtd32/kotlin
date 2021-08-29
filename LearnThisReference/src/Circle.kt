class Circle {
    private var radius:Double = 1.0
    public fun  changeRadius(radius:Double) {
        radius=radius
    }
    public fun area():Double
    {
        return Math.PI*Math.pow(this.radius,2.0)
    }
    public fun perimeter():Double
    {
        return 2*Math.PI*this.radius
    }
}
