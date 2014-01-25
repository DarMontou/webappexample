(defproject webappexample "0.1.0-SNAPSHOT"
  :description "Ring, Friend, Compojure, Enlive, Clojure Demo Web App"
  :url "http://"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :source-paths ["src/clj" "src/cljs"]
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojure/clojurescript "0.0-2138"]
                 [com.cemerick/piggieback "0.1.2"]
                 [ring "1.2.1"]  
                 [compojure "1.1.6" :exclusions [org.clojure/core.incubator]]
                 [enlive "1.1.5"]
                 [domina "1.0.2"]
                 [com.cemerick/friend "0.2.0"]
                 [org.clojure/tools.reader "0.8.3"]
                 [javax.servlet/servlet-api "2.5"]]
  :plugins [[com.cemerick/austin "0.1.3"]
            [lein-cljsbuild "1.0.1"]
            [lein-ring "0.8.10"]]

  :profiles {:dev {:repl-options {:init-ns webappexample.core}
                   :plugins []
                   :cljsbuild {:builds [{:source-paths ["src/cljs"]
                                         :compiler {:output-to "resources/public/scripts/app.js"
                                                    :optimizations :simple
                                                    :pretty-print true}}]}}}
  :main webappexample.core
  
  
  :ring {:handler webappexample.core/secured-site
         :init webappexample.core/-main
         :listener-class webappexample
         })
