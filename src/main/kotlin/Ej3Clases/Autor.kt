package Ej3Clases

import jakarta.persistence.*

@Entity
@Table(name = "autor")
class Autor (
    @Id
    @Column(name = "codigo_autor")
    var codigo:String,

    @Column(name="nombre")
    var nombre:String,

    @ManyToMany
    @JoinTable(
        name = "autor_libro",
        joinColumns = [JoinColumn(name = "codigo_autor")],
        inverseJoinColumns = [JoinColumn(name = "codigo_libro")]
    )
    var libros: MutableSet<Libro>? = null,
    ){
}