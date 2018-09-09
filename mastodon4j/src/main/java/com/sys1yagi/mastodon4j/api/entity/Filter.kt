package com.sys1yagi.mastodon4j.api.entity

import com.google.gson.annotations.SerializedName

/**
 * see more https://github.com/tootsuite/documentation/blob/master/Using-the-API/API.md#filter
 */
class Filter(
    @SerializedName("id") val id: Long = 0L,
    @SerializedName("phrase") val phrase: String = "",
    @SerializedName("context") val context: List<String> = emptyList(),
    @SerializedName("expires_at") val expriresAt: String = "",
    @SerializedName("irreversible") val isIrreversible: Boolean = false,
    @SerializedName("whole_word") val isWholeWorld: Boolean = false
)