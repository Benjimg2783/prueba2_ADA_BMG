package EJ1Clases

import jakarta.persistence.*

@Entity
@Table(name = "sesiones")
class Sesiones (

    @OneToOne(cascade = [CascadeType.ALL])
    @JoinColumn(name = "email")
    var email: Usuario?,

    @Id
    @Column(name = "SessionID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val sesionId:Int?=null,
        ){
}