package bai.bing.rewards

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.core.net.toUri
import bai.bing.rewards.ui.theme.BingRewardsTheme
import kotlin.random.Random

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BingRewardsTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Opener(
                        modifier = Modifier.padding(innerPadding),
                    )
                }
            }
        }
    }
}

@Composable
fun Opener(modifier: Modifier = Modifier) {
    val context = LocalContext.current
    var a1 by remember { mutableIntStateOf(Random.nextInt(array1.size)) }
    var a2 by remember { mutableIntStateOf(Random.nextInt(array2.size)) }
    var a3 by remember { mutableIntStateOf(Random.nextInt(array3.size)) }
    var a4 by remember { mutableIntStateOf(Random.nextInt(array4.size)) }
    var a5 by remember { mutableIntStateOf(Random.nextInt(array5.size)) }

    var text by remember {
        mutableStateOf("${array1[a1]} ${array2[a2]} ${array3[a3]} ${array4[a4]} ${array5[a5]}")
    }

    val url = "https://www.bing.com/search?q=$text&PC=U316&FORM=CHROMN"

    Column(
        modifier =
            modifier
                .fillMaxWidth()
                .fillMaxHeight(),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        OutlinedTextField(
            value = text,
            onValueChange = { newText -> text = newText },
            label = { Text("Enter Words") },
            placeholder = { Text("Tip: use auto complete of keyboard") },
            singleLine = true,
            modifier =
                Modifier
                    .fillMaxWidth()
                    .padding(30.dp),
        )

        Button(onClick = {
            a1 = Random.nextInt(array1.size)
            a2 = Random.nextInt(array2.size)
            a3 = Random.nextInt(array3.size)
            a4 = Random.nextInt(array4.size)
            a5 = Random.nextInt(array5.size)

            text =
                "${array1[a1]} ${array2[a2]} ${array3[a3]} ${array4[a4]} ${array5[a5]}"

            val intent = Intent(Intent.ACTION_VIEW, url.toUri())
            context.startActivity(intent)
        }) {
            Text("Open")
        }
    }
}

val array1 =
    listOf(
        "he",
        "she",
        "they",
        "we",
        "I",
        "John",
        "Mary",
        "dogs",
        "cats",
        "birds",
        "students",
        "teachers",
        "children",
        "friends",
        "people",
        "engineers",
        "doctors",
        "artists",
        "musicians",
        "players",
        "computers",
        "cars",
        "phones",
        "cities",
        "countries",
        "rivers",
        "mountains",
        "trees",
        "flowers",
        "houses",
        "apples",
        "books",
        "movies",
        "games",
        "planes",
        "boats",
        "shoes",
        "hats",
        "coats",
        "birds",
        "fishes",
        "lions",
        "tigers",
        "bears",
        "wolves",
        "farmers",
        "drivers",
        "writers",
        "singers",
        "actors",
        "lawyers",
        "chefs",
        "kids",
        "babies",
        "neighbors",
        "authors",
        "families",
        "men",
        "women",
        "parents",
        "guests",
        "pilots",
        "mechanics",
        "builders",
        "scientists",
        "nurses",
        "soldiers",
        "police",
        "friends",
        "artists",
        "teachers",
        "students",
        "people",
        "children",
        "parents",
        "dogs",
        "cats",
        "friends",
        "people",
        "guests",
    )

val array2 =
    listOf(
        "is",
        "are",
        "was",
        "were",
        "has",
        "have",
        "do",
        "does",
        "did",
        "will",
        "go",
        "goes",
        "went",
        "see",
        "sees",
        "saw",
        "make",
        "makes",
        "made",
        "take",
        "takes",
        "took",
        "come",
        "comes",
        "came",
        "say",
        "says",
        "said",
        "think",
        "thinks",
        "thought",
        "know",
        "knows",
        "knew",
        "want",
        "wants",
        "wanted",
        "use",
        "uses",
        "used",
        "feel",
        "feels",
        "felt",
        "give",
        "gives",
        "gave",
        "work",
        "works",
        "worked",
        "play",
        "plays",
        "played",
        "live",
        "lives",
        "lived",
        "read",
        "reads",
        "write",
        "writes",
        "wrote",
        "run",
        "runs",
        "ran",
        "watch",
        "watches",
        "watched",
        "buy",
        "buys",
        "bought",
        "eat",
        "eats",
        "ate",
        "sleep",
        "sleeps",
        "slept",
        "help",
        "helps",
        "helped",
        "try",
        "tries",
        "tried",
    )

