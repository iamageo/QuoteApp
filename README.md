<p align="center">  
🔥 Simple quote app using Clean Architecture, MVVM, Retrofit, Coroutines and Dagger Hilt 💉
</p>
</br>

<img src="https://user-images.githubusercontent.com/26925002/149682820-ebcd4f80-404f-48c0-a13b-a8e80276a756.png" align="right" width="32%"/>

## Tech stack & Open-source libraries
- Minimum SDK level 19
- [Kotlin](https://kotlinlang.org/) based, [Coroutines](https://github.com/Kotlin/kotlinx.coroutines)
- Jetpack
  - Lifecycle - dispose of observing data when lifecycle state changes.
  - ViewModel - UI related data holder, lifecycle aware.
- Architecture
  - [Clean Architecture](https://developer.android.com/jetpack/guide) 
  - MVVM Architecture (View - DataBinding - ViewModel - Model)
  - Repository pattern
- [Retrofit2 & OkHttp3](https://github.com/square/retrofit) - construct the REST APIs.
- [Material-Components](https://github.com/material-components/material-components-android) - Material design components for building ripple animation, and CardView.
- [Dagger Hilt](https://dagger.dev/hilt/) - for Dependency Injection

### 📚 use case
- [x] when clicking on the screen a random quote is show


## MAD Score
![summary](https://user-images.githubusercontent.com/24237865/102366914-84f6b000-3ffc-11eb-8d49-b20694239782.png)
![kotlin](https://user-images.githubusercontent.com/24237865/102366932-8a53fa80-3ffc-11eb-8131-fd6745a6f079.png)

## Architecture
Quote is based on the MVVM architecture and the Repository pattern.

![architecture](https://user-images.githubusercontent.com/24237865/77502018-f7d36000-6e9c-11ea-92b0-1097240c8689.png)

## Quote API

Thanks Luke Peavey for awesome library of quotes. [Quotable](https://github.com/lukePeavey/quotable)
