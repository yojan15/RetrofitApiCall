
## dependency 

```kotlin
 implementation "com.squareup.retrofit2:retrofit:2.9.0"
    implementation "com.squareup.retrofit2:converter-scalars:2.9.0"
    implementation 'com.squareup.retrofit2:converter-gson:2.9.0'
    implementation "com.squareup.retrofit2:converter-moshi:2.9.0"
    implementation "com.github.bumptech.glide:glide:4.15.1"
    // ViewModel
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.7.0")
    // LiveData (if needed)
    implementation("androidx.lifecycle:lifecycle-livedata-ktx:2.7.0")
    // Lifecycle (to make ViewModel lifecycle-aware)
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.7.0")
```


## Singleton object for retrofit



```
import com.example.retrofitapicall.api.ApiService
import com.example.retrofitapicall.model.Student
import com.google.gson.Gson
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

object RetrofitClient {
    private const val BASE_URL = "your base url...."

    private val retrofit by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
    val apiService : ApiService by lazy {
        retrofit.create(ApiService::class.java)
    }
}
```

## Calling singleton from fragment or activity

```

 val apiService = RetrofitClient.apiService

        val retrofitData = apiService.getService()
        retrofitData.enqueue(object : Callback<Student> {
            override fun onResponse(call: Call<Student>, response: Response<Student>) {

            }

            override fun onFailure(call: Call<Student>, t: Throwable) {

            }

        })
```
