# Java Updates with Code Samples (Java 5 to Java 24)

This repository contains runnable Java code samples demonstrating key features from Java 5 through Java 24.

## Java10 Var
```java

public class Java10_Var {
    public static void main(String[] args) {
        var message = "Hello, Java 10!";
        System.out.println(message);
    }
}

```

## Java11 HttpClient
```java

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Java11_HttpClient {
    public static void main(String[] args) throws Exception {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create("https://example.com"))
            .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());
    }
}

```

## Java14 Record
```java

public class Java14_Record {
    record Person(String name, int age) {}

    public static void main(String[] args) {
        Person p = new Person("Alice", 30);
        System.out.println(p.name());
    }
}

```

## Java16 PatternMatching
```java

public class Java16_PatternMatching {
    public static void main(String[] args) {
        Object obj = "Hello Java";
        if (obj instanceof String s) {
            System.out.println("Length: " + s.length());
        }
    }
}

```

## Java17 Sealed
```java

sealed class Shape permits Circle, Rectangle {}

final class Circle extends Shape {}
final class Rectangle extends Shape {}

public class Java17_Sealed {
    public static void main(String[] args) {
        Shape shape = new Circle();
        System.out.println("Shape is: " + shape.getClass().getSimpleName());
    }
}

```

## Java18 SimpleWebServer
```java

// Run from command line (Java 18+)
// Terminal command:
// jwebserver --port 8000

// No code file needed; built-in HTTP server for static files

```

## Java19 StructuredConcurrency
```java

// Structured concurrency is a preview feature and needs --enable-preview flag to compile/run
// Use with Project Loom (Java 19+)

```

## Java19 VirtualThreads
```java

public class Java19_VirtualThreads {
    public static void main(String[] args) {
        Runnable task = () -> System.out.println("Running in: " + Thread.currentThread());
        Thread.startVirtualThread(task);
    }
}

```

## Java20 RecordPattern
```java

record Person(String name, int age) {}

public class Java20_RecordPattern {
    public static void main(String[] args) {
        Object obj = new Person("Alice", 30);
        if (obj instanceof Person(String name, int age)) {
            System.out.println("Name: " + name + ", Age: " + age);
        }
    }
}

```

## Java21 SequencedCollections
```java

import java.util.SequencedCollection;
import java.util.LinkedList;

public class Java21_SequencedCollections {
    public static void main(String[] args) {
        SequencedCollection<String> list = new LinkedList<>();
        list.addFirst("First");
        list.addLast("Last");
        list.forEach(System.out::println);
    }
}

```

## Java21 StringTemplates
```java

// String Templates is a preview feature in Java 21+
// Example (not yet widely supported):
// String name = "Alice";
// String greeting = STR."Hello \{name}!";

```

## Java22 UnnamedClasses
```java

// Java 22 feature - unnamed classes and instance main methods
// Save file without class declaration:
// void main() {
//     System.out.println("Hello from unnamed class!");
// }
// Compile & run with: javac --release 22 --enable-preview ... && java --enable-preview ...

```

## Java24 StructuredConcurrency
```java

// Java 24 finalized structured concurrency API
// Still in incubator or preview as of early 2025

```

## Java5 Enum
```java

public class Java5_Enum {
    enum Direction { NORTH, SOUTH, EAST, WEST }

    public static void main(String[] args) {
        Direction d = Direction.NORTH;
        System.out.println(d);
    }
}

```

## Java5 Generics
```java

import java.util.ArrayList;
import java.util.List;

public class Java5_Generics {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Alice");
        String name = names.get(0);
        System.out.println(name);
    }
}

```

## Java7 TryWithResources
```java

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Java7_TryWithResources {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("test.txt"))) {
            System.out.println(br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

```

## Java8 Lambda
```java

import java.util.Arrays;
import java.util.List;

public class Java8_Lambda {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob");
        names.forEach(name -> System.out.println(name));
    }
}

```

## Java8 Stream
```java

import java.util.Arrays;
import java.util.List;

public class Java8_Stream {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a", "bb", "ccc");
        list.stream().filter(s -> s.length() > 1).forEach(System.out::println);
    }
}

```

