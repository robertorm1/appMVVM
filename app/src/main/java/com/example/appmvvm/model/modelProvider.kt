package com.example.appmvvm.model

class modelProvider {

    companion object {

        fun random(): modelData {
            val position = (0..10).random()
            return quotes[position]
        }
        private val quotes = listOf(
            modelData(
                quote = "It’s not a bug. It’s an undocumented feature!",
                author = "Anonymous"
            ),
            modelData(
                quote = "“Software Developer” – An organism that turns caffeine into software",
                author = "Anonymous"
            ),
            modelData(
                quote = "If debugging is the process of removing software bugs, then programming must be the process of putting them in",
                author = "Edsger Dijkstra"
            )
        )
    }
}