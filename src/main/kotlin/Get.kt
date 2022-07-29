import backend.getData
import com.google.gson.Gson
import model.StorySet
import model.UIcons
import utils.*
import java.io.File


private val gson: Gson = Gson().newBuilder().create()

private var number = 1


object StoreySet {

    fun get(url: String) {

        for (i in 1..276) {

            val storySet = gson.fromJson(getData("${url}?page=$i"), StorySet::class.java).data

            storySet.forEach { data ->
                val folderName = STORYSET + data.style
                when (data.style) {
                    "amico" -> createFolder(folderName)
                    "bro" -> createFolder(folderName)
                    "cuate" -> createFolder(folderName)
                    "pana" -> createFolder(folderName)
                    "rafiki" -> createFolder(folderName)
                }
                save(data.src, File(DESKTOP, folderName + "/" + data.src.toName()))
                println("$number         | ${data.src.toName()}                                                 saved.")
                number += 1
            }
        }
    }
}

object UIcons {

    fun get(url: String) {
        for (i in 1..72) {
            val uIcons = gson.fromJson(getData(url = "${url}$i"), UIcons::class.java).data
            println(uIcons)

            uIcons.forEach { data ->
                if (data.isBrand) {
                    createFolder("${UICONS}brands")
                    save(data.svg, File(DESKTOP, "${UICONS}brands/${data.name}.svg"))
                } else {
                    val folderName = "$UICONS${data.style}/${data.family}"
                    when (data.style) {
                        "bold" -> createFolder(folderName)
                        "regular" -> createFolder(folderName)
                        "solid" -> createFolder(folderName)
                    }
                    save(data.svg, File(DESKTOP, "$folderName/${data.name}.svg"))
                    println("$number \t\t\t\t ${data.name} saved.")
                    number += 1
                }
            }
        }
    }
}