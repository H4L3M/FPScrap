package utils

fun String.toName() = replaceBeforeLast("/", "").replace("/", "")