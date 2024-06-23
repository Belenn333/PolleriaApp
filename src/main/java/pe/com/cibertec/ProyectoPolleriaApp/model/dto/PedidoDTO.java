package pe.com.cibertec.ProyectoPolleriaApp.model.dto;


import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class PedidoDTO {
    private int idpedido;
    private int idusuario;
    private LocalDateTime fechaPedido;
    private byte estadoPedido;
    private double total;
    private String nombre;
    private List<PedidoDetalleDTO> detalles;
}

