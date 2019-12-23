object Versions {
    val lifecycle = "2.1.0"
}
object Deps {
    val coreKtx = "androidx.core:core-ktx:1.1.0"
    val appCompat = "androidx.appcompat:appcompat:1.1.0"
    val constraintLayout = "androidx.constraintlayout:constraintlayout:2.0.0-beta2"
    val material = "com.google.android.material:material:1.1.0-beta02"
    val lifecycle = "androidx.lifecycle:lifecycle-extensions:${Versions.lifecycle}"
    val lifecycleCompiler = "androidx.lifecycle:lifecycle-compiler:${Versions.lifecycle}"
}

object TestDeps {
    val junit = "junit:junit:4.12"
    val testRunner = "androidx.test:runner:1.2.0"
    val espresso = "androidx.test.espresso:espresso-core:3.2.0"
    val rules = "androidx.test:rules:1.1.0"
    val fragment = "androidx.fragment:fragment-testing:1.1.0"
    val mockitoCore = "org.mockito:mockito-core:2.28.2"
    val testCore = "androidx.test:core:1.2.0"
}

object Modules {
    val navigation = ":navigation"
    val common = ":common"
}