var x1: Double = 0.0
var x2: Double = 0.0

fun equationHandler(a: Double, b: Double, c: Double){
    val inner: Double = (b*b)-(4*a*c)
    if(inner > 0){
        val root: Double = Math.pow(inner,0.5)
        x1 = ((-b+root)/(2*a))
        x2 = ((-b-root)/(2*a))
        println("x1 = "+x1+"\nx2 = "+x2+"\n")
    }
    else
    {
        val beforeConv = (Math.abs(inner).toInt()/(2*a))
        val innerPortion: String =""+ beforeConv.toFloat() + "i"
        val startPortion = ((-b)/(2*a)).toFloat()
        println("x1 = "+startPortion+"+"+innerPortion)
        println("x2 = "+startPortion+"-"+innerPortion)
    }
}

fun main(){
    equationHandler(3.0,6.0,1.0)
    equationHandler(3.0,1.0,1.0)
}