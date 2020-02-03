Mindvalley_Challenge_Project
Challenge project for android position in the Mindvalley company

Evaluation Criteria for this Assignment:
Readability:
Class and method names should clearly show their intent and responsibility.

Maintainability:
“SOLID” Principles and design pattern. MVC model We want to see how you use and integrate 3rd party libraries

Scalability:
Your software should easily accommodate possible future requirement changes (example: if you are asked to change to xml-based api instead of json)

Testability:
Please Unit Test your classes. In our assignment, you can just test all non-UI classes.

Test Start:
Imagine you are on the Pinterest Android team and you are working with some colleagues on the pinboard (the scrolling wall of images), you split up the tasks among each other and your task is to create an image loading library that will be used to asynchronously download the images for the pins on the pinboard when they are needed. The library will also be useful for all other parts of the app where asynchronous remote image loading is required. The images are available on a publicly accessible URL (like a CDN). The library should be general purpose and not assume anything about the use case, the pinboard is an example but other parts of the app that show images will also use it (e.g. a user's profile pic on the profile screen).

One of your colleagues will also want to use the library for loading JSON documents, and you just know that your boss and colleagues will love your library so much that they will ask you to support other datatypes in the future as well, so your design should not limit support to a particular datatype.

The purpose of the library is to abstract the downloading and caching of remote resources (images, JSON, XML, etc.) so that client code can easily "swap" a URL for a Drawable, Map, etc. without worrying about any of the details. Resources which are reused often should not be continually re-downloaded and should be cached, but the library cannot use infinite memory.
