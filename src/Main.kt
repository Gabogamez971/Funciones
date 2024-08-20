import java.sql.SQLOutput

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main(){
    var rest:Int = 1

    while (rest==1){
        println("""Accón a realizar
            |1. Suma
            |2. Resta
            |3. Multiplicación
            |4. Division
            |5. Raiz
            |6. Cuadrado
            |7. Salir
        """.trimMargin())
        println("Pon el numero para realizar la acción: ")
        var numero: Int = 1
        numero = readln().toInt()
        if (numero==1){
            suma()
            println("""
                Quieres continuar con el menu?
                1. si
                2. No
            """.trimIndent())
            numero = readln().toInt()
            if (numero==1){
                rest=1
            }else{
                rest=2
            }
        }else if (numero==2){
            resta()
            println("""
                Quieres continuar con el menu?
                1. si
                2. No
            """.trimIndent())
            numero = readln().toInt()
            if (numero==1){
                rest=1
            }else{
                rest=2
            }
        }else if (numero==3){
            println(multi(2.8,8.5))
            println("""
                Quieres continuar con el menu?
                1. si
                2. No
            """.trimIndent())
            numero = readln().toInt()
            if (numero==1){
                rest=1
            }else{
                rest=2
            }
        }else if (numero==4){
            divicion(4.9, 4.6)
            println("""
                Quieres continuar con el menu?
                1. si
                2. No
            """.trimIndent())
            numero = readln().toInt()
            if (numero==1){
                rest=1
            }else{
                rest=2
            }
        }else if (numero==5){
            println("La raiz es: ${raiz()}")
            println("""
                Quieres continuar con el menu?
                1. si
                2. No
            """.trimIndent())
            numero = readln().toInt()
            if (numero==1){
                rest=1
            }else{
                rest=2
            }
        }else if (numero==6){
            cuadrado(2.6)
            println("""
                Quieres continuar con el menu?
                1. si
                2. No
            """.trimIndent())
            numero = readln().toInt()
            if (numero==1){
                rest=1
            }else{
                rest=2
            }
        }else if(numero==7){
            println("Vuelve cuado quieras")
            println("""
                Quieres continuar con el menu?
                1. si
                2. No
            """.trimIndent())
            numero = readln().toInt()
            if (numero==1){
                rest=1
            }else{
                rest=2
            }
        }else if(numero>=8){
            println("Ingresa otro numero")
            rest=1

        }
    }








}
var n3: Double = 3.8
var n1: Int = 2
var n2: Int = 6
var n4: Double = 4.8

fun suma(){
    var suma:Int
    suma = n1+n2
    println("la suma es ${suma}")
}
fun resta(){
    var resta:Int
    resta = n1+n2
    println("la resta es ${resta}")
}

// Función de multiplicación con parametros y retorno
fun multi(n1:Double,n2:Double):String{
    return ("La multiplicacion es ${(n1*n2)}")
}
// Función de Raíz sin parametros con retorno
fun raiz():Double{
    return Math.sqrt(n3)
}
// Función de cuadrado
fun cuadrado (n1: Double): Double {
    return Math.pow(n3, 2.0)
}
// Función de cuadrado
fun divicion(n3:Double,n4:Double){
    var div:Double
    div=n3/n4
    println("la divicion es ${div}")
}
