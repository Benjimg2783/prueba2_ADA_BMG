package Ej3Clases

import jakarta.persistence.*

@Entity
@Table(name = "autor")
class Libro (
    @Id
    @Column(name = "codigo_libro")
    var codigo:Int,

    @Column(name = "titulo")
    var titulo:String,

    @Column(name = "ISBN")
    var isbn:String,

    @Column(name = "editorial")
    var editorial:String,

    @Column(name = "paginas")
    var paginas:Short,

    @ManyToMany(mappedBy = "libros")
    var autores: MutableSet<Autor>? = null,
        ){
}