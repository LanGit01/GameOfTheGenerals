Implementation
==============

Merong mga class na naglalaman ng state ng game:

* Piece
* Player
* Board
* State

Merong isang class na nag-aadvance ng state ng game:

* Engine

Piece
-----

* x
* y
* rank
* player
* alive

Player
------

* ...

Board
-----

* pieces
* players

State
-----

* board
* turn


Mga tungkulin ng mga class
==========================

  Piece
----
    - data storage lang
  

  
  Board
----  
    - laman ang data tungkol sa laro
      * pieces
      * kung may panalo na ba, at sino
    - naggagalaw sa mga pieces
    - naha-handle yung pagkain ng mga pieces
    
  State
--
    -
    
  Engine
--
    - Nag-uutos sa Board kung ano ang gagawin
    - Kinukuha ang data galing sa board at ibinibigay sa UI para mai-display
    - Main Logic ng laro (paggalaw, pagkain, etc)
    
  UI (?)
  
  
  
  Paano ang takbo ng application? Kailangang idetalye para malinaw

