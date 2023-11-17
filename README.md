RetrofitBaseKit 🚀

  RetrofitBaseKit is your go-to foundation for Android projects. It's designed to jumpstart API integration using Retrofit, providing a streamlined, efficient, and ready-to-use solution to boost your development workflow. 🛠️📲

Features

  Retrofit Integration: Easily integrate Retrofit into your Android project.
  Boilerplate Reduction: Minimize repetitive setup tasks and focus on building features.
  Efficient API Calls: Optimize your API calls for better performance.
  Ready-to-Use Templates: Get started quickly with pre-configured templates.

Getting Started

  To integrate RetrofitBaseKit into your project, follow these simple steps:
  1. Add the RetrofitBaseKit library to your project dependencies.
   
     implementation 'com.example:retrofitbasekit:1.0.0'

  2. Initialize RetrofitBaseKit in your application class.
  
    class MyApp : Application() {
      override fun onCreate() {
          super.onCreate()
          RetrofitBaseKit.init(this)
      }
    }
  
  3. Start using Retrofit in your project with reduced boilerplate code.

    val apiService = RetrofitBaseKit.create(ApiService::class.java)
    // Make API calls using apiService
  
Examples

  // Define your API interface
  interface ApiService {
      @GET("posts/{id}")
      suspend fun getPostById(@Path("id") postId: Int): Post
  }

  // Create Retrofit instance
  val apiService = RetrofitBaseKit.create(ApiService::class.java)

  // Make API calls
  val post = apiService.getPostById(1)

Contributing

  Contributions are welcome! Feel free to open issues, submit pull requests, or suggest new features.
