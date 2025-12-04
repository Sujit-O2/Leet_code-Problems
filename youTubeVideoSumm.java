import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class youTubeVideoSumm {

    public static void main(String[] args) throws IOException, InterruptedException {

        System.out.println("YouTube Video Summary");

        String url = "https://api.groq.com/openai/v1/chat/completions";
        String apiKey = "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";  

        Scanner sc =new Scanner(System.in);
        String userMessage =sc.next();

        // Correct JSON Body
        String json = """
        {
          "model": "meta-llama/llama-4-maverick-17b-128e-instruct",
          "messages": [
            {
              "role": "user",
              "content": "Summarize this YouTube video content: %s"
            }
          ]
        }
        """.formatted(userMessage);

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + apiKey)
                .POST(HttpRequest.BodyPublishers.ofString(json))
                .build();

        HttpClient client = HttpClient.newHttpClient();
        HttpResponse<String> response =
                client.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.statusCode());
        System.out.println(response.body());
    }
}
