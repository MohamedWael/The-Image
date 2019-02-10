package com.blogspot.mowael.mvvmsample.base

import com.blogspot.mowael.mvvmsample.base.utils.Logger

object EndPoint {
    val UNSPLASH = "unsplash.com/"
    val BASE_URL = "https://" + UNSPLASH
    val API_URL = "https://api." + UNSPLASH


    fun createAuthUrl(clientID: String): String {
        val AUTHORIZE = BASE_URL + "oauth/authorize"
        val CLIENT_ID = "client_id"
        val REDIRECT_URI = "redirect_uri"
        val REDIRECT_URI_VALUE = "urn:ietf:wg:oauth:2.0:oob"
        val RESPONSE_TYPE = "response_type"
        val CODE = "code"
        val SCOPE = "scope"
        val SCOPE_VALUE = "public+write_likes+read_photos"
        val QUERY = "?"
        val AND = "&"
        val EQUAL = "="
        val uri = AUTHORIZE + QUERY + CLIENT_ID + EQUAL + clientID + AND +
                REDIRECT_URI + EQUAL + REDIRECT_URI_VALUE + AND + RESPONSE_TYPE + EQUAL + CODE + SCOPE + SCOPE_VALUE
        Logger.e("InstagramAuth", uri)
        return uri
    }
}