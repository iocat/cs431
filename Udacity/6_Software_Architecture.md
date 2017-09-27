# Software Architecture
Architectural design decision is the principle design decision.  
A system can be successful but poorly architected.

***Architecture Erosion***: 
Imagine buy a decent car. At one point you must upgrade the engine, then replace the side mirror, then cut the roof of the car.\
In the end, you get a car still your car but the behavior changed. Sometimes, it's hard to make a turn. 

## Definition
1. Perry and Wolf: SWA = {Elements, Form, Rationale}
    *  Elements: What - the processes, data, connectors
    *  Form: How - properties and relationship
    *  Rationale: Why - justification of the element and their relationship
1. Shaw and Garland: SWA is a level of design that involves:
    *  Description of elements from which systems are built
    *  Interactions among these elements
    *  Patterns that guide their composition
    *  Constraints on these patterns
1. In This Class: A set of principal design decisions about the system. 
    * When we design a system, we make tons of decisions and most of them do not affect the architecture of the system, but some of which do affect.
    * Blueprint of a software system, incompasses every facets of the system:
        * Structure
        * Behavior
        * Interaction
        * Non-functional properties
    * Temporal Aspect: Is not defined at once, but iteratively over time. \
    At any point in time a SWA, but it will change over time. \
    Design decisions are made, unmade, and changed over a system lifetime.

2 main standpoints:
1. Prescriptive: captures the design decisions made prior to the system's construction. => as-conceived SWA 
1. Descriptive: describes how the system has actually been built => as-implemented SWA

## Architectural Evolution
When the system evolves, ideally its prescriptive architecture should be modified.
` Example: when we modify a system we change the blueprint, but rarely change the building.`
Descriptive architecture is changed due to:
1. Developer's sloppiness
1. Short deadlines
1. Lack of documented prescriptive architecture

## Architectural Degradation
1/ ***Architectural drift*** introduction of architectural design decisions orthogonal to a system's prescriptive architecture. Add components that have nothing to do with the prescriptive design
1/ ***Architectural erosion*** introduction of architectural design decisions that violate a system's prescriptive architecture. Implement the components in a way that violates the given prescriptive design.

Results: degraded architecture.
***Recovery***: determine the SWA from the implementation then fix it to follow the prescriptive architecture.

### Real-world Example: 
