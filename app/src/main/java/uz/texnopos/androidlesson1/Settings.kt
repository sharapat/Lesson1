package uz.texnopos.androidlesson1

import android.content.Context

class Settings(private val context: Context) {
    private val prefs = context.getSharedPreferences("MySharedPreferences", Context.MODE_PRIVATE)
    var name: String
    set(value) {
        prefs.edit().putString("name", value).apply()
    }
    get() {
        return prefs.getString("name", "")!!
    }

    var score: Int
    set(value) = prefs.edit().putInt("score", value).apply()
    get() = prefs.getInt("score", 0)
}