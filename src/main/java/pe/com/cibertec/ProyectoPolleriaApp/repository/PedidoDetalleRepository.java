package pe.com.cibertec.ProyectoPolleriaApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.com.cibertec.ProyectoPolleriaApp.model.bd.PedidoDetalle;

public interface PedidoDetalleRepository extends JpaRepository<PedidoDetalle, Integer> {
}
