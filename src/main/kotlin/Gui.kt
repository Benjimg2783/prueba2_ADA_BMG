import EJ1Clases.Usuario

class Gui {
    private val gestor=GestorBBDD()
    private val usuarioPrueba=Usuario("diego.apruebame@gmail.com","Benjamin","123")
    fun init(){
        println(gestor.insertUser(usuarioPrueba))
        println("Bienvenido! Introduczca su email")
        val email= readln()
        if(gestor.sesionIniciada(email)){
            println("Bienvenid@")
        }else{
            println("Email no encontrado en el sistema.")
            println("introduce la contraseña")
            val password = readln()
            println("Introduce tu nombre")
            val nombre= readln()
            val user=Usuario(email, nombre, password)
            if(!gestor.insertUser(user)){
                println("Login denegado")
            }else{
                println("Bienvenido")
            }
        }
    }
}