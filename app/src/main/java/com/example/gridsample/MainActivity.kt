package com.example.gridsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var player="p1"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        b1.setOnClickListener {
            buttonClick(b1)
        }
        b2.setOnClickListener {
            buttonClick(b2)
        }
        b3.setOnClickListener {
            buttonClick(b3)
        }
        b4.setOnClickListener {
            buttonClick(b4)
        }
        b5.setOnClickListener {
            buttonClick(b5)
        }
        b6.setOnClickListener {
            buttonClick(b6)
        }
        b7.setOnClickListener {
            buttonClick(b7)
        }
        b8.setOnClickListener {
            buttonClick(b8)
        }
        b9.setOnClickListener {
            buttonClick(b9)
        }
        btnReset.setOnClickListener {
            reset()
        }
    }

    fun buttonClick(btn:Button){
        if (btn.text==""){
            if (player=="p1") {
                player="p2"
                btn.text= "X"
            }else{
                player="p1"
                btn.text ="O"
            }
        }
        win()
    }


    fun win(){
        if (b1.text== "X" && b2.text== "X" && b3.text== "X"){
            toast("X won the Game")
        }
        if (b1.text== "O" && b2.text== "O" && b3.text== "O"){
            toast("O won the Game")
        }
        if (b4.text== "X" && b5.text== "X" && b6.text== "X"){
            toast("X won the Game")
        }
        if (b4.text== "O" && b5.text== "O" && b6.text== "O"){
            toast("O won the Game")
        }
        if (b7.text== "X" && b8.text== "X" && b9.text== "X"){
            toast("X won the Game")
        }
        if (b7.text== "O" && b8.text== "O" && b9.text== "O"){
            toast("O won the Game")
        }
        if (b1.text=="X" && b5.text=="X" && b9.text=="X") {
            toast("X won the Game")
        }
        if (b1.text=="O" && b5.text=="O" && b9.text=="O") {
            toast("X won the Game")
        }
        if (b3.text=="X" && b5.text=="X" && b7.text=="X") {
            toast("X won the Game")
        }
        if (b3.text=="O" && b5.text=="O" && b7.text=="O") {
            toast("O won the Game")
        }
        if (b1.text=="X" && b4.text=="X" && b7.text=="X") {
            toast("X won the Game")
        }
        if (b1.text=="O" && b4.text=="O" && b7.text=="O") {
            toast("O won the Game")
        }
        if (b2.text=="X" && b5.text=="X" && b8.text=="X") {
            toast("X won the Game")
        }
        if (b2.text=="O" && b5.text=="O" && b8.text=="O") {
            toast("O won the Game")
        }
        if (b3.text=="X" && b6.text=="X" && b9.text=="X") {
            toast("X won the Game")
        }
        if (b3.text=="O" && b6.text=="O" && b9.text=="O") {
            toast("O won the Game")
        }

    }
     fun toast(msg:String){
         Toast.makeText(this@MainActivity,msg,Toast.LENGTH_SHORT).show()
     }

    fun reset(){
        b1.text=""
        b2.text=""
        b3.text=""
        b4.text=""
        b5.text=""
        b6.text=""
        b7.text=""
        b8.text=""
        b9.text=""

    }

}