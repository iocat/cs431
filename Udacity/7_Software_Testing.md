# Software Testing

Some examples:
Software is Buggy.
We must verify the software as much as possible.

Different alternative ways to verify:
1. Failure: Observable incorrect behavior 
1. Fault(bug): Incorrect code
1. Error: cause of a fault

Example:

```c
        int doubleValue(int i){
                int result;
                result = i * i;
                return result;
        }
```
- A call to doubleValue(3) returns 9 is a failure. 
- ` result = i * i; ` is a fault
- We don't really know the error here? Could be a type, or conceptual etc. The developer can only answer the question.

# Software Verification

4 main approaches:
1. Testing
1. Static verification
1. Inspections
1. Formal Proofs of Correctness

## Testing or Dynamic Verification
try to make the system fail.

Input Domain D => Software => Output Domain O
Test case: {in in D, out in O}
Test suite: a set of test cases.

## Static Verification
Consider all possible inputs (executions) 
Unlike testing, It is complete.

## Inspections ( reviews or walkthroughs)
Human intensive activity.
Manual and group activity.
Several people of the development team look at the code or artifacts and try to identify the defects in them.

## Formal proof of correctness
Given the specification and the program, we perform a mathematical approach to prove 

# Pros and Cons of techniques:

| |Testing| Static Verifcation| Inspections |Formal proof |
| - | - | - | - | - |
|Pros | No false positives: testing generates failures means there is an actual| Consider all program behaviors | Systematic, Thothrough | Strong Guarantees |
| Cons| Highly incomplete | Can generate false positives | Informal and Subjective | Complex, Expensive |

Bill Gates:
> 50% of our staff are testers, the other 50% spend most of their time testing.

# Developer's Testing

Executing a program on a ***tiny*** sample of the input domain
1. A dynamic technique: Program must be executed in order to be tested 
1. Optimistic approximation: Program exercised with a small subset of possible inputs. The behavior with any other input is consistent with any subset of input data.

If a set of test does not produce any error means it can show there is a problem with the program.

### Granularity Levels:
1. Unit Testing: A single module is tested in isolation
1. Integration Testing: multiple modules at the same time 
    - Big Bang testing: integrate all the modules at once.
1. System Testing: Complete the system testing as a whole which includes functional and non-functional testing.
    - Functional test: Test to verify the functionality provided by the system. 
        .e.g: doubleValue provides the good output
    - Nonfunctional test: targets non functional parts: performance, load, robustness. Basically, it targets: reliability, maintainability, usability or whatever *-ility it is.
1. Acceptance Testing: validation of software against customer's approval
1. Regression Testing: performs every time we change the system. Make sure the changes behave as intended and other components are not affected. 
    - Regression error: the change in some code broke some functionalities -> cause bugs. This is why maintenence is so expensive.
    - Example: the second software update causes error.
    - Use scripts and tools to save tests and reuse them later

# Alpha and Beta Testing

- Testing
- Alpha Testing: By distributing the software to the users that are internal to the company
- Beta testing: select a subset of users outside the organization.
- Product Release

# Black and White Box Testing

Two main families of testing technique:
Black-box testing: 



| | Black-box testing | White-box Testing |
| - | - | - | 
| Idea | Consider the software as a closed-box | Look inside the closed box |
| Based on | Based on a description of the software (specification) |  Based on the code |
| | - Cover as much specified behavior as possible <br/> - Cannot reveal errors due to implementation details | - Cover as much coded behavior as possible <br/>- Cannot reveal errors due to missing paths |

## Black-box testing example:
Specification: Inputs an integer and prints it

Possible implementation
```c
        void printNumBytes(int param){
                if (param <1024) printf("%d", param);
                else printf("%dKB", param/124);
        }
```

In this code, numbers smaller 1024 are treated differently than those \> 1024 which contradicts with the requirement. But the error can't be seen if all test cases are \< 1024.

## White-box testing example: 

Specification: inputs an integer param and returns half of its value if even, its value otherwise.

```c
        int fun(int param){
                int result;
                result = param/2;
                return result;
        }
```
Without specification, and look at the code, and try to execute them manually, we will see it runs perfectly fine.

# White-box Testing (aka Functional Testing)