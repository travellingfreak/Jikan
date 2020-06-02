![Maven Package](https://github.com/Schalar/Jikan/workflows/Maven%20Package/badge.svg)

# Java Jikan Client
[Jikan RESTful API](https://github.com/jikan-me/jikan) Java Client for the unofficial myanimelist api.

Add the dependency to your pom.xml
```
<dependency>
  <groupId>com.schalar</groupId>
  <artifactId>jikan</artifactId>
  <version>1.0.0</version>
</dependency>
```
Then install it from the command line
```
mvn install
```

# Getting Started

## Instantiate the client

```
JikanClient jikan = new JikanClient();
```

## Use it to request MAL data

```
AnimeRequest request = new  AnimeRequest(1);
Anime anime = jikan.getAnime(request);
```

All responses are converted to Java classes.

Using the client should be self-explanatory since it is fully type-hinted.

If you experience any issues, open an issue, or even better a Pull Request!