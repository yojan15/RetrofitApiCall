
## dependency 

```kotlin
 implementation "com.squareup.retrofit2:retrofit:2.9.0"
    implementation "com.squareup.retrofit2:converter-scalars:2.9.0"
    implementation 'com.squareup.retrofit2:converter-gson:2.9.0'
    implementation "com.squareup.retrofit2:converter-moshi:2.9.0"
    implementation "com.github.bumptech.glide:glide:4.15.1"
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

