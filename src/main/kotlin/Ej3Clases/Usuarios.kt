package Ej3Clases

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
@Table(name = "Usuarios")
class Usuarios (

    @Id
    @Column(name = "codigo_usuario")
    var codigo:Int,

    @Column(name = "nombre")
    var nombre:String,

    @Column(name = "telefono")
    var telefono:String,

    @Column(name = "direccion")
    var direccion:String
        ){
}