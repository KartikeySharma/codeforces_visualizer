package com.codeforcesvisualizer

import com.codeforcesvisualizer.model.ContestResponse
import com.crashlytics.android.BuildConfig
import com.crashlytics.android.Crashlytics
import com.crashlytics.android.answers.Answers
import io.fabric.sdk.android.Fabric


class Application : android.app.Application() {

    companion object {
        var contestResponse: ContestResponse? = null
        lateinit var mInstance: Application
    }

    override fun onCreate() {
        super.onCreate()
        mInstance = this

        if (!BuildConfig.DEBUG) {
            Fabric.with(this, Answers(), Crashlytics())
        }
    }
}