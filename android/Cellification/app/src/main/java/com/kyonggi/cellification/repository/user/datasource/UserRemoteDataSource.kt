package com.kyonggi.cellification.repository.user.datasource

import com.kyonggi.cellification.data.model.user.ResponseUser
import com.kyonggi.cellification.data.model.user.User
import com.kyonggi.cellification.data.model.user.UserLogin
import okhttp3.MultipartBody
import retrofit2.Response

interface UserRemoteDataSource {
    suspend fun signInUser(user: User): Response<ResponseUser>
    suspend fun logInUser(login: UserLogin): Response<Void>
    suspend fun withdrawalUser(token: String,userId: String): Response<Void>
    suspend fun sendCellImage(token:String, image: MultipartBody.Part): Response<String>
    suspend fun getInfo(token: String, userId: String): Response<ResponseUser>
}