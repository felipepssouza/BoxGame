# BoxGame [![travis-ci](https://travis-ci.org/felipepssouza/BoxGame.svg?branch=master)](https://travis-ci.org/felipepssouza/BoxGame) [![codecov](https://codecov.io/gh/felipepssouza/BoxGame/branch/master/graph/badge.svg)](https://codecov.io/gh/felipepssouza/BoxGame)

Project responsible to solve the box with incorrect labels puzzle
- The class responsible to show the answer to the puzzle is PuzzleBoxSolver

## BoxGame - Next steps:
- Build an interactive command line
- Find an algorithm to create the incorrect possibilities (PuzzleBoxProblem)

## BoxGame - How to use:

The project isn't interactive yet

- To run the tests, and check the coverage
```
$ROOT/gradlew clean test codeCoverageReport
```

## BoxGame - How it is organized:

Following the Clean Architeture of Uncle Bob. This is the structure (It doesn't have interface and config yet): 
```
-ROOT
  - usecase (Here are all the business rules)
```




