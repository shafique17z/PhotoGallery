package com.example.photogallery.api

import com.example.photogallery.GalleryItem
import com.google.gson.annotations.SerializedName

//CLASS FOR MAPPING TO THE 'PHOTOS' OBJECT IN THE JSON DATA.
class PhotoResponse {
    @SerializedName("photo")
    lateinit var galleryItems: List<GalleryItem>
}