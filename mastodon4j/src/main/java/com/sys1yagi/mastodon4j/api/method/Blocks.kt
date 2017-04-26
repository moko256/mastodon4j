package com.sys1yagi.mastodon4j.api.method

import com.sys1yagi.mastodon4j.MastodonClient
import com.sys1yagi.mastodon4j.api.Pageable
import com.sys1yagi.mastodon4j.api.Range
import com.sys1yagi.mastodon4j.api.entity.Account
import com.sys1yagi.mastodon4j.api.exception.Mastodon4jRequestException
import com.sys1yagi.mastodon4j.api.method.contract.BlocksContract
import com.sys1yagi.mastodon4j.extension.genericType
import com.sys1yagi.mastodon4j.extension.toPageable

/**
 * See more https://github.com/tootsuite/documentation/blob/master/Using-the-API/API.md#blocks
 */
class Blocks(val client: MastodonClient) : BlocksContract.Public, BlocksContract.AuthRequired {

    //  GET /api/v1/blocks
    @Throws(Mastodon4jRequestException::class)
    override fun getBlocks(range: Range): Pageable<Account> {
        val response = client.get("blocks", range.toParameter())
        if (response.isSuccessful) {
            val body = response.body().string()
            return client.getSerializer().fromJson<List<Account>>(
                    body,
                    genericType<List<Account>>()
            ).toPageable(response)
        } else {
            throw Mastodon4jRequestException(response)
        }
    }
}
