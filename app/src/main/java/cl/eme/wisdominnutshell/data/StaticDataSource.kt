package cl.eme.wisdominnutshell.data

// https://twitter.com/CodeWisdom
class StaticDataSource {


    fun getStaticData(): List<Quote> {
        val quotes = mutableListOf<Quote>()

        quotes.add(Quote("Jaana Dogan", "In tech, we talk a lot about what tools we should use without any emphasis on what we should never try to use.", "en"))
        quotes.add(Quote("Filipe Fortes", "Debugging is like being the detective in a crime movie where you are also the murderer.", "en"))
        quotes.add(Quote("Christopher Thompson", "Sometimes it pays to stay in bed on Monday, rather than spending the rest of the week debugging Monday's code.", "en"))
        quotes.add(Quote("Kathryn Barrett", "Falling in love with code means falling in love with problem solving and being a part of a forever ongoing conversation.", "en"))
        quotes.add(Quote("Melinda Varian","The best programs are the ones written when the programmer is supposed to be working on something else.", "en"))
        quotes.add(Quote("Anonymous", "It works on my machine.", "en"))
        quotes.add(Quote("Karolina Szczur", "Writing software as if we are the only person that ever has to comprehend it is one of the biggest mistakes and false assumptions that can be made.", "en"))
        quotes.add(Quote("Joyce Wheeler", "Sometimes it's better to leave something alone, to pause, and that's very true of programming.", "en"))
        quotes.add(Quote("Alan Cooper", "The value of a prototype is in the education it gives you, not in the code itself.", "en"))
        quotes.add(Quote("Fred Brooks", "What one programmer can do in one month, two programmers can do in two months.", "en"))
        quotes.add(Quote("Martin Fowler", "Any fool can write code that a computer can understand. Good programmers write code that humans can understand.", "en"))
        quotes.add(Quote("Cory House", "Code is like humor. When you have to explain it, it’s bad.", "en"))
        quotes.add(Quote("Adam Osborne", "The most valuable thing you can make is a mistake - you can't learn anything from being perfect.", "en"))
        quotes.add(Quote("Uncle Bob", "It is not the language that makes programs appear simple. It is the programmer that make the language appear simple!", "en"))
        quotes.add(Quote("Rich Hickey", "Programming is not about typing, it's about thinking.", "en"))
        quotes.add(Quote("Patrick McKenzie", "Every great developer you know got there by solving problems they were unqualified to solve until they actually did it.", "en"))
        quotes.add(Quote("Ryan Singer", "So much complexity in software comes from trying to make one thing do two things.", "en"))
        quotes.add(Quote("Kent Beck", "A plan is an example of what could happen, not a prediction of what will happen.", "en"))
        quotes.add(Quote("Grace Hopper", "To me programming is more than an important practical art. It is also a gigantic undertaking in the foundations of knowledge.", "en"))
        quotes.add(Quote("Damian Conway", "Documentation is a love letter that you write to your future self.", "en"))
        quotes.add(Quote("Morgan Housel", "Being good at something doesn’t promise rewards. It doesn’t even promise a compliment. What’s rewarded in the world is scarcity, so what matters is what you can do that other people are bad at.", "en"))
        quotes.add(Quote("Joel Goldberg", "When you know something it is almost impossible to imagine what it is like not to know that thing. This is the curse of knowledge, and it is the root of countless misunderstandings and inefficiencies.", "en"))

        return quotes
    }
}