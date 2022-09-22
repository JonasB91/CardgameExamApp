package com.example.myexaminationapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import kotlin.random.Random

class Card( var value: Int,
             var image: Int,
             var suite: String){


}

class MainActivity : AppCompatActivity() {
    lateinit var textView: TextView
    lateinit var imageView: ImageView
    lateinit var scoreView: TextView
    var cardList = mutableListOf<Card>()
    var score: Int = 0
    var firstCard: Card = Card(1,R.drawable.clubsoface,"Clubs")
    var secondCard: Card =Card(1,R.drawable.clubsoface,"Clubs")
    var scoreString: String =""


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        scoreView =findViewById(R.id.textViewScore)
        textView = findViewById(R.id.questionView)
        imageView = findViewById(R.id.mainImage)

        val buttonHigh = findViewById<Button>(R.id.buttonPressHigh)
        buttonHigh.setOnClickListener {
            setNewrandomCard()
            checkAnswerHigh()

        }
        val buttonLow = findViewById<Button>(R.id.buttonPressLow)
        buttonLow.setOnClickListener {
            setNewrandomCard()
            checkAnswerLow()


        }


            cardsLibrary()
            setNewrandomCard()
            imageView.setImageResource(R.drawable.cardfrontside)


    }

    


    fun cardsLibrary(){
        val card1 = Card(2,R.drawable.clubsoftwo,"Clubs of Two")
        val card2 = Card(3,R.drawable.clubsofthree,"Clubs of Three")
        val card3 = Card(4,R.drawable.clubsoffour,"Clubs of Four")
        val card4 = Card(5,R.drawable.clubsoffive,"Clubs of Five")
        val card5 = Card(6,R.drawable.clubsofsix,"Clubs of Six")
        val card6 = Card(7,R.drawable.clubsofseven,"Clubs of Seven")
        val card7 = Card(8,R.drawable.clubsofeight,"Clubs of Eight")
        val card8 = Card(9,R.drawable.clubsofnine,"Clubs of Nine")
        val card9 = Card(10,R.drawable.clubsoften,"Clubs of Ten")
        val card10 = Card(11,R.drawable.clubsofjack,"Clubs of Jack")
        val card11 = Card(12,R.drawable.clubsofqueen,"Clubs of Queen")
        val card12 = Card(13,R.drawable.clubsofking,"Clubs of King")
        val card13 = Card(1,R.drawable.clubsoface,"Clubs of Ace")

        // card13 är Ace, vi bör kolla om vi ska ha den som både värde 1 & 13??

        val card14 = Card(2,R.drawable.spadeoftwo,"Spade of Two")
        val card15 = Card(3,R.drawable.spadeofthree,"Spade of Three")
        val card16 = Card(4,R.drawable.spadeoffour,"Spade of Four")
        val card17 = Card(5,R.drawable.spadeoffive,"Spade of Five")
        val card18 = Card(6,R.drawable.spadeofsix,"Spade of Six")
        val card19 = Card(7,R.drawable.spadeofseven,"Spade of Seven")
        val card20 = Card(8,R.drawable.spadeofeight,"Spade of Eight")
        val card21 = Card(9,R.drawable.spadeofnine,"Spade of Nine")
        val card22 = Card(10,R.drawable.spadeoften,"Spade of Ten")
        val card23 = Card(11,R.drawable.spadeofjack,"Spade of Jack")
        val card24 = Card(12,R.drawable.spadeofqueen,"Spade of Queen")
        val card25 = Card(13,R.drawable.spadeofking,"Spade of King")
        val card26 = Card(1,R.drawable.spadeoface,"Spade of Ace")

        val card27 = Card(2,R.drawable.heartoftwo,"Heart of Two")
        val card28 = Card(3,R.drawable.heartofthree,"Heart of Three")
        val card29 = Card(4,R.drawable.heartoffour,"Heart of Four")
        val card30 = Card(5,R.drawable.heartoffive,"Heart of Five")
        val card31 = Card(6,R.drawable.heartofsix,"Heart of Six")
        val card32 = Card(7,R.drawable.heartofseven,"Heart of Seven")
        val card33 = Card(8,R.drawable.heartofeight,"Heart of Eight")
        val card34 = Card(9,R.drawable.heartofnine,"Heart of Nine")
        val card35 = Card(10,R.drawable.heartoften,"Heart of Ten")
        val card36 = Card(11,R.drawable.heartofjack,"Heart of Jack")
        val card37 = Card(12,R.drawable.heartofqueen,"Heart of Queen")
        val card38 = Card(13,R.drawable.heartofking,"Heart of King")
        val card39 = Card(1,R.drawable.heartoface,"Heart of Ace")

        val card40 = Card(2,R.drawable.diamondoftwo,"Diamond of Two")
        val card41 = Card(3,R.drawable.diamondofthree,"Diamond of Three")
        val card42 = Card(4,R.drawable.diamondoffour,"Diamond of Four")
        val card43 = Card(5,R.drawable.diamondoffive,"Diamond of Five")
        val card44 = Card(6,R.drawable.diamondofsix,"Diamond of Six")
        val card45 = Card(7,R.drawable.diamondofseven,"Diamond of Seven")
        val card46 = Card(8,R.drawable.diamondofeight,"Diamond of Eight")
        val card47 = Card(9,R.drawable.diamondofnine,"Diamond of Nine")
        val card48 = Card(10,R.drawable.diamondoften,"Diamond of Ten")
        val card49 = Card(11,R.drawable.diamondofjack,"Diamond of Jack")
        val card50 = Card(12,R.drawable.diamondofqueen,"Diamond of Queen")
        val card51 = Card(13,R.drawable.diamondofking,"Diamond of King")
        val card52 = Card(1,R.drawable.diamondoface,"Diamond of Ace")

        cardList.add(card1)
        cardList.add(card2)
        cardList.add(card3)
        cardList.add(card4)
        cardList.add(card5)
        cardList.add(card6)
        cardList.add(card7)
        cardList.add(card8)
        cardList.add(card9)
        cardList.add(card10)
        cardList.add(card11)
        cardList.add(card12)
        cardList.add(card13)
        //cardList ovan är för Clubs korten.

        cardList.add(card14)
        cardList.add(card15)
        cardList.add(card16)
        cardList.add(card17)
        cardList.add(card18)
        cardList.add(card19)
        cardList.add(card20)
        cardList.add(card21)
        cardList.add(card22)
        cardList.add(card23)
        cardList.add(card24)
        cardList.add(card25)
        cardList.add(card26)
        //cardList ovan för spade

        cardList.add(card27)
        cardList.add(card28)
        cardList.add(card29)
        cardList.add(card30)
        cardList.add(card31)
        cardList.add(card32)
        cardList.add(card33)
        cardList.add(card34)
        cardList.add(card35)
        cardList.add(card36)
        cardList.add(card37)
        cardList.add(card38)
        cardList.add(card39)
        //cardList ovan för heart

        cardList.add(card40)
        cardList.add(card41)
        cardList.add(card42)
        cardList.add(card43)
        cardList.add(card44)
        cardList.add(card45)
        cardList.add(card46)
        cardList.add(card47)
        cardList.add(card48)
        cardList.add(card49)
        cardList.add(card50)
        cardList.add(card51)
        cardList.add(card52)
        //cardList ovan för diamond

    }


    fun checkAnswerHigh() {

        setNewrandomCard()


        if (firstCard.value > secondCard.value) {
            score++


        } else if (firstCard.value < secondCard.value){
            score --


        }
        scoreString = score.toString()
        scoreView.text = scoreString

        if (score == 3) {
            val scoreResult = scoreString
            val intent = Intent(this, ActivityWinPage::class.java)
            intent.putExtra("scoreResult", scoreResult)
            startActivity(intent)

        } else if (score == -3) {
            val scoreResults = scoreString
            val intent = Intent(this, ActivityLose::class.java)
            intent.putExtra("scoreResults", scoreResults)
            startActivity(intent)
        }

    }


    fun checkAnswerLow()  {

        setNewrandomCard()

        if (firstCard.value < secondCard.value) {
            score++


        }
        else if (firstCard.value > secondCard.value){
            score --
        }
        scoreString = score.toString()
        scoreView.text = scoreString


        if (score == 3) {
            val scoreResult = scoreString
            val intent = Intent(this, ActivityWinPage::class.java)
            intent.putExtra("scoreResult", scoreResult)
            startActivity(intent)

        } else if (score == -3) {
            val scoreResults = scoreString
            val intent = Intent(this, ActivityLose::class.java)
            intent.putExtra("scoreResults", scoreResults)
            startActivity(intent)

        }

    }


    fun setNewrandomCard() {

        secondCard = firstCard
        val randomIndex = Random.nextInt(cardList.size);

         firstCard = cardList[randomIndex]


        imageView.setImageResource(firstCard.image)




    }


}

// Hej oskar jag har skapat en ny gren