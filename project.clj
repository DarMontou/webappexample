(defproject webappexample "0.1.0-SNAPSHOT"
  :description "Ring, Friend, Compojure, Enlive, Clojure Demo Web App"
  :url "http://"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :source-paths ["src/clj" "src/cljs"]
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojure/clojurescript "0.0-1978"]
                 [com.cemerick/piggieback "0.1.0"]
                 [ring "1.2.1"]                
                 [compojure "1.1.6"]
                 [enlive "1.1.5"]
                 [domina "1.0.2"]
                 [com.cemerick/friend "0.2.0"]]
  
  :resource-paths ["target/classes/public"]

  :profiles {:dev {:repl-options {:init-ns webappexample.core}
                   :plugins [[com.cemerick/austin "0.1.1"]
                             [lein-cljsbuild "0.3.4"]
                             [lein-ring "0.8.8"]]
                   :cljsbuild {:builds [{:source-paths ["src/cljs"]
                                         :compiler {:output-to "target/classes/public/scripts/app.js"
                                                    :optimizations :simple
                                                    :pretty-print true}}]}}}
  :ring {:handler webappexample.core/secured-site
         :init webappexample.core/run})
