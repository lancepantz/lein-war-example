(defproject wartest "1.0.0-SNAPSHOT" 
  :description "FIXME: write" 
  :dependencies [[org.clojure/clojure "1.1.0"] 
                 [org.clojure/clojure-contrib "1.1.0"]
                 [compojure "0.4.0-SNAPSHOT"]
                 [ring/ring-servlet "0.2.0"]
                 [ring/ring-jetty-adapter "0.2.0"]]
  :dev-dependencies [[uk.org.alienscience/leiningen-war "0.0.2"]]
  :namespaces [servlet])
