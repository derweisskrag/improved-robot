# Software Engineering Assignment 4

## SpringBoot Application 

I used the SpringBoot for this project.

### UI/UX

The client-side of this application is going to be plain HTML-CSS-JS powered by `mustache` library, which enable me to 
use Kotlin to dynamically render some components. 

Example:

```html
<h1>{{title}}</h1>
```

Kotlin passes `title` to the html component and renders it on the client side. In this app, I will not use the layout, 
because it would require more time to study how to create layout in SpringBoot. However, one possible solution is to 
leverage the power of NEXT.js framework and implement the server side using API routes. Here in Kotlin, we can process
the REST API routes (RestController). 

### Objectives and Methods

To complete the `Software Engineering homework assignment`, I have to automate two forms:

1. Google sing-up form.
2. My own form which also implements sign-up. 

The stack technologies is 

1. Selenium
2. Cucumber