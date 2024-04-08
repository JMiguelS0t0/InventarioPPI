package com.mycompany.reglas;

import com.mycompany.dao.SalidaDAO;
import com.mycompany.modelo.Salida;
import java.util.ArrayList;

public class SalidaRegla {

    private SalidaDAO dao;

    public SalidaRegla() {
        dao = new SalidaDAO();
    }

    public ArrayList<Salida> ListarTodos() {
        return dao.GetAll();
    }

    public ArrayList<String> NombresCB() {
        return dao.NombrescbLista();
    }

    public boolean Insertar(Salida s) {
        if (s.getFecha() == null || s.getCantidad() < 1 || s.getArticulo().isEmpty() || s.getTelefonoC().length() <= 10) {
            return false;
        }
        return dao.insertarSalida(s);
    }

    public boolean Eliminar(int idSalida) {
        return dao.eliminarSalida(idSalida);
    }
}
