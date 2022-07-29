package model


import com.google.gson.annotations.SerializedName

data class UIcons(
    @SerializedName("data")
    val `data`: List<Data>
) {
    data class Data(
        @SerializedName("class")
        val classX: String,
        @SerializedName("detailUrl")
        val detailUrl: String,
        @SerializedName("family")
        val family: String,
        @SerializedName("id")
        val id: Int,
        @SerializedName("isBrand")
        val isBrand: Boolean,
        @SerializedName("name")
        val name: String,
        @SerializedName("packId")
        val packId: Int,
        @SerializedName("png")
        val png: String,
        @SerializedName("prefix")
        val prefix: String,
        @SerializedName("style")
        val style: String,
        @SerializedName("styleFamily")
        val styleFamily: String,
        @SerializedName("svg")
        val svg: String,
        @SerializedName("tags")
        val tags: String,
        @SerializedName("teamId")
        val teamId: Int
    )
}