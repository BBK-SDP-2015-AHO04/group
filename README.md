# group
Ray Tracer using AKKA actors

Notes:
The ray tracing engine seems to be faulty. Scene.shade method always returns **black**. This is caused by the if statement on line 144. This means that all the lights are ignore, and the resulting image is lit solely by ambience.
An attempt to re-engineer this was made, but resulted in purely flat colour, regardless of light position. We expect this is due to vector calculations on lights and camera etc.

Authors:
GROUP E
- mwest06
- ybogle01
- tvirno01
- aho04

Running:
- Clone repo and move to base folder
- Edit input.dat if necessary
- Run
```
$ scalac src/*.scala
$ scala -cp . Trace input.dat output.png
$ open output.png
``` 
