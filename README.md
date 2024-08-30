## Problem 
Implement factory design pattern using Pet as the factory interface.  The interface implements two methods: makeSound() and play().

Dog and Cat are concrete objects that implements Pet interface.

PetRecord holds attributes such as petId, petName, and Pet.

Clinic would be the client object.

Refer to the UML Class Diagram

## Class Diagram
![image](https://github.com/JerryEsperanza/factoryPattern/assets/142370600/0506f134-a5f6-4d98-a817-cd6f7a8466c7)

### Program Output:
```
[1] Dog
[2] Cat
[3] Exit

Choose your pet number: 1
Pet id is D01
Pet name is Bantay
Pet kind: Dog
Communication sound: Aw, aw!
Play mode: Catching objects that you throw!
Breed: German Shepperd
-----
[1] Dog
[2] Cat
[3] Exit

Choose your pet number: 2
Pet id is C01
Pet name is Muning
Pet kind: Cat
Communication sound: Meow, meow!
Play mode: Catching/pursuing moving objects!
Number of Lives: 9
-----
[1] Dog
[2] Cat
[3] Exit

Choose your pet number: 1
Pet id is D01
Pet name is Bantay
Pet kind: Dog
Communication sound: Aw, aw!
Play mode: Catching objects that you throw!
Breed: German Shepperd
-----
[1] Dog
[2] Cat
[3] Exit

Choose your pet number: 3
Exit
```
