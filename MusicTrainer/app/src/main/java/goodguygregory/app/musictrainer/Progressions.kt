package goodguygregory.app.musictrainer

import java.util.*

class Progressions {

//Properties:
    val easykeySignatures = arrayOf(
        "C","G","F","D", "Bb"
    )

    val medKeySignatures = arrayOf(
        "C","G","F","D", "Bb","A","Eb","E"
    )

    val hardKeySignatures = arrayOf(
        "C","G","F","D","A","Bb","E","Eb","Cb","Ab","F#/Gb","Db/C#"
    )

    //      easyProgressions
    val easyChords = arrayOf(
        "V - i",
        "i - iv - V - i",
        "V - I",
        "I - I - V -IV",
        "I - IV - V -I",
        "ii - V7 - I - I",
        "vi - V -I - IV",
        "I - vi - IV -V"
    )


    //        mediumProgressions
    val mediumChords = arrayOf(
        "I - iv - V7 - I",
        "I - I - V -V -I6 - IV - V7 - I",
        "I - V - V7 - I I6 - IV - V7 - I",
        "I - III7 - IV - V7",
        "i - VI - iv - vii*",
        "I - V - vi - iii - IV - I - ii6/5 - V7",
        "i - iv - V - i - IV - ii*6 - V - i",
        "I - IV - V - I - vi - ii6 - V - I",
        "I - IV - V - I - vi - ii6 - V - I",
        "i - V - VI - III - iv - i - ii6/5 - V7",
        "i - V - V7 - i - i6 - iv - V7 - i",
        "i - VI - III - vii*",
        "I - IV - V - V7 - I - IV - V7 - I",
        "bVI - bIII - bVIII - IV - I - I - I - I",
        "ii* - V7 - i - i",
        "i - iv - VII - III - VI - ii* - V - i",
        "I - vi - ii - V7"
    )


    //        hardProgressions
    val hardChords = arrayOf(
        "Imaj7 - vm9 - IVmaj7 - bVII13",
        "i - i - V - V - i6 - iv - V7 - i",
        "i - iv - ii* - V7 - VI - ii*6 - V7 - i",
        "I - bIII7 - bVI7 - bII7",
        "III7 - III7 - VI7 - VI7 - II7 - II7 - V7 - V7",
        "i - VII - bVII - i -i - III - vi - v",
        "I - ii7 - I6 - IVadd9 - V/VI - I6 - V7 - Isus4",
        "I - I7 - IV - iv - vi - II7 - ii - V7",
        "I - III7 - IV - VI - ii - VI - ii - V7",
        "I - IV - vii* - iii - vi - ii - V - I",
        "ii - bIII7 - bVI - VII7 - III - V7 - I - I",
        "I - I - [Ger+6] - [Ger+6]",
        "I - IV - ii - V7 - vi - ii6 - V7 - I",
        "I - bii* - ii - biii* - iii - vi - I64 - V7",
        "I - v6 - vii*6/V - V - I6 - ii6 - V7 - I",
        "Vsus7 - V7 - I - vi",
        "ii - ii - I - I - V6 - V6 - bVII - VI",
        "I - I6/3 - IV - #IV* - V - vi - ii6 - V",
        "i - iv- V - V7 - i - iv - V7 - i",
        "I - II - vi - IV - bVI - bVII - V - bVII",
        "I - V6 - IV6 - iii6 - ii6 - I6 - vii*6 - I",
        "V7 - I - III7 - vi",
        "I - IV - V - bvi* - vi - ii - V7 - I")

//Methods:

    // :Generates Random Easy Key:
    fun getEasyKey():String {

    val easyKeyGenerator = Random()

    val randomEasy = easyKeyGenerator.nextInt(easykeySignatures.size)

    val easyKey = easykeySignatures[randomEasy]

    return easyKey
    }

    fun getMedKey():String {

        val medKeyGenerator = Random()

        val randomMed = medKeyGenerator.nextInt(medKeySignatures.size)

        val medKey = medKeySignatures[randomMed]

        return medKey
    }

    fun getHardKey():String {

        val hardKeyGenerator = Random()

        val randomHard = hardKeyGenerator.nextInt(hardKeySignatures.size)

        val hardKey = hardKeySignatures[randomHard]

        return hardKey
    }

    //generates random easy chord progression
    fun getEasyProgression():String {
        val easyProgressionGenerator = Random()

        //            generate random progression
        val randomEasyProg = easyProgressionGenerator.nextInt(easyChords.size)

        val easyProg = easyChords[randomEasyProg]

        return easyProg
    }

    //generates random medium chord progression
    fun getMedProgression():String {
        val medProgressionGenerator = Random()

        //            generate random progression
        val randomMedProg = medProgressionGenerator.nextInt(mediumChords.size)

        val medProg = mediumChords[randomMedProg]

        return medProg
    }

    //generates random hard chord progression
    fun getHardProgression():String {
        val hardProgressionGenerator = Random()

        //            generate random progression
        val randomHardProg = hardProgressionGenerator.nextInt(hardChords.size)

        val hardProg = hardChords[randomHardProg]

        return hardProg
    }

} //class