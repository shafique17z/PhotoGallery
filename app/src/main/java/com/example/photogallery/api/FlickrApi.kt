package com.example.photogallery.api

import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query
import retrofit2.http.Url

interface FlickrApi {

    @GET("services/rest?method=flickr.interestingness.getList")
    fun fetchPhotos(): Call<FlickrResponse>
    /** Updated the return type from String to FlickrResponse specified in the Call parameter indicates to
    Gson that it should use the FlickrResponse to deserialize the JSON response data */


    @GET
    fun fetchUrlBytes(@Url url: String): Call<ResponseBody>


    @GET("services/rest?method=flickr.photos.search")
    fun searchPhotos(@Query("text") query: String): Call<FlickrResponse>
}