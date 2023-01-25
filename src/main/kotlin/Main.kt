fun main(args: Array<String>) {

   // ---------- VARIABLES ---------

   val correctAnswer1 = "Madrid"
   val correctAnswer2 = "Ottawa"
   val correctAnswer3 = "Nairobi"
   val correctAnswer4 = "Amsterdam"
   val correctAnswer5 = "Manila"

   var playerScore = 0


   println("Country Capital Quiz\n")


   // ---------- QUESTIONS -----------

   println("----- Question 1 -----")
   println("What is the capital of SPAIN?\n")

   println("Type your answer: ")
   var a1 = readln().toString()

   if (a1.equals(correctAnswer1, ignoreCase = true)) {

      playerScore += 1
      println("Correct!\n")
   }
   else {
      println("Incorrect\n")
   }

   //----------------------------------

   println("----- Question 2 -----")
   println("What is the capital of CANADA?\n")

   println("Type your answer: ")
   var a2 = readln().toString()

   if (a2.equals(correctAnswer2, ignoreCase = true)) {

      playerScore += 1
      println("Correct!\n")
   }
   else {
      println("Incorrect\n")
   }

//----------------------------------

   println("----- Question 3 -----")
   println("What is the capital of KENYA?\n")

   println("Type your answer: ")
   var a3 = readln().toString()

   if (a3.equals(correctAnswer3, ignoreCase = true)) {

      playerScore += 1
      println("Correct!\n")
   }
   else {
      println("Incorrect\n")
   }

//---------------------------------

   println("----- Question 4 -----")
   println("What is the capital of the Netherlands?\n")

   println("Type your answer: ")
   var a4 = readln().toString()

   if (a4.equals(correctAnswer4, ignoreCase = true)) {

      playerScore += 1
      println("Correct!\n")
   }
   else {
      println("Incorrect\n")
   }

//---------------------------------

   println("----- Question 5 -----")
   println("What is the capital of the Philippines?\n")

   println("Type your answer: ")
   var a5 = readln().toString()

   if (a5.equals(correctAnswer5, ignoreCase = true)) {

      playerScore += 1
      println("Correct!\n")
   }
   else {
      println("Incorrect\n")
   }



   println("You finished the Quiz. You answered -- $playerScore out of 5 -- correctly.")
}