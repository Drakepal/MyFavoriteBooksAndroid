package com.example.myfavoritebooksandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.example.myfavoritebooksandroid.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        populateBooks()

        val mainActivity = this
        binding.recyclerView.apply {
            layoutManager = GridLayoutManager(applicationContext, 3)
            adapter = CardAdapter(booklist)
        }
    }

    private fun populateBooks() {
        val book1 = Books(
            R.drawable.lightning,
            "Rick Riordan",
            "The Lightning Thief",
            "Twelve-year-old Percy Jackson is on the most dangerous quest of his life. With the help of a satyr and a daughter of Athena, Percy must journey across the United States to catch a thief who has stolen the original weapon of mass destruction — Zeus’ master bolt. Along the way, he must face a host of mythological enemies determined to stop him. Most of all, he must come to terms with a father he has never known, and an Oracle that has warned him of betrayal by a friend."
            )
        booklist.add(book1)

        val book2 = Books(
            R.drawable.sea,
            "Rick Riordan",
            "The Sea of Monsters",
            "When Thalia’s tree is mysteriously poisoned, the magical borders of Camp Half-Blood begin to fail. Now Percy and his friends have just days to find the only magic item powerful to save the camp before it is overrun by monsters. The catch: they must sail into the Sea of Monsters to find it. Along the way, Percy must stage a daring rescue operation to save his old friend Grover, and he learns a terrible secret about his own family, which makes him question whether being the son of Poseidon is an honor or a curse"
        )
        booklist.add(book2)

        val book3 = Books(
            R.drawable.titans,
            "Rick Riordan",
            "The Titan's Curse",
            "When Percy Jackson gets an urgent distress call from his friend Grover, he immediately prepares for battle. He knows he will need his powerful demigod allies at his side, his trusty bronze sword Riptide, and… a ride from his mom.\n" +
        "\n" +
        "The demigods rush to the rescue to find that Grover has made an important discovery: two powerful half-bloods whose parentage is unknown. But that’s not all that awaits them. The titan lord Kronos has devised his most treacherous plot yet, and the young heroes have just fallen prey.\n" +
        "\n" +
        "They’re not the only ones in danger. An ancient monster has arisen — one rumored to be so powerful it could destroy Olympus — and Artemis, the only goddess who might know how to track it, is missing. Now Percy and his friends, along with the Hunters of Artemis, have only a week to find the kidnapped goddess and solve the mystery of the monster she was hunting. Along the way, they must face their most dangerous challenge yet: the chilling prophecy of the titan’s curse.\n" +
        "\n"
        )
            booklist.add(book3)

        val book4 = Books(
            R.drawable.labyrinth,
            "Rick Riordan",
            "The Battle of the Labyrinth",
            "Percy Jackson isn’t expecting freshman orientation to be any fun, but when a mysterious mortal acquaintance appears, pursued by demon cheerleaders, things quickly go from bad to worse.\n" +
        "\n" +
        "Time is running out for Percy. War between the gods and the Titans is drawing near. Even Camp Half-Blood isn’t safe, as Kronos’ army prepares to invade its once impenetrable borders. To stop them, Percy and his friends must set out on a quest through the Labyrinth — a sprawling underground world with surprises and danger at every turn.\n" +
        "\n" +
        "Along the way Percy will confront powerful enemies, find out the truth about the lost god Pan, and face the Titan lord Kronos’ most terrible secret. The final war begins… with the Battle of the Labyrinth."
        )
        booklist.add(book4)

        val book5 = Books(
            R.drawable.olympian,
            "Rick Riordan",
            "The Last Olympian",
            "All year the half-bloods have been preparing for battle against the Titans, knowing the odds of victory are grim. Kronos’s army is stronger than ever, and with every god and half-blood he recruits, the evil Titan’s power only grows.\n" +
                    "\n" +
                    "While the Olympians struggle to contain the rampaging monster Typhon, Kronos begins his advance on New York City, where Mount Olympus stands virtually unguarded. Now it’s up to Percy Jackson and an army of young demigods to stop the Lord of Time. In this momentous final book in the New York Times best-selling Percy Jackson and the Olympians series, the long-awaited prophecy surrounding Percy’s sixteenth birthday unfolds. And as the battle for Western civilization rages on the streets of Manhattan, Percy faces a terrifying suspicion that he may be fighting against his own fate."
        )
        booklist.add(book5)

        val book6 = Books(
            R.drawable.neptune,
            "Rick Riordan",
            "The Son of Neptune",
            "In The Lost Hero, three demigods named Jason, Piper, and Leo made their first visit to Camp Half-Blood, where they inherited a blood-chilling quest:\n" +
                    "\n" +
                    "Seven half-bloods shall answer the call,\n" +
                    "To storm or fire the world must fall.\n" +
                    "An oath to keep with a final breath,\n" +
                    "And foes bear arms to the Doors of Death.\n" +
                    "\n" +
                    "Who are the other four mentioned in the prophecy? The answer may lie in another camp miles away, where a new camper has shown up and appears to be the son of Neptune, god of the sea…\n" +
                    "\n" +
                    "With an ever-expanding cast of brave-hearted heroes and formidable foes, this second book in The Heroes of Olympus series offers all of the action, pathos, and humor that Rick Riordan fans crave.\n" +
                    "\n"
        )
        booklist.add(book6)

        val book7 = Books(
            R.drawable.athena,
            "Rick Riordan",
            "The Mark of Athena",
            "Annabeth is terrified. Just when she’s about to be reunited with Percy—after six months of being apart, thanks to Hera—it looks like Camp Jupiter is preparing for war. As Annabeth and her friends Jason, Piper, and Leo fly in on the Argo II, she can’t blame the Roman demigods for thinking the ship is a Greek weapon. With its steaming bronze dragon masthead, Leo’s fantastical creation doesn’t appear friendly. Annabeth hopes that the sight of their praetor Jason on deck will reassure the Romans that the visitors from Camp Half-Blood are coming in peace.\n" +
                    "\n" +
                    "And that’s only one of her worries. In her pocket Annabeth carries a gift from her mother that came with an unnerving demand: Follow the Mark of Athena. Avenge me. Annabeth already feels weighed down by the prophecy that will send seven demigods on a quest to find—and close— the Doors of Death. What more does Athena want from her?\n" +
                    "\n" +
                    "Annabeth’s biggest fear, though, is that Percy might have changed. What if he’s now attached to Roman ways? Does he still need his old friends? As the daughter of the goddess of war and wisdom, Annabeth knows she was born to be a leader, but never again does she want to be without Seaweed Brain by her side.\n" +
                    "\n" +
                    "Narrated by four different demigods, The Mark of Athena is an unforgettable journey across land and sea to Rome, where important discoveries, surprising sacrifices, and unspeakable horrors await. Climb aboard the Argo II, if you dare…"
        )
        booklist.add(book7)

        val book8 = Books(
            R.drawable.hades,
            "Rick Riordan",
            "The House of Hades",
            "At the conclusion of The Mark of Athena, Annabeth and Percy tumble into a pit leading straight to the Underworld. The other five demigods have to put aside their grief and follow Percy’s instructions to find the mortal side of the Doors of Death. If they can fight their way through the Gaea’s forces, and Percy and Annabeth can survive the House of Hades, then the Seven will be able to seal the Doors both sides and prevent the giants from raising Gaea. But, Leo wonders, if the Doors are sealed, how will Percy and Annabeth be able to escape?\n" +
                    "\n" +
                    "They have no choice. If the demigods don’t succeed, Gaea’s armies will never die. They have no time. In about a month, the Romans will march on Camp Half-Blood. The stakes are higher than ever in this adventure that dives into the depths of Tartarus."
        )
        booklist.add(book8)

        val book9 = Books(
            R.drawable.blood,
            "Rick Riordan",
            "The Blood of Olympus",
            "Though the Greek and Roman crewmembers of the Argo II have made progress in their many quests, they still seem no closer to defeating the earth mother, Gaea. Her giants have risen—all of them, and they’re stronger than ever. They must be stopped before the Feast of Spes, when Gaea plans to have two demigods sacrificed in Athens. She needs their blood—the blood of Olympus—in order to wake. The demigods are having more frequent visions of a terrible battle at Camp Half-Blood. The Roman legion from Camp Jupiter, led by Octavian, is almost within striking distance.\n" +
                    "\n" +
                    "Though it is tempting to take the Athena Parthenos to Athens to use as a secret weapon, the friends know that the huge statue belongs back on Long Island, where it might be able to stop a war between the two camps. The Athena Parthenos will go west; the Argo II will go east. The gods, still suffering from multiple personality disorder, are useless. How can a handful of young demigods hope to persevere against Gaea’s army of powerful giants? As dangerous as it is to head to Athens, they have no other option. They have sacrificed too much already. And if Gaea wakes, it is game over."
        )
        booklist.add(book9)

        val book10 = Books(
            R.drawable.player,
            "Ernest Cline",
            "Ready Player One",
            "James Halliday, creator of an immense virtual world called the OASIS, dies and leaves a message explaining a contest called the Hunt. Whoever finds an Easter egg—an hidden feature in a piece of software left by a programmer as a joke or a prize—will inherit Halliday’s massive fortune and control of the OASIS. Wade Watts, a poor teenager from Oklahoma, becomes one of many “gunters” searching for three keys which will lead to the ultimate prize."
        )
        booklist.add(book10)
    }
}