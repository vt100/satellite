(defproject satellite "0.1.0-SNAPSHOT"
  :description "Monitoring and alerting for Mesos"
  :url "http://github.com/twosigma/satellite"
  :license {:name "Apache License, Version 2.0"
            :url "http://opensource.org/licenses/apache2.0.php"}
  :dependencies [[cc.qbits/jet "0.5.4"]
                 [cheshire "5.3.1"]
                 [clj-http "0.9.2"]
                 [clj-logging-config "1.9.12"]
                 [com.cemerick/url "0.1.1"]
                 [com.novemberain/welle "3.0.0"]
                 [compojure "1.1.6"]
                 [jarohen/chime "0.1.6"]
                 [liberator "0.12.2"]
                 [ring/ring "1.2.1"]
                 [ring/ring-core "1.3.2"]
                 [ring/ring-json "0.3.1"
                  :exclusions [ring/ring-core]]
                 [org.apache.curator/curator-framework "2.6.0"
                  :exclusions [io.netty/netty]]
                 [org.apache.curator/curator-recipes "2.6.0"
                  :exclusions [io.netty/netty]]
                 [org.apache.curator/curator-test "2.6.0"
                  :exclusions [io.netty/netty]]
                 [org.clojure/core.async "0.1.346.0-17112a-alpha"]
                 [org.clojure/clojure "1.6.0"]
                 [org.clojure/tools.cli "0.3.1"]
                 [org.slf4j/slf4j-log4j12 "1.7.7"
                  :exclusions [log4j]]
                 [prismatic/plumbing "0.3.3"]
                 [riemann "0.2.7"]]
  :aot [satellite.core]
  :main satellite.core
  :aliases {"release-jar" ["do" "clean," "uberjar"]})
