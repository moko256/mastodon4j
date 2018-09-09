package com.sys1yagi.mastodon4j.api.entity

import com.google.gson.annotations.SerializedName

/**
 * see more https://github.com/tootsuite/documentation/blob/master/Using-the-API/API.md#push-subscription
 */
class PushSubscription(
    @SerializedName("id") val id: Long = 0L,
    @SerializedName("endpoint") val endpoint: String = "",
    @SerializedName("server_key") val serverKey: String = ""
)