package com.example.mrcoconuthead.liveat500px.manager.http;

import com.example.mrcoconuthead.liveat500px.dao.PhotoItemCollectionDao;

import retrofit2.Call;
import retrofit2.http.POST;

/**
 * Created by Mr. Coconut Head on 3/20/2016.
 */
public interface ApiService {

@POST("list")
Call<PhotoItemCollectionDao> loadPhotoList();



}
