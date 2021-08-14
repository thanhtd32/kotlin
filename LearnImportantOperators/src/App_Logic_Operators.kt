fun main(args: Array<String>) {
    var x: Boolean = true
    var y: Boolean = false
    var z: Boolean = false
    println("x=" + x)//x=true
    println("y=" + y)//y=false
    println("z=" + z)//z=false
    println("x&&y=" + (x && y))//x&&y=false
    println("x.and(y)=" + x.and(y))//x.and(y)=false
    println("x || y =" + (x || y))//x || y =true
    println("x.or(y)=" + x.or(y))//x.or(y)=true
    println("x || z =" + (x || z))//x || z =true
    println("x.or(z)=" + x.or(z))//x.or(z)=true
    println("x && z =" + (x && z))//x && z =false
    println("x.and(z)=" + x.and(z))//x.and(z)=false
    println("y || z =" + (y || z))//y || z =false
    println("y.or(z)=" + y.or(z))//y.or(z)=false
    println("y && z =" + (y && z))//y && z =false
    println("y.and(z)=" + y.and(z))//y.and(z)=false
    println("x && y && z =" + (x && y && z))//x && y && z =false
    println("x.and(y).and(z)=" + x.and(y).and(z))//x.and(y).and(z)=false
    println("x|| y||z =" + (x || y || z))//x|| y||z =true
    println("x.or(y).or(z)=" + x.or(y).or(z))//x.or(y).or(z)=true
}