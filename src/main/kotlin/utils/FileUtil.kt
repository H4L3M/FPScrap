package utils

import java.io.File
import java.io.FileOutputStream
import java.io.IOException
import java.net.URL
import java.nio.channels.Channels
import java.nio.file.Files
import java.nio.file.Path

const val DESKTOP = "/home/halem/Desktop/freepik/"
const val STORYSET = "storyset/"
const val UICONS = "flaticon/uicons/"

fun save(url: String, outputFileName: File) {
    if (!outputFileName.exists()) {
        URL(url).openStream().use {
            Channels.newChannel(it).use { rbc ->
                FileOutputStream(outputFileName).use { fos ->
                    fos.channel.transferFrom(rbc, 0, Long.MAX_VALUE)
                }
            }
        }
    } else run {
        println("icon already exists...\t $outputFileName")
    }
}

fun File.sizeKB(): Long = this.length() / 1024
fun File.sizeMB(): Long = this.length() / 1024 * 1024

fun Path.size(): String {
    return try {
        val size = Files.size(this).toString()
        StringBuilder(size).insert(1, ".").toString()
    } catch (e: IOException) {
        println("${e.message}")
        ""
    }
}


fun createFolder(child: String) {
    val dir = File(DESKTOP, child)
    if (!dir.exists())
        dir.mkdirs()
}