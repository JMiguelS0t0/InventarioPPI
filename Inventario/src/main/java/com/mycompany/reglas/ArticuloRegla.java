package com.mycompany.reglas;

import com.mycompany.dao.ArticuloDAO;
import com.mycompany.modelo.Articulo;
import java.util.ArrayList;

public class ArticuloRegla {

    private ArticuloDAO dao;

    public ArticuloRegla() {
        dao = new ArticuloDAO();
    }

    public ArrayList<Articulo> ListarTodos() {
        return dao.GetAll();
    }

    public boolean insertar(Articulo a) {
        if (a.getNombre().isEmpty() || a.getDescripcion().isEmpty()
                || a.getCategoria().isEmpty() || a.getValor() <= 0 || a.getCantidad() <= 0) {
            return false;
        }
        return dao.InsertarArticulo(a);
    }

    public boolean Eliminar(int id) {
        return dao.EliminarArticulo(id);
    }

    public boolean Actualizar(Articulo a) {
        return dao.actualizar(a);
    }

}
