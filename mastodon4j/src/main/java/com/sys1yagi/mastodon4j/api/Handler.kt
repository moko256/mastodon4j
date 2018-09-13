package com.sys1yagi.mastodon4j.api

import com.sys1yagi.mastodon4j.api.entity.Notification
import com.sys1yagi.mastodon4j.api.entity.Status


interface Handler {

    fun onStatus(status: Status) {}

    fun onNotification(notification: Notification) {}

    fun onDelete(id: Long) {}

    fun onFiltersChanged() {}
}