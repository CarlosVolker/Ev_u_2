package cl.cvega.android.evaluacion_u_2.ui.state

import cl.cvega.android.evaluacion_u_2.data.modelo.Compra

data class ComprasUIState (
    val mensaje:String = "",
    val compras:List<Compra> = listOf<Compra>()
)