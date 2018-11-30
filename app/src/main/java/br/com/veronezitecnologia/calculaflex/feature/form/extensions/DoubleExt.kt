package br.com.veronezitecnologia.calculaflex.extensions

fun Double.format(digits: Int) =
    java.lang.String.format("%.${digits}f", this)