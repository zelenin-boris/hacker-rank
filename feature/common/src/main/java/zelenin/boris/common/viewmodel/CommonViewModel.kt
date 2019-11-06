package zelenin.boris.common.viewmodel

import android.app.Application
import android.content.Context
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import zelenin.boris.common.model.CardModel

private const val SHARED_PREFERENCES_NAME = "SHARED_PREFERENCES_ID"
private const val CARD_MODELS = "CARD_MODELS_ID"

class CommonViewModel(application: Application) : AndroidViewModel(application) {

    private val sharedPreferences = application.getSharedPreferences(SHARED_PREFERENCES_NAME, Context.MODE_PRIVATE)
    private val gson = Gson()

    private val cards = MutableLiveData<List<CardModel>>()

    init {
        cards.value = gson.fromJson<List<CardModel>>(sharedPreferences.getString(CARD_MODELS, ""),
                object : TypeToken<List<CardModel>>() {}.type) ?: mutableListOf()
    }

    fun putCard(card: CardModel) {
        cards.value = cards.value as MutableList + card
        sharedPreferences.edit().putString(CARD_MODELS, gson.toJson(cards.value)).apply()
    }

    fun getCards(): LiveData<List<CardModel>> = cards
}