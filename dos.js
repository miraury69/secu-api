const https = require("http");

https
  .get("http://localhost:8080/newUser", (resp) => {
    let data = "";

    // Un morceau de réponse est reçu
    resp.on("data", (chunk) => {
      data += chunk;
    });

    // La réponse complète à été reçue. On affiche le résultat.
    resp.on("end", () => {
      console.log(JSON.parse(data).explanation);
    });
  })
  .on("error", (err) => {
    console.log("Error: " + err.message);
  });
