# WebAppExample

Web-application example project using:

* [Clojure](http://clojure.org/)
* [Ring](https://github.com/ring-clojure/ring/wiki)
* [Friend](https://github.com/cemerick/friend)
* [Compojure](https://github.com/weavejester/compojure/wiki)
* [Bootstrap](http://getbootstrap.com/getting-started/ )
* [Enlive](https://github.com/cgrand/enlive/wiki/_pages)

The focus of this project is to demonstrate the friend authentication
tools in a somewhat robust manner. The application may serve as a good
starting point for new clojure based web applications which require
user authentication.

## Project Presentations

[![](https://github.com/DarMontou/webappexample/raw/master/docs/friend_presentation.png)](http://goo.gl/XxclMQ)

[![](https://github.com/DarMontou/webappexample/raw/master/docs/enlive_presentation.png)](http://goo.gl/01E09j)

## Installation

Clone the repo using the URL in the side bar.

## Usage

Server (for a quick demo):

```
    $ cd webappexample
        
    webappexample$ lein ring server

```

Clojure REPL: see https://github.com/clojure-emacs/cider

ClojureScript REPL: see Austin REPL below.

## Austin REPL - more on this coming soon...

```
[webappexample]$ lein do cljsbuild once, repl

Compiling ClojureScript.
nREPL server started on port 54378
REPL-y 0.2.0
Clojure 1.5.1
    Docs: (doc function-name-here)
          (find-doc "part-of-name-here")
  Source: (source function-name-here)
 Javadoc: (javadoc java-object-or-class-here)
    Exit: Control+D or (exit) or (quit)

webappexample.core=> (-main)

2013-11-01 11:41:01.248:INFO:oejs.Server:jetty-7.6.8.v20121106
2013-11-01 11:41:01.313:INFO:oejs.AbstractConnector:Started SelectChannelConnector@0.0.0.0:8080
<Server org.eclipse.jetty.server.Server@2dc663a3>

webappexample.core=> (def repl-env (reset! cemerick.austin.repls/browser-repl-env (cemerick.austin/repl-env)))

Browser-REPL ready @ http://localhost:47423/821/repl/start
'webappexample.bcrepl/repl-env

webappexample.core=> (cemerick.austin.repls/cljs-repl repl-env)
Type `:cljs/quit` to stop the ClojureScript REPL
nil

Navigate to app like http://localhost:8080

cljs.user=> (js/alert "Salut!")
nil

Enjoy ;)
```

## 

Many thanks to Norman Richards for helping with this.

### Like this project?

Please follow me on GitHub and/or Twitter (@DarMontou). Please let me
know if you'd like to see any specific enhancements. 

## License

Copyright © 2014 Dar Montou

Distributed under the Eclipse Public License, the same as Clojure.
