# Autonomous Instantdocument System

[![forthebadge](https://forthebadge.com/images/badges/made-with-java.svg)](https://forthebadge.com)
[![forthebadge](http://forthebadge.com/images/badges/built-with-love.svg)](http://forthebadge.com)

[![shields.io](https://img.shields.io/github/license/j0giwa/automomous-instantdokument-system)](https://img.shields.io/github/license/j0giwa/automomous-instantdokument-system)
[![sields.io](https://img.shields.io/github/stars/j0giwa/automomous-instantdokument-system)](https://img.shields.io/github/stars/j0giwa/automomous-instantdokument-system)
[![shields.io](https://img.shields.io/github/issues/j0giwa/automomous-instantdokument-system)](https://img.shields.io/github/issues/j0giwa/automomous-instantdokument-system)

## Features
<details>
<summary>Click to expand!</summary>

- Generate LaTeX documents
- Usable via GUI, TUI (UNIX OS only) and CLI

### Planned Features
<details>
<summary>Click to expand!</summary>

- Customisable LaTeX snippets (preconfigured ffor exams and answers)
- Snippet statistics are saved in a database (for example how often a snipped has been used)
- Export database to csv
- ChatGPT integration to automatically generate new snippets (API-key required)

</details>
</details>

## Requirements
<details>
<summary>Click to expand!</summary>

- java17
- javafx
- pdflatex
- whiptail (for TUI)
- maven (if you want to build from source)

</details>

## Install
<details>
<summary>Click to expand!</summary>

### Build it yourself

#### Linux
``` bash
sudo rm -rf "/usr/local/bin/automomous-instantdocument-system" "/usr/local/bin/automomous-instantdocument-system-cli"
git clone "https://github.com/j0giwa/automomous-instantdocument-system"
cd automomous-instantdocument-system
mvn package
sudo cp ./target/automomousInstantdocumentSystem-0.8.5-jar-with-dependencies.jar /opt/automomous-instantdocument-system/automomous-instantdocument-system.jar
sudo cp ./automomous-instantdocument-system /usr/local/bin
sudo cp ./automomous-instantdocument-system-cli /usr/local/bin
sudo cp ./automomous-instantdocument-system-cli /usr/local/bin
gip gzip docs/man/autonomous-instantdocument-system.1
cp .docs/man/autonomous-instantdocument-system.1.gz /usr/share/man/man1/
cd ..
rm -rf automomous-instantdocument-system
```

</details>

## How to use
<details>
<summary>Click to expand!</summary>

`automomous-instantdocument-system` without options launches in a grafical mode.

### Flags
| flag          | function                           |
| ------------- | ---------------------------------- |
| -t --type <type> | Specifies the desired Document type e.g. "exam". |
| -c --chapters <chapters> | Specifies the amount of chapters per document. 
| -a --amount <amount> | Specifies how many Documents should be generated.
| -ns --noshuffle | Turns of shuffle mode. |
| -h --help | Show summary of options. |
| -v --version | Print version number and exit. |

</details>
