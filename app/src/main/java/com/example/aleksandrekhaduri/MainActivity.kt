package com.example.aleksandrekhaduri

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var name: EditText
    private lateinit var surname: EditText
    private lateinit var phonenumber: EditText
    private lateinit var idnumber: EditText
    private lateinit var jigglybutton: Button





    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        name = findViewById(R.id.pername)
        surname = findViewById(R.id.persurname)
        phonenumber = findViewById(R.id.perphone)
        idnumber = findViewById(R.id.perinumber)
        jigglybutton = findViewById(R.id.clicker)

        jigglybutton.setOnClickListener {

            val firstname = name.text.toString().trim()
            val lastname = surname.text.toString().trim()
            val number = phonenumber.text.toString().trim()
            val identitynumber = idnumber.text.toString().trim()


            if (firstname.isEmpty()) {
                name.error = "გთხოვთ შეიყვანოთ სახელი"
                return@setOnClickListener
            }else if (firstname.length < 3) {
                name.error = "სახელის ზომა მცირეა"
            }else if (lastname.isEmpty()) {
                surname.error = "გთხოვთ შეიყვანოთ გვარი"
                return@setOnClickListener
            }else if (lastname.length < 5) {
                surname.error = "გვარის ზომა მცირეა"
            }else if (number.isEmpty()) {
                phonenumber.error = "გთხოვთ შეიყვანოთ ტელეფონის ნომერი"
                return@setOnClickListener
            }else if (number.length != 9) {
                phonenumber.error = "ტელეფონის ნომერი უნდა იყოს 9 ნიშნა"
            }else if (identitynumber.isEmpty()){
                idnumber.error = "გთხოვთ შეიყვანოთ პირადი ნომერი"
                return@setOnClickListener
            }else if (identitynumber.length != 11){
                idnumber.error = "პირადი ნომერი უნდა იყოს 11 ნიშნა"
                return@setOnClickListener
            }else {
                Toast.makeText(this, "გილოცავთ!", Toast.LENGTH_SHORT).show()
            }




        }


    }
}