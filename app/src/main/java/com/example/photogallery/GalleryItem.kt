package com.example.photogallery

import com.google.gson.annotations.SerializedName

/** Model class for holding data per one item/photo from Flickr */
data class GalleryItem(
    var title: String = "",
    var id: String = "",
    @SerializedName("url_s") var url: String = ""
)