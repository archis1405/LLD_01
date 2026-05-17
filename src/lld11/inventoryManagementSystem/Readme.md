### Task 01 : 

```
Build the domain model for our inventory system:
```

### Requirements:
```
Create an Item base class with fields: id, name, price, quantity
Create three subclasses: Book (adds author), Clothing (adds size), Electronics (adds warranty)
Item must implement Comparable<Item> — sorted by price ascending
Override equals() and hashCode() based on id — we'll need this later
```