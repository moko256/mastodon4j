package com.sys1yagi.mastodon4j.api.entity

import com.google.gson.annotations.SerializedName

/**
 * see more https://github.com/tootsuite/documentation/blob/master/Using-the-API/API.md#instance
 */
class Instance(
    @SerializedName("uri") val uri: String = "",
    @SerializedName("title") val title: String = "",
    @SerializedName("description") val description: String = "",
    @SerializedName("email") val email: String = "",
    @SerializedName("version") val version: String = "",
    @SerializedName("urls") val urls: InstanceUrls = InstanceUrls(),
    @SerializedName("languages") val languages: List<String> = emptyList(),
    @SerializedName("contact_account") val contactAccount: Account = Account()
) {
    class InstanceUrls(
        @SerializedName("streaming_api") val streamingApi: String = ""
    )
}
