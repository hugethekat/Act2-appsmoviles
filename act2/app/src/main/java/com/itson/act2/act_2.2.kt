package com.itson.act2

// Hugo Eduardo Navarro Ramírez  -  233470

fun String?.esVaciaONula(): Boolean {
    return this.isNullOrEmpty()
}

fun main(args: Array<String>) {
    val s1: String? = null
    val s2: String? = ""
    println(s1.esVaciaONula())
    println(s2.esVaciaONula())

    val s3 = "    "
    println(s3.esVaciaONula())
}