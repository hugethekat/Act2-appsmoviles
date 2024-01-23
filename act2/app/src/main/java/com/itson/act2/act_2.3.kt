package com.itson.act2

// Hugo Eduardo Navarro Ramírez  -  233470

fun String.esFina(): Boolean {
    val naonao = Regex("(?!.*(?:bu|ba|be)).*")
    if (!naonao.matches(this)) return false

    val tresVocales = Regex("(.*[aeiou]){3,}")
    if (tresVocales.find(this) != null) return true

    val dobleLetra = Regex("(?<=(.))(?!\\1).*")
    return dobleLetra.find(this) != null
}

fun main(args: Array<String>) {
    println("bac".esFina())   // false
    println("aza".esFina())   // true
    println("abaca".esFina()) // false
    println("baaa".esFina())  // true
    println("aaab".esFina())  // true
}
