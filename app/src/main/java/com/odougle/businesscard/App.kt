package com.odougle.businesscard

import android.app.Application
import com.odougle.businesscard.data.AppDatabase
import com.odougle.businesscard.data.BusinessCardRepository

class App: Application() {
    val database by lazy { AppDatabase.getDatabase(this) }
    val repository by lazy { BusinessCardRepository(database.businessDao()) }
}