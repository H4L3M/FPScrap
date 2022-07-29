package model


import com.google.gson.annotations.SerializedName

data class StorySet(
    @SerializedName("data")
    val `data`: List<Data>,
//    @SerializedName("links")
//    val links: Links,
//    @SerializedName("meta")
//    val meta: Meta
)

data class Data(
    @SerializedName("freepik_id")
    val freepikId: String,
    @SerializedName("freepik_page")
    val freepikPage: String,
    @SerializedName("id")
    val id: Int,
    @SerializedName("illustration")
    val illustration: Illustration,
    @SerializedName("preview")
    val preview: String,
    @SerializedName("preview_no_bg")
    val previewNoBg: String,
    @SerializedName("published_at")
    val publishedAt: String,
    @SerializedName("slug")
    val slug: String,
    @SerializedName("src")
    val src: String,
    @SerializedName("style")
    val style: String,
    @SerializedName("tags")
    val tags: List<Tag>,
    @SerializedName("total_downloads")
    val totalDownloads: Int,
    @SerializedName("url")
    val url: String
)

data class Illustration(
    @SerializedName("name")
    val name: String,
    @SerializedName("slug")
    val slug: String
)

data class Tag(
    @SerializedName("description")
    val description: String,
    @SerializedName("meta_description")
    val metaDescription: String,
    @SerializedName("meta_title")
    val metaTitle: String,
    @SerializedName("name")
    val name: String,
    @SerializedName("slug")
    val slug: String,
    @SerializedName("title")
    val title: String
)


data class Links(
    @SerializedName("first")
    val first: String,
    @SerializedName("last")
    val last: String,
    @SerializedName("next")
    val next: String,
    @SerializedName("prev")
    val prev: Any
)

data class Meta(
    @SerializedName("current_page")
    val currentPage: Int,
    @SerializedName("from")
    val from: Int,
    @SerializedName("last_page")
    val lastPage: Int,
    @SerializedName("links")
    val links: List<Link>,
    @SerializedName("path")
    val path: String,
    @SerializedName("per_page")
    val perPage: Int,
    @SerializedName("to")
    val to: Int,
    @SerializedName("total")
    val total: Int
)

data class Link(
    @SerializedName("active")
    val active: Boolean,
    @SerializedName("label")
    val label: Int,
    @SerializedName("url")
    val url: String
)
    
