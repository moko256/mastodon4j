package com.sys1yagi.mastodon4j.api.entity

import com.google.gson.annotations.SerializedName

/**
 * see more https://github.com/tootsuite/documentation/blob/master/Using-the-API/API.md#reports
 */
class Report(
    @SerializedName("id") val id: Long = 0L,
    @SerializedName("action_taken") val actionTaken: String = ""
)
