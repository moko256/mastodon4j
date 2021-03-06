package com.sys1yagi.mastodon4j.api.method

import com.sys1yagi.mastodon4j.MastodonClient
import com.sys1yagi.mastodon4j.MastodonRequest
import com.sys1yagi.mastodon4j.api.Pageable
import com.sys1yagi.mastodon4j.api.Range
import com.sys1yagi.mastodon4j.api.entity.Account

/**
 * See more https://github.com/tootsuite/documentation/blob/master/Using-the-API/API.md#blocks
 */
class Blocks(private val client: MastodonClient) {

    //  GET /api/v1/blocks
    fun getBlocks(range: Range = Range()): MastodonRequest<Pageable<Account>> {
        return MastodonRequest<Pageable<Account>>(
            {
                client.get("blocks", range.toParameter())
            },
            {
                client.getSerializer().fromJson(it, Account::class.java)
            }
        ).toPageable()
    }
}
