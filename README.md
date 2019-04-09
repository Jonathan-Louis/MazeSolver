# MazeSolver
Program that allows user to enter the number of rows and columns for a rectangular maze. Then removes random pieces of the maze and checks for a solution after each piece is removed.



# Example run #1 with 3 rows and 3 columns:

Enter number of rows for maze: 
3
Enter number of columns for maze: 
3
   _ _ 
|_|_|_|
|_|_|_|
|_|_| |

   _ _ 
|_|_|_|
|_|_ _|
|_|_| |
   _ _ 
|_ _|_|
|_|_ _|
|_|_| |
   _ _ 
|_ _|_|
|_ _ _|
|_|_| |
   _ _ 
|_  |_|
|_ _ _|
|_|_| |
   _ _ 
|_  |_|
|_ _ _|
|_|_| |
   _ _ 
|_  |_|
|_ _ _|
|_|_| |
   _ _ 
|_  |_|
|_   _|
|_|_| |
   _ _ 
|_  |_|
|_   _|
|_ _| |
   _ _ 
|_  |_|
|_   _|
|_ _| |
   _ _ 
|_  |_|
|    _|
|_ _| |
   _ _ 
|_  |_|
|     |
|_ _| |

Maze of 3 rows and 3 columns took 11 iterations to solve.



# Example run #2, 50 rows by 50 columns:

Enter number of rows for maze: 
50
Enter number of columns for maze: 
50
   _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ 
|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|
|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|
|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|
|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|
|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|
|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|
|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|
|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|
|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|
|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|
|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|
|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|
|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|
|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|
|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|
|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|
|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|
|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|
|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|
|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|
|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|
|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|
|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|
|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|
|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|
|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|
|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|
|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|
|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|
|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|
|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|
|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|
|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|
|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|
|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|
|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|
|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|
|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|
|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|
|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|
|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|
|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|
|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|
|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|
|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|
|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|
|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|
|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|
|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|
|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_| |

... removing peices ...
final maze

   _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ 
