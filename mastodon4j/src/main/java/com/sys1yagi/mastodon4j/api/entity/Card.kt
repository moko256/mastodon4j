package com.sys1yagi.mastodon4j.api.entity

import com.google.gson.annotations.SerializedName

/**
 * see more https://github.com/tootsuite/documentation/blob/master/Using-the-API/API.md#card
 */
class Card(
    @SerializedName("url") val url: String = "",
    @SerializedName("title") val title: String = "",
    @SerializedName("description") val description: String = "",
    @SerializedName("image") val image: String = "",
    @SerializedName("type") val type: String = Type.Link.value,
    @SerializedName("author_name") val authorName: String = "",
    @SerializedName("author_url") val authorUrl: String = "",
    @SerializedName("provider_name") val providerName: String = "",
    @SerializedName("provider_url") val providerUrl: String = "",
    @SerializedName("html") val html: String = "",
    @SerializedName("width") val width: Int = 0,
    @SerializedName("height") val height: Int = 0
) {
    enum class Type(val value: String) {
        Link("link"),
        Photo("photo"),
        Video("video"),
        Rich("rich")
    }
}
