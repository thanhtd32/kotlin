class Square :IFormula {
    var slide:Double = 0.0
    constructor()
    constructor(slide:Double)
    {
        this.slide=slide
    }
    override fun area(): Double {
        return Math.pow(slide, 2.0);
    }
    override fun perimeter(): Double {
        return 2*slide;
    }
}