package cl.cvega.android.evaluacion_u_2.data

import android.util.Log
import cl.cvega.android.evaluacion_u_2.data.modelo.Compra

class CompraMemoryDataSource {
    private val _compras = mutableListOf<Compra>()

    init {
        _compras.addAll(comprasDePrueba())
    }

    fun obtenerTodas():List<Compra> {
        return _compras
    }

    fun insertar(vararg compras: Compra) {
        _compras.addAll( compras.asList())
    }

    fun eliminar(compra: Compra) {
        _compras.remove(compra)
        Log.v("DataSource", _compras.toString())
    }

    private fun comprasDePrueba():List<Compra> = listOf(

    )
}