val array3 =
    listOf(
        "book",
        "car",
        "phone",
        "apple",
        "movie",
        "game",
        "house",
        "city",
        "river",
        "mountain",
        "flower",
        "tree",
        "shoe",
        "hat",
        "coat",
        "bird",
        "fish",
        "lion",
        "tiger",
        "bear",
        "wolf",
        "song",
        "letter",
        "meal",
        "job",
        "story",
        "picture",
        "child",
        "friend",
        "neighbor",
        "teacher",
        "student",
        "computer",
        "plane",
        "boat",
        "desk",
        "chair",
        "door",
        "window",
        "road",
        "park",
        "school",
        "hospital",
        "store",
        "market",
        "office",
        "garden",
        "beach",
        "island",
        "forest",
        "star",
        "moon",
        "sun",
        "cloud",
        "rain",
        "snow",
        "wind",
        "fire",
        "water",
        "earth",
        "camera",
        "watch",
        "pen",
        "notebook",
        "key",
        "bag",
        "wallet",
        "ball",
        "bike",
        "train",
        "bus",
        "road",
        "bridge",
        "field",
        "street",
        "tower",
        "castle",
        "palace",
        "garden",
        "lake",
    )

val array4 =
    listOf(
        "quick",
        "slow",
        "happy",
        "sad",
        "bright",
        "dark",
        "warm",
        "cold",
        "loud",
        "quiet",
        "beautiful",
        "ugly",
        "young",
        "old",
        "strong",
        "weak",
        "fast",
        "slowly",
        "carefully",
        "easily",
        "hard",
        "soft",
        "tall",
        "short",
        "clean",
        "dirty",
        "rich",
        "poor",
        "busy",
        "calm",
        "friendly",
        "angry",
        "funny",
        "serious",
        "brave",
        "shy",
        "kind",
        "mean",
        "smart",
        "stupid",
        "new",
        "old",
        "early",
        "late",
        "happy",
        "sad",
        "bright",
        "dark",
        "warm",
        "cool",
        "high",
        "low",
        "deep",
        "shallow",
        "strong",
        "weak",
        "fast",
        "slow",
        "loud",
        "quiet",
        "easy",
        "difficult",
        "safe",
        "dangerous",
        "clean",
        "dirty",
        "fresh",
        "stale",
        "smooth",
        "rough",
        "full",
        "empty",
        "heavy",
        "light",
        "soft",
        "hard",
        "wide",
        "narrow",
        "sharp",
        "dull",
    )

val array5 =
    listOf(
        "and",
        "or",
        "but",
        "because",
        "so",
        "although",
        "if",
        "when",
        "while",
        "after",
        "before",
        "during",
        "until",
        "since",
        "on",
        "in",
        "at",
        "by",
        "with",
        "about",
        "against",
        "between",
        "into",
        "through",
        "during",
        "without",
        "under",
        "over",
        "above",
        "near",
        "the",
        "a",
        "an",
        "some",
        "any",
        "each",
        "every",
        "either",
        "neither",
        "both",
        "my",
        "your",
        "his",
        "her",
        "its",
        "our",
        "their",
        "this",
        "that",
        "these",
        "those",
        "here",
        "there",
        "where",
        "why",
        "how",
        "also",
        "too",
        "very",
        "more",
        "most",
        "less",
        "least",
        "only",
        "just",
        "even",
        "already",
        "yet",
        "still",
        "almost",
    )
