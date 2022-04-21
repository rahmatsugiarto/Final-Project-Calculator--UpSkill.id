package com.upskill.simplecalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatDelegate

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)

        val editTextAngka1 = findViewById<EditText>(R.id.editTextAngka1)
        val editTextAngka2 = findViewById<EditText>(R.id.editTextAngka2)
        val textViewOperasi = findViewById<TextView>(R.id.textOperasi)
        val buttonTambah = findViewById<Button>(R.id.buttonTambah)
        val buttonKurang = findViewById<Button>(R.id.buttonKurang)
        val buttonHasil = findViewById<Button>(R.id.buttonHasil)
        val textViewHasil = findViewById<TextView>(R.id.textHasil)
        val buttonTeam = findViewById<ImageView>(R.id.buttonAboutTeam)
        val buttonReset = findViewById<Button>(R.id.buttonReset)
       //TODO 1 : Membuat Object Button kali
       //TODO 2 : Membuat Object Button Bagi


        buttonTambah.setOnClickListener {
            textViewOperasi.text = "+"
        }

        buttonKurang.setOnClickListener {
            textViewOperasi.text = "-"
        }

        //TODO 3 : Membuat setOnClickListener Untuk Button kali dan ubah textViewOperasi menjadi kali


        //TODO 4 : Membuat setOnClickListener Untuk Button kali dan ubah textViewOperasi menjadi kali


        buttonHasil.setOnClickListener {
            if (editTextAngka1.text.isBlank() || editTextAngka2.text.isBlank()) {
                //TODO 5 : Membuat Toast pada saat editTextAngka1 atau editTextAngka2 kosong dengan text message "Masukkan Angka terlebih dahulu!!" atau sesuai kemauanmu
            } else {
                var hasil = 0F

                if (textViewOperasi.text == "+") {
                    hasil = editTextAngka1.text.toString().toFloat() + editTextAngka2.text.toString().toFloat()
                } else if (textViewOperasi.text == "-") {
                    hasil = editTextAngka1.text.toString().toFloat() - editTextAngka2.text.toString().toFloat()
                }
                //TODO 6 : Membuat else if untuk operasi kali
                //TODO 7 : Membuat else if untuk operasi Bagi


                textViewHasil.text = hasil.toString()
                //TODO 8 : Membuat Toast untuk hasil
            }
        }

        buttonTeam.setOnClickListener {
            //TODO 9 : Membuat Intent Button Untuk pidah ke TeamActivity
        }

        buttonReset.setOnClickListener {
            //TODO 10: Clear pada editTextAngka1
            //TODO 11: Clear pada editTextAngka2
            //TODO 12: Set text pada textViewHasil menjadi "0"
        }
    }
}