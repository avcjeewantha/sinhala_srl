# sinhala_srl

sinhala_srl is a semantic role labeler for the Sinhala language. This tool takes a Sinhala-Engish parallel sentence to output the Sinhala dependancy based semantically annotated sentence. The tool facilitates us to *automatically generate linguistic resources (such as treebanks or propbanks) for the Sinhala language*, using a method referred to as annotation projection or annotation transfer.

Below an example of an English (top) and Sinhala (bottom) sentence pair. English annotations are automatically projected onto the Sinhala sentence, labeling it with named entities, semantic roles, and PoS tags.

![alt text](https://github.com/avcjeewantha/semantic/blob/master/images/projection.png?raw=true)


### Getting Started

##### Dependencies
   - Java 8
   - Maven
 
##### Included Components

sinhala_srl contains all the components to execute annotation projection in a set of simple, lightweight Java methods. It includes:

  1. *Syntactic and Semantic Parsers:* We wrap open source libraries such as StanfordNLP, ANNA, and Mate, so that syntactic parsing and semantic role labeling can be easily executed for Sinhala languages.
  2. *Word Alignment:* We use dictionary data for word alignment.
  3. *Annotation Transfer:* We provide an implementation of annotation transfer for a range of linguistic annotation, including part-of-speech tags, named entities, typed dependencies, and semantic roles.

 
##### Abstract architecture of the sinhala_srl tool

![alt text](https://github.com/avcjeewantha/semantic/blob/master/images/architecture.png?raw=true)


### Usage

##### Run sinhala_srl tool

- Host both services in the "additional tool" folder in the cloud environment
- Add sentences into the input files test.en and test.si
- Change the serverAddress in config.properties file according to the server IP
- Run the Project
