import EJ1Clases.Sesiones
import EJ1Clases.Usuario
import jakarta.persistence.Persistence

class GestorBBDD {
    private val manager= Persistence.createEntityManagerFactory("PersistenciaLibro").createEntityManager()

    fun insertUser(usuario: Usuario):Boolean{
        return try {
            manager.transaction.begin()
            manager.persist(usuario)
            manager.transaction.commit()
            true
        } catch (e: Exception) {
            manager.transaction.rollback()
            false
        }
    }

    fun selectAllSessions():List<Sesiones> = manager.createQuery("from LoginClases.Sesiones")?.resultList as List<Sesiones>
    fun selectSessionByEmail(email:String): Sesiones {
        val query = manager.createQuery("from LoginClases.Sesiones where email = :email", Sesiones::class.java)
        query.setParameter("email", email)
        return query.singleResult
    }
    fun sesionIniciada(email: String):Boolean{
        return try {
            selectSessionByEmail(email)
            true
        }catch (e:Exception){
            false
        }
    }

}