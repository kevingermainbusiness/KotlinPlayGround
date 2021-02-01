package delegation

/**
 * @author Kevin Germain
 * */
interface MusicType {
    fun genre(): String
}

interface SoundBehavior : MusicType {
    fun makeSound()
}

class CompassRhythmBehavior(private val noise: String, private val genre: String? = null) :
        SoundBehavior {
    override fun makeSound() = println("$noise !!")

    override fun genre(): String = genre.toString()
}

/** Lazy initialization of the [DaanJunior] class below
 * You can omit the [genre] parameter if you don't want to pass it
 */
class DaanJunior(catchPhrase: String, genre: String?) :
        SoundBehavior by CompassRhythmBehavior(catchPhrase, genre)

fun main() {
    val daanJunior = DaanJunior("Choco choco lala", "Compas")
    daanJunior.apply {
        makeSound().also {
            println(this.genre())
        }
    }
}