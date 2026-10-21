# Database Snapshot & Recovery Manager using Java

A menu-driven Java OOP mini project extracted from the supplied `OOP Mini Project Final.pdf` report.

## Features in the source report

- Create snapshot action
- Restore snapshot action
- View backup logs
- Console menu interface
- OOP abstraction (`BackupSystem`), interface (`LogManager`), inheritance, and method overriding

## Requirements

- Java Development Kit (JDK) 8 or newer

## Run

```bash
javac Main.java
java Main
```

## Important limitation

This is the code as represented in the report. The `createSnapshot` and `restoreSnapshot` methods currently only append status messages to an in-memory log and print success messages. They do **not** create backup copies, restore file contents, persist logs between runs, or implement database connectivity/authentication. The `java.io.*` import is present but unused. The project should not be treated as a production backup or recovery utility without implementing and testing those behaviors.


