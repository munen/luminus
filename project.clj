(defproject luminus "0.1"
  :description "Documentation site for the Luminus framework"
  :url "http://www.luminusweb.net/"
  :license {:name "MIT License"
            :url "http://opensource.org/licenses/MIT"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/core.cache "0.6.4"]
                 [compojure "1.5.0"]
                 [ring-server "0.4.0"]
                 [markdown-clj "0.9.86"]
                 [clj-http "2.1.0"]
                 [crouton "0.1.2"]
                 [selmer "1.0.2"]]
  :min-lein-version "2.0.0"
  :plugins [[lein-ring "0.9.7"]]
  :profiles {:production
             {:ring
              {:open-browser? false
               :stacktraces? false
               :auto-reload? false}}}
  :ring {:handler luminus.handler/app
         :init luminus.handler/init})
