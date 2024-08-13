# String Processor

This is a simple Java project for processing strings. The project provides two main functionalities:

1.**All input alphabet characters a-z**

2.**Remove Consecutive Identical Characters**

3**Replace Consecutive Identical Characters**

## Design Pattern
**Adapter Pattern**
**Strategy Pattern**

## Functionality

### 1. Remove Consecutive Identical Characters

For a string containing only lowercase letters, if there are 3 or more consecutive identical characters, remove them from the string. ..Repeat this process until no more than 3 identical characters are next to each other.

#### Example

- **Input**: `aabcccbbad`
- **Output**:
  - `aabbbad`
  - `aaad`
  - `d`

### 2. Replace Consecutive Identical Characters

In addition to removing consecutive identical characters, replace them with a single character that comes before them alphabetically.

#### Example

- **Input**: `abcccbad`
- **Output**:
  - `abbbad` (where `ccc` is replaced by `b`)
  - `aaad` (where `bbb` is replaced by `a`)
  - `d`

## Usage

### Build the Project

This project uses Maven as the build tool. You can build the project using the following command:

```bash
mvn clean install