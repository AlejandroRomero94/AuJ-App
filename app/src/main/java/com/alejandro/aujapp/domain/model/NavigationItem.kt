package com.alejandro.aujapp.domain.model

enum class NavigationItem(
    val title: String
) {
    Presentation(
        title = "Quién soy"
    ),
    Recorrido(
        title = "Recorrido"
    ),
    AuJ(
        title = "Por qué AuJ"
    ),
    Contacto(
        title = "Contacto"
    )
}

//Para cada apartado del drawer: Quien soy, mi recorrido, por qué AuJ, contacto