| |       |_| |   |_|      _   _ _ _| |   |  _|_  | |     |_|  _      |   | |_  |  _ _  | | |_ _| |_|
|     |    _ _|_     _|  _|_|_     _    |_|_ _ _      |     |   |  _|  _ _|      _|  _|_    |     | |
|_|  _    |  _  |  _ _   _|   |  _|    _      |_|  _| | |     |  _  | |_| | |_|_|   |      _   _|_ _|
|  _  |_   _     _   _|_  |_|     |  _    |_ _   _|  _   _   _| |   |_   _|  _|_|_ _|  _|       | |_|
|_   _ _|         |     | |     |  _  | |_ _  |  _|_ _|  _|            _| | | |   |_  |  _  |   |_| |
| | |_  | |  _ _|_    |_  |_ _  |   |  _     _ _|_   _      |    _|  _| |  _  |_ _       _|  _|_|   |
|_  |_  |  _| |_  |   | | | | |   |  _|_| |_  |_   _   _|       |    _      |_  |     | |     |     |
|   |_ _|_ _|  _ _| |  _    |  _ _|  _   _    | |   | | |_ _  |  _|_ _|_   _    | |  _  |   |_|     |
|_       _| |   |_ _|_   _    |_| |    _    |  _|_  |  _  |       | |  _ _|_ _ _| |       |_ _|   | |
|  _  |_|_  |  _      |_      |_ _   _   _|   |   | |_| | |   | |_| |   | |_|    _   _ _    |_ _|   |
|_    |  _|_|    _ _ _|  _|_    |  _    |_         _  |_  |  _|_   _  |   | |_| | |_  |_          |_|
|_| |_  | | | | |  _|_    | |_|   |_| |_|   |_|_| |_    |_   _     _| |_|  _|   |_|_| |      _ _|   |
|_ _ _  |_ _| |      _   _|  _|_|_    | |  _  |_ _    |   | |    _      |   | |_ _|  _|  _  | |_  | |
| |_ _| | |      _| |   | | |    _             _| | |_|  _ _|   |   |_    |   |_| |_          | | | |
|_ _  |_|     |_  |  _ _|_| |       |_  |   |   | |_|   |_|_  |  _ _|  _   _      | |  _|      _   _|
|_  |  _|_| |_ _     _   _|  _ _|    _|  _ _|_   _ _ _| |    _|_   _ _  | |  _   _|  _     _  |_   _|
| | |_     _|          _   _ _ _  |  _ _|  _   _| |  _  |   | |    _   _ _|    _   _|  _|   |_ _| | |
|_|   |     |  _     _ _   _  |  _  |  _|   |_ _|_|_ _               _   _    |_ _      |_|_ _ _  |_|
|    _|_  |  _ _      |   |    _| |   |_  | |     | |_ _   _|_|  _    |   |_|_      |_  |_|_  |     |
| |_ _ _| | |_|_|_    |  _|_  |_  | | |_  |       |_       _|_  | | |      _ _  |_|_|  _|  _ _|  _|_|
|   |   |     | |_  |        _   _|    _|   |  _ _ _ _| |_     _ _ _ _|_|    _ _| | | |    _      |_|
| |_     _ _|  _ _ _  |_|    _   _|_         _|     | | |     | |  _ _ _ _ _|_     _         _|     |
|              _   _ _ _  |_| |  _    |   |     |    _|_|  _      |   |  _    |  _|_|   |  _|  _  | |
|     |  _ _    |  _ _   _|    _             _   _|_|   | |        _| | | |_ _     _|  _ _| |_ _ _| |
|     |  _|    _ _   _| |  _| | | | |_  |           |_| |_ _            |_| |   |      _  |_|_  |_|_|
|_     _ _|    _ _  | |_   _ _|_   _ _ _      |    _|  _    |  _   _|  _ _|   |   |  _  | |   |   | |
|_|  _ _|_|_ _     _|_| |_    |    _ _|  _ _      |  _ _|  _ _ _|_|_| | |_  |_ _| |  _|  _  | |_    |
|_  | |  _ _|       |_|_|_          |_|   | |  _| |_|_  |     |_|  _|  _|_| |_ _       _|_|     |   |
|_    | |         |_   _ _| |   |    _|_      | |_   _|  _   _|     |_ _    |  _| |  _  |_ _ _ _|   |
| |_|_|   | |_       _ _   _  |_|      _  |      _ _|      _ _|_ _ _ _|    _ _|  _|  _ _|  _   _|_ _|
|       | |   | |_ _    |   |_|_|_ _|_ _|_  |    _|      _    |_       _ _ _ _ _  |   | |  _ _|  _  |
|        _  |_       _ _|   |    _   _|     |_   _  |   |  _  |_ _| | |_|_ _  | | |_        |_ _ _  |
|    _| |_|  _   _ _|  _ _| | |   | |   | |       | |_  | |_|   |   |      _|_ _   _|   |       |   |
| |  _| |_  |_| |    _  |   |_  |_|       | | |   |  _ _|_  |     |_ _  | | |_ _  |_ _| |  _ _ _   _|
|      _ _|    _ _|_| |        _       _      |_|      _|  _|      _      |  _ _|  _|  _ _|_|    _ _|
|   |_     _  |  _|   |_ _ _ _| |  _    | | | | |_| | |     | | | |  _ _     _| |_|_| |_ _   _ _|_ _|
|_  |_|_    |_  |  _|   |       | | |   |_ _| |_| |  _| |_|_|        _|_ _   _     _     _|     |  _|
|  _|   |_| |   |_|_|_|_ _   _  |_|_| |_|_ _   _| |_    | |_|      _ _|  _  | |      _|_| | |_  |   |
|_   _  |     |      _|  _ _|    _ _ _|_    |_  | |    _|_ _  | |_   _ _    |  _   _     _   _| | | |
| |_ _|   | | |   | |    _ _ _|  _ _| |     |_   _|_  |  _      |_     _    |   |_|_   _ _ _ _|    _|
| |_| |_ _|_ _ _      | |_       _  | |_  | | |_ _ _    |    _ _|_|   |    _ _ _               _  | |
|    _ _    |_ _   _ _   _|_       _ _    |   | |_ _   _   _|_     _| |  _| |      _  |   |   |   | |
|   |_  |    _|_|  _|     | |_   _|_ _|_ _| |  _ _    |_  |_ _  |_  | |_   _ _      |    _   _|   | |
|_|_|_| |        _ _|_     _  |_  | | |  _ _|  _  |_    |_    |   |  _|     |_   _   _|      _|_ _ _|
|_     _         _|     |   |_|   |     |    _  |_    |_|_   _|   |_|_         _ _    |   |_  |_    |
|_  |  _  |  _  |_ _  |  _|_ _   _|  _|      _      | |         |   |  _|_| |_ _  |_   _   _        |
| | | | |   |_ _|_|   |   |   | |_|_| |         |_|_  |_|_| | |_    |   |_|_  | |_|_ _  |_ _   _ _| |
|  _|    _   _     _   _  |  _  | |   |    _| |      _|_   _| |  _      |   |_|_| |         |  _ _ _|
|     |        _ _ _ _|    _   _|_ _ _ _|    _|      _    |_|   | |_ _|   |_ _|  _| |_  |   |  _   _|
|_|_ _|_|_ _ _ _|_|_ _|_|_ _ _ _ _|_ _ _|_ _ _ _ _|_ _ _|_|_|_ _ _ _ _|_|_ _ _|_ _ _ _ _ _ _ _ _ _  |

Maze of 50 rows and 50 columns took 4891 iterations to solve.
