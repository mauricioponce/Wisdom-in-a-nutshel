package cl.eme.wisdominnutshell

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import cl.eme.wisdominnutshell.data.Quote
import cl.eme.wisdominnutshell.data.StaticDataSource

class WisdomViewModel : ViewModel(){

    private val data: List<Quote> = StaticDataSource().getStaticData()

    private val currentQuote = MutableLiveData<Quote>()

    /**
     * getter para la cita actual
     */
    fun quote(): LiveData<Quote> {
        return currentQuote
    }

    fun getQuote() {
        currentQuote.value = data.shuffled()[0]
    }
}