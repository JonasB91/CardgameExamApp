package com.example.myexaminationapplication

import kotlin.random.Random

class CardsList {
    var cardList = mutableListOf<Card>()

    init {
        createAndBuildDeck()
    }
          
    fun createAndBuildDeck() {
        val card1 = Card(2, R.drawable.clubsoftwo, "Two of Clubs")
        val card2 = Card(3, R.drawable.clubsofthree, "Three of Clubs")
        val card3 = Card(4, R.drawable.clubsoffour, "Four of Clubs")
        val card4 = Card(5, R.drawable.clubsoffive, "Five of Clubs")
        val card5 = Card(6, R.drawable.clubsofsix, "Six of Clubs")
        val card6 = Card(7, R.drawable.clubsofseven, "Seven of Clubs")
        val card7 = Card(8, R.drawable.clubsofeight, "Eight of Clubs")
        val card8 = Card(9, R.drawable.clubsofnine, "Nine of Clubs")
        val card9 = Card(10, R.drawable.clubsoften, "Ten of Clubs")
        val card10 = Card(11, R.drawable.clubsofjack, "Jack of Clubs")
        val card11 = Card(12, R.drawable.clubsofqueen, "Queen of Clubs")
        val card12 = Card(13, R.drawable.clubsofking, "King of Clubs")
        val card13 = Card(1, R.drawable.clubsoface, "Ace of Clubs")

        // card13 är Ace, vi bör kolla om vi ska ha den som både värde 1 & 13??

        val card14 = Card(2, R.drawable.spadeoftwo, "Two of Spades")
        val card15 = Card(3, R.drawable.spadeofthree, "Three of Spades")
        val card16 = Card(4, R.drawable.spadeoffour, "Four of Spades")
        val card17 = Card(5, R.drawable.spadeoffive, "Five of Spades")
        val card18 = Card(6, R.drawable.spadeofsix, "Six of Spades")
        val card19 = Card(7, R.drawable.spadeofseven, "Seven of Spades")
        val card20 = Card(8, R.drawable.spadeofeight, "Eight of Spades")
        val card21 = Card(9, R.drawable.spadeofnine, "Nine of Spades")
        val card22 = Card(10, R.drawable.spadeoften, "Ten of Spades")
        val card23 = Card(11, R.drawable.spadeofjack, "Jack of Spades")
        val card24 = Card(12, R.drawable.spadeofqueen, "Queen of Spades")
        val card25 = Card(13, R.drawable.spadeofking, "King of Spades")
        val card26 = Card(1, R.drawable.spadeoface, "Ace of Spades")

        val card27 = Card(2, R.drawable.heartoftwo, "Two of Hearts")
        val card28 = Card(3, R.drawable.heartofthree, "Three of Hearts")
        val card29 = Card(4, R.drawable.heartoffour, "Four of Hearts")
        val card30 = Card(5, R.drawable.heartoffive, "Five of Hearts")
        val card31 = Card(6, R.drawable.heartofsix, "Six of Hearts")
        val card32 = Card(7, R.drawable.heartofseven, "Seven of Hearts")
        val card33 = Card(8, R.drawable.heartofeight, "Eight of Hearts")
        val card34 = Card(9, R.drawable.heartofnine, "Nine of Hearts")
        val card35 = Card(10, R.drawable.heartoften, "Ten of Hearts")
        val card36 = Card(11, R.drawable.heartofjack, "Jack of Hearts")
        val card37 = Card(12, R.drawable.heartofqueen, "Queen of Hearts")
        val card38 = Card(13, R.drawable.heartofking, "King of Hearts")
        val card39 = Card(1, R.drawable.heartoface, "Ace of Hearts")

        val card40 = Card(2, R.drawable.diamondoftwo, "Two of Diamonds")
        val card41 = Card(3, R.drawable.diamondofthree, "Three of Diamonds")
        val card42 = Card(4, R.drawable.diamondoffour, "Four of Diamonds")
        val card43 = Card(5, R.drawable.diamondoffive, "Five of Diamonds")
        val card44 = Card(6, R.drawable.diamondofsix, "Six of Diamonds")
        val card45 = Card(7, R.drawable.diamondofseven, "Seven of Diamonds")
        val card46 = Card(8, R.drawable.diamondofeight, "Eight of Diamonds")
        val card47 = Card(9, R.drawable.diamondofnine, "Nine of Diamonds")
        val card48 = Card(10, R.drawable.diamondoften, "Ten of Diamonds")
        val card49 = Card(11, R.drawable.diamondofjack, "Jack of Diamonds")
        val card50 = Card(12, R.drawable.diamondofqueen, "Queen of Diamonds")
        val card51 = Card(13, R.drawable.diamondofking, "King of Diamonds")
        val card52 = Card(1, R.drawable.diamondoface, "Ace of Diamonds")

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

    fun sorting():Card {
        if (cardList.isEmpty()){
             createAndBuildDeck()
        }
        val randomIndex = Random.nextInt(cardList.size);
        val card = cardList.removeAt(randomIndex)

        return card

    }

}
