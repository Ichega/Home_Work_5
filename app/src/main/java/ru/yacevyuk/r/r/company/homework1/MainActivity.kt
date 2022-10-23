package ru.yacevyuk.r.r.company.homework1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

var LOG_TAG = "TextLog"
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()
        Log.d(LOG_TAG,"У лукоморья дуб зелёный;\n" +
                "Златая цепь на дубе том:\n" +
                "И днём и ночью кот учёный")
    }

    override fun onPause() {
        super.onPause()
        Log.d(LOG_TAG,"Там чудеса: там леший бродит,\n" +
                "Русалка на ветвях сидит;\n" +
                "Там на неведомых дорожках")
    }

    override fun onResume() {
        super.onResume()
        Log.d(LOG_TAG,"Всё ходит по цепи кругом;\n" +
                "Идёт направо — песнь заводит,\n" +
                "Налево — сказку говорит.")
    }


    override fun onStop() {
        super.onStop()
        Log.d(LOG_TAG, "Следы невиданных зверей;\n" +
                "Избушка там на курьих ножках\n" +
                "Стоит без окон, без дверей;")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(LOG_TAG,"Там лес и дол видений полны;\n" +
                "Там о заре прихлынут волны\n" +
                "На брег песчаный и пустой,")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.d(LOG_TAG,"И тридцать витязей прекрасных\n" +
                "Чредой из вод выходят ясных,\n" +
                "И с ними дядька их морской;")
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        Log.d(LOG_TAG,"Там королевич мимоходом\n" +
                "Пленяет грозного царя;\n" +
                "Там в облаках перед народом")
    }
}