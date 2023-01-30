package Ej3Clases

import jakarta.persistence.*

@Entity
@Table(name = "ejemplar")
class Ejemplar (

    @Id
    @Column(name = "codigo_ejemplar")
    var codigo:Int,

    @Column(name = "localizacion")
    var localizacion:String,

    @ManyToOne
    @JoinColumn(name = "codigo_Libro")
    var libro: Libro,
        ){}