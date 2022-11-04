# Guitar Inventory
- our customer rick decided to throw out his paper-based System for keeping track of guitars in his invetory, and start using a computer-based system to store his inventory. so he want `search` tool to help him match up a customer to their dream instrument

## Class Digram
![](Attacments/Screenshot%20from%202022-11-04%2011-03-13.png)


### GuitarSpec
- this class contains all specs that customers prefer for searching about guitar
- attributes are private so we make some methods to get them
- `matches` method is to compare between 2 guitars and return true if they are the same other wise return false

### Guitar
- this calss contains every thing that related of class

### Inventroy
- this calss is about our inventory so it has list of our guitars
  
**methods**
- `addGuitar` method is to add guitar to our inventory
- `getGuitar` method is to getGuitar from our inventory with passing it's serialNumber
- `search` method is the tool that **Rick's customers** will use so we take `guitarSpec`  from customers and just seraching for guitars that matches customers specs with helping of `matches` method


> Note that we use Enumerated types with
> ***Builder***
> ***Type***
> ***Wood*** 
> to achieve type safety and value safety and minimize using of strings and strings comparison