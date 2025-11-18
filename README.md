
## Project Overview

This project is a Java-based ecosystem simulation designed to model different species and their interactions. The architecture is built on object-oriented principles, featuring a clear hierarchical class structure and a flexible, interface-driven system for defining entity behaviors.

The core hierarchy is as follows:
- `core.Species`: An abstract base class for all entities, defining fundamental properties like a name and a set of traits.
- `core.SpeciesType.Animal`: An abstract class that extends `Species` and serves as the foundation for all animal types.
- `core.AnimalTypes.Mammal`: An abstract class extending `Animal` for more specific mammal-type animals.
- Concrete animal classes (e.g., `core.AnimalCollection.Lion`) extend these abstract classes to create instantiable species.

A key architectural feature is the `core.actions.CanDo` class, which uses a series of nested interfaces with default methods (`Movable`, `CanHunt`, `CanFly`, etc.) to manage entity capabilities. This design favors composition over inheritance for behaviors, allowing for a flexible and scalable way to define what each species can do.

## Building and Running

There are no Maven (`pom.xml`) or Gradle (`build.gradle`) files present. The project can be compiled and run manually using `javac` and `java`.

**1. Compilation:**

You need to compile all `.java` files from the project root directory.

```bash
# (From the EcoSystem root directory)
javac -d . core/Species.java core/SpeciesType/Animal.java core/AnimalTypes/Mammal.java core/AnimalCollection/Lion.java core/TraitsType/*.java simulation/AnimalInitializer.java core/Base.java
```

**2. Running the Simulation:**

The main entry point for the example simulation is in the `core.Base` class.

```bash
# (From the EcoSystem root directory)
java core.Base
```

## Development Conventions

*   **Object-Oriented Design:** The project strictly follows OOP principles, with a heavy emphasis on abstraction and inheritance for the entity hierarchy.
*   **Interface-Based Behaviors:** All entity actions (moving, hunting, etc.) are defined as interfaces within the `CanDo` class. This is the preferred way to add new abilities to a species. When adding a new behavior, first define it as an interface in `CanDo`.
*   **Factory Pattern:** The `simulation.AnimalInitializer` class acts as a factory for creating animal instances. This pattern should be used to decouple the creation of new objects from the simulation logic.
*   **Package Structure:**
    *   `core`: Contains the fundamental classes and interfaces.
    *   `simulation`: Holds logic for creating and managing the simulation environment.
    *   `species`: Intended for specific species implementations (currently organized under `core.AnimalCollection`).
*   **Entry Point:** The `core.Base` class serves as the primary entry point for running and testing the simulation. `Main.java` appears to be for experimental code and is not part of the main application.
