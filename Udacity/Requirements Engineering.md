## Gathering Requirements

One of the most difficult tasks. 

From users, external clients, co-workers. 
Clean requirements and distile them. 

Example: Average length of sentences in an essay. 
My response: 
1. How would we define a sentence in this aspect: is a sentence a simple sentence but not a complex one .i.e. two dependent clauses.
1. Do we need to spell check ?
1. We need to measure length in terms of what units? Like lines, pages or words or letters?
1. Do we need to detect cheating by adding copyright filters?
1. What is the format of the files provided say doc, pdf,.txt .. ? Or do we need to handle each file type individually?
1. Do we need an application interface?
1. What kind of application is this? Desktop, web, mobile?

### Define Software Requirements

**Requirements Engineering (RE)**: establishing the services that the customers require from the system. It is also the constraints under which the systems operate. 

**Output:** Software Requirements Specification.

This answers the question:
**What** does the system do?
Not ~~how does the system do it?~~

## Software Intensive System = Software + Hardware + Context.

We usually take hardware and context out of the equation, but when we analyze the requirements, it's important to consider those factors.

Example: An ATM Software has:
- Software: The program running on the ATM
- Hardware: The machine
- Context: The bank issues the transaction.
---
## Software Quality

Software 👾 runs on some hardware 💻 and is developed for a purpose 🏹 that is related to human activities.

Quality = f(software 👾, purpose 🏹)

**Identifying the Purpose = Defining Requirements.**

To identify the purposes is an extremely hard task?!
Because:
- Complexity
- People don't know what they want until they receive what they don't like
- Requirements change
- Many stakeholders with different opinion.

---
## The lack of Completeness and Pertinence
| Lack Completeness | Lack Pertinence |
| - | - |
|Identify all purpose of the system | Contains needed functionality but not technical details |

**Best Practices:** 
1. Stakeholders must read the requirements documents

# redefine(Requirement Engineering)
*Requirements Engineering (RE)* is a set of **activities** concerned with identifying and **communicating** the **purpose** of a software-intensive system and the context in which it will be used. Hence, RE is a bridge between the real-world **needs and the capabilities** offorded by software intensive technologies.

--- 
## What are requirements? 

Application Domain and Machine Domain.
Machine Domain:
- C - Computer
- P - Program

Application Domain:
- D - domain properties
- R - requirements

The intersection of 2 domains is known as S - specification written in terms of shared phenomena.

2 kinds of specifications' phenomena:
- Events in real world the machine can sense: Buttons being pushed.
- Actions in real world the machine can detect: Image appears on the screen and device being turned on and off.

---
## Functional and Non-Functional Requirements

| Functional | Non-functional |
| ---------- | -------------- |
| has to do with a functionality of a system. i.e. Systems must output square root of an input. | system non-functional quality. Sometimes, no clear metrics to measure the requirement. i.e. Elevator must operate really fast or no longer than 30 seconds. |

For non-functional: 
- meaning: "shall" or "should" 
- .i.e The WordCounter should be able to process long file or The Login program should be secure.

## User and System Requirements:

| User | System Requirements |
| ---- | ------------------- |
| written for customers| written for devs|
| natural language |  clearly and more rigorous. |
| | detailed functional and non-functional  |

## Where Requirements come from:
(also refer to <a name="trad_tech">Traditional techniques</a>)
- Stakeholders
- Application Domain
- Documentation provided

# Elicitation: Collect requirements from stakeholders

### Elicitation Problems

- Thin spread of domain knowledge. 
- Knowledge is often tacit: understood subliminally. Regularly used knowledge sometimes is neglect. 
- Limited observability
- Bias: people might provide a different pictures

[**Traditional techniques to elicit **](#trad_tech):
1. Background reading: read the background of the organization before elicitation. Documents are: Company report, job description,...
1. Hard data and Samples: Facts and figure, financial info, marketting... 
1. Interview: can be structured or open-ended. Interviews more like a conversation. 
1. Surveys: quickly collect info from a large group of people. Severely constraint, and might collect unforseen results.
1. Meetings: To CONFIRM all requirements collected.

Other techniques:
- Collaborative: Support incremental development of complex systems with large diverse group.
- Social approaches: collecting by observing clients.
- Cognitive techniques.

--- 
## Modelling
Decide on which aspect of requirements you want to focus. 

1. Modeling enterprises:
  * Goals and objectives
  * Organizational structure
  * Task and dependencies
  * Agents, roles, intentionality.
2. Modeling information and behaviors:
  * Information structure
  * Bahavioral view:
    * Scenarios and use cases
    * State machience Models
    * Sequence Diagrams
    * Information Flow
3. Time/Sequencing requirements

Modeling System Qualities (NFRs)

They can be complimentary but not mutually-exclusive. 

# Analyzing Requirements

1. Verification 
  * Check if they are correct, see if accurately reflect customer needs
  * The completeness of the requirement
  * Any missing pieces
  * Irrelevant info? 
2. Validation:
  * Assess if the requirement is what the stakeholders really want, they should read it. 
3. Risk analysis:
  * Identify the main risk of the development

### Prioritize:
Limited Resources (not time, money, man power) -> prioritize into classes:  
- Mandatory
- Nice to have
- Superfluous: might be in the next release 

# Steps:

1. Elicitation 
1. Negotation (not mentioned) 
1. Modeling
1. Analysis (and back to 1)

# SRS (Software Requirement Specifications)
Some projects require this.
THis is the way to communicate requirements to others. 

IEEE has a format:
1. Introduction: 
  - Purpose
  - Context
  - Objective
2. User requirements
3. ystems Requirements:
  - Functional and non-functional.

Requirement's Properties:
- Simple: each requirement should express one specific functionality the system has
- Testable with metrics: .i.e. the system should be fast is useless.
- Organized: 
  - related should be grouped
  - more abstract should further contain smaller
  - priority should be clear.
- Numbered (for traceability)