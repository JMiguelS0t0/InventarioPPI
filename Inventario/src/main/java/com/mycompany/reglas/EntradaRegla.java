package com.mycompany.reglas;

import com.mycompany.dao.EntradaDAO;
import com.mycompany.modelo.Entrada;

import java.util.ArrayList;

public class EntradaRegla {

    private EntradaDAO dao;

    public EntradaRegla() {
        dao = new EntradaDAO();
    }

    public ArrayList<Entrada> ListarTodos() {
        return dao.GetAll();
    }

    public boolean Insertar(Entrada a) {
        if (a.getFecha() == null || a.getCantidad() < 1 || a.getArticulo().isEmpty()) {
            return false;
        }
        return dao.InsertarEntrada(a);
    }

    public boolean Eliminar(int IdEntrada) {
        return dao.eliminarEntrada(IdEntrada);
    }

    public ArrayList<String> NombresCB() {
        return dao.NombrescbLista();
    }
}
