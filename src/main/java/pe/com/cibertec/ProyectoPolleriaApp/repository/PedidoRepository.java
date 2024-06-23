package pe.com.cibertec.ProyectoPolleriaApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.com.cibertec.ProyectoPolleriaApp.model.bd.Pedido;
import pe.com.cibertec.ProyectoPolleriaApp.model.dto.PedidoDTO;

import java.util.List;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Integer> {

    @Query("SELECT u.nombre FROM Pedido p JOIN Usuario u ON p.idusuario = u.idusuario WHERE u.nombre LIKE %?1%")
    public List<PedidoDTO> findAll(String nombre);
}
