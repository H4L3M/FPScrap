package model


import com.google.gson.annotations.SerializedName

data class UIcons(
    @SerializedName("data")
    val `data`: List<Data>,
//    @SerializedName("meta")
//    val meta: Meta,
//    @SerializedName("success")
//    val success: Boolean
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

    data class Meta(
        @SerializedName("baseAjaxUrl")
        val baseAjaxUrl: String,
        @SerializedName("baseUrl")
        val baseUrl: String,
        @SerializedName("currentPage")
        val currentPage: Int,
        @SerializedName("firstAjaxUrl")
        val firstAjaxUrl: String,
        @SerializedName("firstPage")
        val firstPage: Int,
        @SerializedName("firstUrl")
        val firstUrl: String,
        @SerializedName("nextAjaxUrl")
        val nextAjaxUrl: String,
        @SerializedName("nextPage")
        val nextPage: Int,
        @SerializedName("nextText")
        val nextText: String,
        @SerializedName("nextUrl")
        val nextUrl: String,
        @SerializedName("totalPages")
        val totalPages: Int
    )
}