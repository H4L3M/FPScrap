package backend

import okhttp3.OkHttpClient
import okhttp3.Request
import java.io.IOException


const val UICON_BASE_URL = "https://www.flaticon.com/ajax/uicons/search/"

const val STORY_SET_BASE_URL = "https://stories.freepiklabs.com/api/vectors"

//3916
//3917
private val client = OkHttpClient()

fun getData(url: String): String {

    val request = Request.Builder()
        .url(url = url)
        .build()

    client.newCall(request).execute().use { response ->
        if (!response.isSuccessful) throw IOException("Unexpected code $response")

        return response.body!!.string()
    }
}
