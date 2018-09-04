package com.sys1yagi.mastodon4j.api.entity

import com.google.gson.annotations.SerializedName

/**
 * see more https://github.com/tootsuite/documentation/blob/master/Using-the-API/API.md#notification
 */
class Notification(
    @SerializedName("id") val id: Long = 0L,
    @SerializedName("type") val type: String = Type.Mention.value,
    @SerializedName("created_at") val createdAt: String = "",
    @SerializedName("account") val account: Account = Account(),
    @SerializedName("status") val status: Status? = null
) {
    enum class Type(val value: String) {
        Mention("mention"),
        Reblog("reblog"),
        Favourite("favourite"),
        Follow("follow")
    }
}
