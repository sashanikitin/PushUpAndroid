package sport.pushup

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import sport.pushup.ui.theme.PushUPTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PushUPTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color.LightGray
                ) {
                    IntrinsicTest()
                    //Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun IntrinsicTest() {
    Row (Modifier.height(56.dp)){
        Button(
            onClick = {}) {
            Text("button\n1")

        }

        Button(
            onClick={}, ) {
          //  modifier = Modifier.fillMaxHeight()) {
            Text("button2")
        }
    }
    Spacer(modifier = Modifier.width(50.dp))
    Row (Modifier.height(800.dp)) {
        Button(
            onClick = {}) {
            Text("Big button\n1")

        }
    }
}



@Composable
fun Greeting(name: String) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "First item",
            modifier = Modifier.padding(16.dp)
        )
        Text(
            text = "Second item",
            modifier = Modifier.padding(16.dp)
        )
        Text(
            text = "Third item",
            modifier = Modifier.padding(16.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    PushUPTheme {
        Greeting("Android")
    }
}