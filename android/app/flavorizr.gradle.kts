import com.android.build.gradle.AppExtension

val android = project.extensions.getByType(AppExtension::class.java)

android.apply {
    flavorDimensions("flavor-type")

    productFlavors {
        create("prod") {
            dimension = "flavor-type"
            applicationId = "com.lucastssb.accountablefinances"
            resValue(type = "string", name = "app_name", value = "Accountable Finances")
        }
        create("dev") {
            dimension = "flavor-type"
            applicationId = "com.lucastssb.accountablefinances.dev"
            resValue(type = "string", name = "app_name", value = "Accountable Finances")
        }
    }
}