package EJ1Clases

import jakarta.persistence.*

@Entity
@Table(name = "usuario")
class Usuario (

    @Id
    @Column(name="email")
    var email:String,

    @Column(name = "nombre")
    var nombre:String,

    @Column(name="password")
    var password:String,

    @Column(name = "activo")
    var activo:Boolean=true,

    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int?=null){
}